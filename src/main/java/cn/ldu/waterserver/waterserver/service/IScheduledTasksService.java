package cn.ldu.waterserver.waterserver.service;

import cn.ldu.waterserver.waterserver.entity.ScheduledTasks;

import java.util.List;

public interface IScheduledTasksService {
    List<ScheduledTasks> queryScheduledTasks(String water_meter_number,int page, int page_count);
}
