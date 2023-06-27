package cn.ldu.waterserver.waterserver.service;

import cn.ldu.waterserver.waterserver.entity.TestEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ITestService {

    List<TestEntity> getAll(int cnt);
}
