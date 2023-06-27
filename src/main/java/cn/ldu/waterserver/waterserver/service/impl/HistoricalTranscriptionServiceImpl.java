package cn.ldu.waterserver.waterserver.service.impl;

import cn.ldu.waterserver.waterserver.dao.IHistoricalTranscriptionDao;
import cn.ldu.waterserver.waterserver.entity.HistoricalTranscription;
import cn.ldu.waterserver.waterserver.service.IHistoricalTranscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HistoricalTranscriptionServiceImpl implements IHistoricalTranscriptionService {

    @Autowired
    private IHistoricalTranscriptionDao dao;

    @Override
    public List<HistoricalTranscription> queryHistoricalTranscription(String address, String device_code, String user_code, String username, String start_time, String end_time, int page, int page_count) {
        return dao.queryHistoricalTranscription(address,device_code,user_code,username,start_time,end_time,page,page_count);
    }
}
