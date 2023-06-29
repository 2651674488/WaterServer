package cn.ldu.waterserver.waterserver.dao.impl;

import cn.ldu.waterserver.waterserver.dao.IHistoricalPaymentDao;
import cn.ldu.waterserver.waterserver.entity.HistoricalPayment;
import cn.ldu.waterserver.waterserver.entity.HistoricalTranscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class HistoricalPaymentDaoImpl implements IHistoricalPaymentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<HistoricalPayment> queryHistoricalPaymentDao(String address, String device_code, String user_code, String username, String start_time, String end_time, int page, int page_count) {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT user_name,device_code,user_code,address,user_type,price_mode,payment_method,account_balance,amount_recharged,surplus_balance,recharge_status,collected_at\n" +
                "FROM device_info\n");
        if(address != null || device_code != null || user_code != null || username != null || start_time != null || end_time != null){
            sql.append("WHERE 1 = 1");
            if(address != null){sql.append(" and address LIKE '%" + address + "%'");}
            if(username != null){sql.append(" and user_name LIKE '%" + username + "%'");}
            if(device_code != null){sql.append(" and device_code LIKE '%" + device_code + "%'");}
            if(user_code != null){sql.append(" and user_code LIKE '%" + user_code + "%'");}
            if(start_time != null){sql.append(" and "+start_time+" < collected_at ");}
            if (end_time != null){sql.append(" and "+end_time+" > collected_at");}

        }
        sql.append("LIMIT " + (page - 1) * page_count  + "," + page_count + ";");
        List<HistoricalPayment> list = jdbcTemplate.query(sql.toString(),new BeanPropertyRowMapper<>(HistoricalPayment.class));
        return list;
    }

    @Override
    public int getCount(String address, String device_code, String user_code, String username, String start_time, String end_time) {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT count(*) \n" +
                "FROM device_info\n");
        if(address != null || device_code != null || user_code != null || username != null || start_time != null || end_time != null){
            sql.append("WHERE 1 = 1");
            if(address != null){sql.append(" and address LIKE '%" + address + "%'");}
            if(username != null){sql.append(" and user_name LIKE '%" + username + "%'");}
            if(device_code != null){sql.append(" and device_code LIKE '%" + device_code + "%'");}
            if(user_code != null){sql.append(" and user_code LIKE '%" + user_code + "%'");}
            if(start_time != null){sql.append(" and "+start_time+" < collected_at ");}
            if (end_time != null){sql.append(" and "+end_time+" > collected_at");}

        }
        int cnt = jdbcTemplate.queryForObject(sql.toString(), Integer.class);
        return cnt;
    }
}
