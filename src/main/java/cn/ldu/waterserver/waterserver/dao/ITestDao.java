package cn.ldu.waterserver.waterserver.dao;

import cn.ldu.waterserver.waterserver.entity.TestEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ITestDao {
    List<TestEntity> getAll(int cnt);
}
