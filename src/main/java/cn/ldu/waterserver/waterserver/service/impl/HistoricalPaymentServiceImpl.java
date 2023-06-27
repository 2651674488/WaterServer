package cn.ldu.waterserver.waterserver.service.impl;

import cn.ldu.waterserver.waterserver.dao.IExpenseInquiryDao;
import cn.ldu.waterserver.waterserver.dao.IHistoricalPaymentDao;
import cn.ldu.waterserver.waterserver.entity.HistoricalPayment;
import cn.ldu.waterserver.waterserver.service.IExpenseInquiryService;
import cn.ldu.waterserver.waterserver.service.IHistoricalPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class HistoricalPaymentServiceImpl implements IHistoricalPaymentService {
    @Autowired
    private IHistoricalPaymentDao dao;

    @Override
    public List<HistoricalPayment> queryHistoricalPaymentService(String address, String device_code, String user_code, String username, String start_time, String end_time, int page, int page_count) {
        return dao.queryHistoricalPaymentDao(address,device_code,user_code,username,start_time,end_time,page,page_count);
    }
}
