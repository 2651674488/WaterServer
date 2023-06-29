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
    public List<ExpenseInquiry> queryExpenseInquiry(Integer region_id,String user_name,String user_code, int page, int page_count) {
        return dao.expenseInquiry(region_id,user_name,user_code,page,page_count);
    }

    @Override
    public int getCount(Integer region_id,String user_name,String user_code) {
        return dao.getCount(region_id,user_name,user_code);
    }
}
