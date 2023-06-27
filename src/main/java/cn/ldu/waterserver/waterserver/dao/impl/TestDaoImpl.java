package cn.ldu.waterserver.waterserver.dao.impl;

import cn.ldu.waterserver.waterserver.dao.ITestDao;
import cn.ldu.waterserver.waterserver.entity.TestEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TestDaoImpl implements ITestDao {

    @Override
    public List<TestEntity> getAll(int cnt) {
        List<TestEntity> tnList = new ArrayList<>();
        for(int i = 0; i < cnt; i++){
            TestEntity tn = new TestEntity();
            tn.setId(i + 100);
            tn.setName("Fish" + i);
            tn.setAge(20 - i);
            tnList.add(tn);
        }
        return tnList;
    }
}
