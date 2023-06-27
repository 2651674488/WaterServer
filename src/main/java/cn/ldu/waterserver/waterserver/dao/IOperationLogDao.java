package cn.ldu.waterserver.waterserver.dao;

import cn.ldu.waterserver.waterserver.entity.OperationLog;

import java.util.List;

public interface IOperationLogDao {
    List<OperationLog> queryOperationLog(String operation_type, int page, int page_count);
}
