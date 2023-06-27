package cn.ldu.waterserver.waterserver.service.impl;

import cn.ldu.waterserver.waterserver.dao.IScheduledTasksDao;
import cn.ldu.waterserver.waterserver.entity.ScheduledTasks;
import cn.ldu.waterserver.waterserver.service.IScheduledTasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ScheduledTasksServiceImpl implements IScheduledTasksService {

    @Autowired
    private IScheduledTasksDao dao;

    @Override
    public List<ScheduledTasks> queryScheduledTasks(String water_meter_number, int page, int page_count) {
        return dao.queryScheduledTasks(water_meter_number,page,page_count);
    }
}
