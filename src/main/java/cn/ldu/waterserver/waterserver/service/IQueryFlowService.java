package cn.ldu.waterserver.waterserver.service;

import cn.ldu.waterserver.waterserver.entity.QueryFlow;

import java.util.List;

//流水查询
public interface IQueryFlowService {
    List<QueryFlow> queryFlowService(Integer region_id, String device_code,int page,int page_count);

    int queryCount(Integer region_id, String device_code);
}
