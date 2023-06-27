package cn.ldu.waterserver.waterserver.dao.impl;

import cn.ldu.waterserver.waterserver.dao.IOperationLogDao;
import cn.ldu.waterserver.waterserver.entity.OperationLog;
import cn.ldu.waterserver.waterserver.entity.QueryFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class OperationLogDaoImpl implements IOperationLogDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<OperationLog> queryOperationLog(String operation_type, int page, int page_count) {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT ai.log_type, di.device_code, ai.operator, ai.operation_time, ai.ip_address \n" +
                "FROM account_info ai \n" +
                "LEFT JOIN user_info ui ON ai.user_id = ui.id \n" +
                "LEFT JOIN device_info di ON ai.device_code = di.device_code \n"
                );
        if(operation_type != null){ sql.append("WHERE di.operation_type LIKE \n").append("'%" + operation_type + "%'");}
        sql.append("LIMIT " + (page - 1) * page_count  + "," + page_count + ";");

        List<OperationLog> list = jdbcTemplate.query(sql.toString(),new BeanPropertyRowMapper<>(OperationLog.class));
        return list;
    }
}
