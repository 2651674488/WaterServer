package cn.ldu.waterserver.waterserver.dao;

import cn.ldu.waterserver.waterserver.entity.HistoricalPayment;

import java.util.List;

public interface IHistoricalPaymentDao {
    List<HistoricalPayment> queryHistoricalPaymentDao(String address,String device_code,String user_code,String username,String start_time,String end_time,int page,int page_count);
}
