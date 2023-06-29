package cn.ldu.waterserver.waterserver.service;

import cn.ldu.waterserver.waterserver.entity.HistoricalTranscription;

import java.util.List;

public interface IHistoricalTranscriptionService {
    List<HistoricalTranscription> queryHistoricalTranscription(String address, String device_code, String user_code, String username, String start_time, String end_time, int page, int page_count);

    int getCount(String address, String device_code, String user_code, String username, String start_time, String end_time);
}
