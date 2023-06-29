package cn.ldu.waterserver.waterserver.dao;

import cn.ldu.waterserver.waterserver.entity.ScheduledTasks;

import java.util.List;

public interface IScheduledTasksDao {
    List<ScheduledTasks> queryScheduledTasks(String water_meter_number,int page, int page_count);

    int getCount(String water_meter_number);
}
