package cn.ldu.waterserver.waterserver.dao.impl;

import cn.ldu.waterserver.waterserver.dao.IScheduledTasksDao;
import cn.ldu.waterserver.waterserver.entity.ExpenseInquiry;
import cn.ldu.waterserver.waterserver.entity.ScheduledTasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ScheduledTasksDaoImpl implements IScheduledTasksDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<ScheduledTasks> queryScheduledTasks(String water_meter_number, int page, int page_count) {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT user_code, user_name, water_meter_number, operation_type, execution_status, \n" +
                "       execution_count, created_at, execution_time\n" +
                "FROM device_info\n"
                );
        if (water_meter_number != null){sql.append("WHERE water_meter_number LIKE \n").append("'%" + water_meter_number + "%'");}
        sql.append("LIMIT " + (page - 1) * page_count  + "," + page_count + ";");
        List<ScheduledTasks> list = jdbcTemplate.query(sql.toString(),new BeanPropertyRowMapper<>(ScheduledTasks.class));
        return list;
    }
}
