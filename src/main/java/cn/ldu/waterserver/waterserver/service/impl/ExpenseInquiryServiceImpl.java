package cn.ldu.waterserver.waterserver.service.impl;

import cn.ldu.waterserver.waterserver.dao.IExpenseInquiryDao;
import cn.ldu.waterserver.waterserver.entity.ExpenseInquiry;
import cn.ldu.waterserver.waterserver.service.IExpenseInquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseInquiryServiceImpl implements IExpenseInquiryService {

    @Autowired
    private IExpenseInquiryDao dao;

    @Override
    public List<ExpenseInquiry> queryExpenseInquiry(Integer region_id,String device_code, int page, int page_count) {
        return dao.expenseInquiry(region_id,device_code,page,page_count);
    }
}
