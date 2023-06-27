package cn.ldu.waterserver.waterserver.dao;

import cn.ldu.waterserver.waterserver.entity.QueryFlow;

import java.util.List;

public interface IQueryFlowDao {
    List<QueryFlow> queryFlow(Integer region_id,String device_code,int page,int page_count);
}
