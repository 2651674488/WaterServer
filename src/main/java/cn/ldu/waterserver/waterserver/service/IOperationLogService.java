package cn.ldu.waterserver.waterserver.service;

import cn.ldu.waterserver.waterserver.entity.OperationLog;

import java.util.List;

public interface IOperationLogService {
    List<OperationLog> queryOperationLog(String operation_type, int page, int page_count);

    int getCount(String operation_type);
}
