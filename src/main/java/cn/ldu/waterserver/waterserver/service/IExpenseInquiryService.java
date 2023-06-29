package cn.ldu.waterserver.waterserver.service;

import cn.ldu.waterserver.waterserver.entity.ExpenseInquiry;

import java.util.List;

public interface IExpenseInquiryService {
    List<ExpenseInquiry> queryExpenseInquiry(Integer region_id,String user_name,String user_code,int page,int page_count);

    int getCount(Integer region_id,String user_name,String user_code);
}
