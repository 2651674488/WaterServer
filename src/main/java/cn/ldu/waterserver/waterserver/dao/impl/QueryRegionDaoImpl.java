package cn.ldu.waterserver.waterserver.dao.impl;

import cn.ldu.waterserver.waterserver.dao.IQueryRegionDao;
import cn.ldu.waterserver.waterserver.entity.City;
import cn.ldu.waterserver.waterserver.entity.Province;
import cn.ldu.waterserver.waterserver.entity.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class QueryRegionDaoImpl implements IQueryRegionDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Region> queryAllRgeionDao() {
//        StringBuffer sql = new StringBuffer();
        String sql = "SELECT province_name,province_id\n" +
                "FROM province;\n";
        List<Province> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Province.class));
        List<Region> regionList = new ArrayList<>();
        for (Province item : list){
            Region region = new Region();
            region.setId(item.getProvince_id());
            region.setName(item.getProvince_name());
            int province_id = item.getProvince_id();

            StringBuffer sql2 = new StringBuffer();
            sql2.append("select city_name,city_id from city where province_id = " + province_id);
            List<City> cityList = jdbcTemplate.query(sql2.toString(),new BeanPropertyRowMapper<>(City.class));

            List<Region> childrenOfPrivinceList = new ArrayList<>();
            for (City city : cityList){
                Region cityRegion = new Region();
                cityRegion.setId(Integer.parseInt(city.getCity_id()));
                cityRegion.setName(city.getCity_name());
                cityRegion.setChildren(null);
                childrenOfPrivinceList.add(cityRegion);
            }
            region.setChildren(childrenOfPrivinceList);
            regionList.add(region);
        }

        return regionList;
    }
}
