package cn.ldu.waterserver.waterserver.service.impl;

import cn.ldu.waterserver.waterserver.dao.IQueryFlowDao;
import cn.ldu.waterserver.waterserver.entity.QueryFlow;
import cn.ldu.waterserver.waterserver.service.IQueryFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryFlowServiceImpl implements IQueryFlowService {

    @Autowired
    private IQueryFlowDao dao;

    @Override
    public List<QueryFlow> queryFlowService(Integer region_id,String device_code, int page, int page_count) {
        return dao.queryFlow(region_id,device_code,page,page_count);
    }
}
