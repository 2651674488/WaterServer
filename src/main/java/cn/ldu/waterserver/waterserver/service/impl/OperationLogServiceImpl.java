package cn.ldu.waterserver.waterserver.service.impl;

import cn.ldu.waterserver.waterserver.dao.IOperationLogDao;
import cn.ldu.waterserver.waterserver.entity.OperationLog;
import cn.ldu.waterserver.waterserver.service.IOperationLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OperationLogServiceImpl implements IOperationLogService {

    @Autowired
    private IOperationLogDao dao;
    @Override
    public List<OperationLog> queryOperationLog(String operation_type, int page, int page_count) {
        return dao.queryOperationLog(operation_type,page,page_count);
    }

    @Override
    public int getCount(String operation_type) {
        return dao.getCount(operation_type);
    }
}
