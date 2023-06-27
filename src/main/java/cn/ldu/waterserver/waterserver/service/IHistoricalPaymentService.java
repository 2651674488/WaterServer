package cn.ldu.waterserver.waterserver.service;

import cn.ldu.waterserver.waterserver.entity.HistoricalPayment;

import java.util.List;

public interface IHistoricalPaymentService {
    List<HistoricalPayment> queryHistoricalPaymentService(String address,String device_code,String user_code,String username,String start_time,String end_time,int page,int page_count);
}
