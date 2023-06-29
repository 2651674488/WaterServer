package cn.ldu.waterserver.waterserver.dao.impl;

import cn.ldu.waterserver.waterserver.dao.IExpenseInquiryDao;
import cn.ldu.waterserver.waterserver.entity.ExpenseInquiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ExpenseInquiryDaoImpl implements IExpenseInquiryDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<ExpenseInquiry> expenseInquiry(Integer region_id,String user_name,String user_code,int page,int page_count) {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT ui.username, di.user_code, ai.phone_number, di.account_balance, ai.consumed_amount, ai.arrears_balance, ai.last_billing_date \n" +
                "FROM user_info ui \n" +
                "LEFT JOIN device_info di ON ui.id = di.user_id \n" +
                "LEFT JOIN account_info ai ON ui.id = ai.user_id\n" +
                "LEFT JOIN city ci ON ui.city = ci.city_name"
                );
        if(user_name != null || region_id != null || user_code != null){
            sql.append(" WHERE  1 = 1 ");
            if(user_name != null){
                sql.append(" and ui.username LIKE'%" + user_name + "%'");
            }
            if (region_id != null){
                sql.append(" and ci.city_id = " + region_id);
            }
            if (user_code != null){sql.append(" and di.user_code LIKE'%" + user_code + "%'");}
        }
        sql.append(" LIMIT " + (page - 1) * page_count  + "," + page_count + ";");
        List<ExpenseInquiry> list = jdbcTemplate.query(sql.toString(),new BeanPropertyRowMapper<>(ExpenseInquiry.class));
        for (ExpenseInquiry item : list){
            item.setRegion_id(region_id);
        }
        return list;
    }

    public int getCount(Integer region_id,String user_name,String user_code){
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT count(*) \n" +
                "FROM user_info ui \n" +
                "LEFT JOIN device_info di ON ui.id = di.user_id \n" +
                "LEFT JOIN account_info ai ON ui.id = ai.user_id\n" +
                "LEFT JOIN city ci ON ui.city = ci.city_name"
        );
        if(user_name != null || region_id != null || user_code != null){
            sql.append(" WHERE  1 = 1 ");
            if(user_name != null){
                sql.append(" and ui.username LIKE'%" + user_name + "%'");
            }
            if (region_id != null){
                sql.append(" and ci.city_id = " + region_id);
            }
            if (user_code != null){sql.append(" and di.user_code LIKE'%" + user_code + "%'");}
        }
        int cnt = jdbcTemplate.queryForObject(sql.toString(), Integer.class);
        return cnt;
    }

}
