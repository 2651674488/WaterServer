package cn.ldu.waterserver.waterserver.dao.impl;

import cn.ldu.waterserver.waterserver.dao.IQueryFlowDao;
import cn.ldu.waterserver.waterserver.entity.ExpenseInquiry;
import cn.ldu.waterserver.waterserver.entity.QueryFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QueryFlowDaoImpl implements IQueryFlowDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<QueryFlow> queryFlow(Integer region_id,String device_code, int page, int page_count) {
        StringBuffer sql = new StringBuffer();
        sql.append("SELECT ci.city_id, ui.username, ui.house_number, ui.device_code, ui.balance, ui.status, fi.settle_flow, fi.total_flow, fi.last_month_flow, fi.created_at, fi.flow_chart_url \n" +
                "FROM user_info ui\n" +
                "LEFT JOIN flow_info fi ON ui.id = fi.user_id \n"+
                        "LEFT JOIN city ci ON ui.city = ci.city_name \n"
                );
        if (device_code != null || region_id != null){
            sql.append("WHERE 1=1 ");
            if(device_code != null){ sql.append("and ui.device_code LIKE \n").append("'%" + device_code + "%'");}
            if (region_id != null){
                sql.append(" and ci.city_id = "+ region_id);
            }
        }
        sql.append(" LIMIT " + (page - 1) * page_count  + "," + page_count + ";");
        List<QueryFlow> list = jdbcTemplate.query(sql.toString(),new BeanPropertyRowMapper<>(QueryFlow.class));
        for (QueryFlow item : list){
            item.setRegion_id(region_id);
        }
        return list;
    }
}
