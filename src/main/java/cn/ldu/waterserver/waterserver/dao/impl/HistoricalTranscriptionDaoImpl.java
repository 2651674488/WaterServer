package cn.ldu.waterserver.waterserver.dao.impl;

import cn.ldu.waterserver.waterserver.dao.IHistoricalTranscriptionDao;
import cn.ldu.waterserver.waterserver.entity.ExpenseInquiry;
import cn.ldu.waterserver.waterserver.entity.HistoricalTranscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class HistoricalTranscriptionDaoImpl implements IHistoricalTranscriptionDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<HistoricalTranscription> queryHistoricalTranscription(String address, String device_code, String user_code, String username, String start_time, String end_time, int page, int page_count) {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT ui.username,ui.house_number,ui.device_code,fi.settle_flow,fi.total_flow,fi.last_month_flow,ui.balance,di.battery_voltage,di.status,di.collected_at,di.latest_31_day_usage\n" +
                "\n" +
                "FROM user_info ui \n" +
                "LEFT JOIN device_info di ON ui.id = di.user_id \n" +
                "LEFT JOIN flow_info fi ON ui.id = fi.user_id\n");
        if(address != null || device_code != null || user_code != null || username != null || start_time != null || end_time != null){
            sql.append("WHERE 1 = 1");
            if(address != null){sql.append(" and di.address LIKE %" + address + "%");}
            if(username != null){sql.append(" and di.username LIKE %" + username + "%");}
            if(device_code != null){sql.append(" and di.device_code LIKE %" + device_code + "%");}
            if(user_code != null){sql.append(" and di.user_code LIKE %" + user_code + "%");}
            if(start_time != null){sql.append(" and "+start_time+" < di.collected_at ");}
            if (end_time != null){sql.append(" and "+end_time+" > di.collected_at");}

        }
        sql.append("LIMIT " + (page - 1) * page_count  + "," + page_count + ";");
        List<HistoricalTranscription> list = jdbcTemplate.query(sql.toString(),new BeanPropertyRowMapper<>(HistoricalTranscription.class));
        return list;
    }
}
