package cn.ldu.waterserver.waterserver.service.impl;

import cn.ldu.waterserver.waterserver.dao.ITestDao;
import cn.ldu.waterserver.waterserver.dao.impl.TestDaoImpl;
import cn.ldu.waterserver.waterserver.entity.TestEntity;
import cn.ldu.waterserver.waterserver.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private ITestDao dao;

    @Override
    public List<TestEntity> getAll(int cnt) {
        return dao.getAll(cnt);
    }
}
