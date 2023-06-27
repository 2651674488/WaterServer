package cn.ldu.waterserver.waterserver.controller;

import cn.ldu.waterserver.waterserver.bean.NormalResponse;
import cn.ldu.waterserver.waterserver.entity.TestEntity;
import cn.ldu.waterserver.waterserver.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestContoller {

    @Autowired
    private ITestService service;

    @GetMapping("/tsct")
    public NormalResponse<TestEntity> handleTsct(int cnt){
        List<TestEntity> entities = service.getAll(cnt);
        NormalResponse<TestEntity> res = new NormalResponse<>();
        res.setData(entities);
        res.setTotal(9999);
        return res;
    }
}
