package cn.ldu.waterserver.waterserver.controller;

import cn.ldu.waterserver.waterserver.bean.NormalResponse;
import cn.ldu.waterserver.waterserver.bean.RegionResponse;
import cn.ldu.waterserver.waterserver.dao.IQueryRegionDao;
import cn.ldu.waterserver.waterserver.entity.*;
import cn.ldu.waterserver.waterserver.service.*;
import cn.ldu.waterserver.waterserver.service.impl.QueryFlowServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QueryController {
    @Autowired
    private IQueryRegionDao queryRegionDao;
    @Autowired
    private IExpenseInquiryService expenseInquiryService;
    @Autowired
    private IHistoricalTranscriptionService historicalTranscriptionService;
    @Autowired
    private IHistoricalPaymentService historicalPaymentService;
    @Autowired
    private IOperationLogService operationLogService;
    @Autowired
    private IQueryFlowService queryFlowService;
    @Autowired
    private IScheduledTasksService scheduledTasksService;

//    @GetMapping("/test")
//    public String test() {
//        return "Hello World!";
//    }
    //区域查询
    @GetMapping("/region")
    public RegionResponse<Region> queryRegion(){
        List<Region> list = queryRegionDao.queryAllRgeionDao();
        RegionResponse<Region> res = new RegionResponse<>();
        res.setData(list);
        return res;
    }
    //费用查询
    @GetMapping("/cost")
    public NormalResponse<ExpenseInquiry> queryExpenseInquiry(Integer region_id,String user_name,String user_code,int page,int page_count){
        List<ExpenseInquiry> entity = expenseInquiryService.queryExpenseInquiry(region_id,user_name,user_code,page,page_count);
        NormalResponse<ExpenseInquiry> res = new NormalResponse<>();
        res.setData(entity);
        res.setTotal(expenseInquiryService.getCount(region_id,user_name,user_code));
        return res;
    }
    //查询流水
    @GetMapping("/flow")
    public NormalResponse<QueryFlow> queryFlow(Integer region_id,String device_code,int page,int page_count){
        System.out.println("region_id = " + region_id);
        List<QueryFlow> entity = queryFlowService.queryFlowService(region_id,device_code,page,page_count);
        NormalResponse<QueryFlow> res = new NormalResponse<>();
        res.setData(entity);
        res.setTotal(queryFlowService.queryCount(region_id,device_code));
        return res;
    }
    //操作日志
    @GetMapping("/opt")
    public NormalResponse<OperationLog> queryOperationLog(String opt_type, int page, int page_count){
        List<OperationLog> entity = operationLogService.queryOperationLog(opt_type,page,page_count);
        NormalResponse<OperationLog> res = new NormalResponse<>();
        res.setData(entity);
        res.setTotal(operationLogService.getCount(opt_type));
        return res;
    }
    //定时任务
    @GetMapping("/schedule")
    public NormalResponse<ScheduledTasks> queryScheduledTasks(String watcher_num,int page, int page_count){
        List<ScheduledTasks> entity = scheduledTasksService.queryScheduledTasks(watcher_num,page,page_count);
        NormalResponse<ScheduledTasks> res = new NormalResponse<>();
        res.setData(entity);
        res.setTotal(scheduledTasksService.getCount(watcher_num));
        return res;
    }
    //历史抄收
    @GetMapping("/trans")
    public NormalResponse<HistoricalTranscription> queryHistoricalTranscription(String address,String device_code,String user_code,String username,String start_time,String end_time,int page,int page_count){
        List<HistoricalTranscription> entity = historicalTranscriptionService.queryHistoricalTranscription(address,device_code,user_code,username,start_time,end_time,page,page_count);
        NormalResponse<HistoricalTranscription> res = new NormalResponse<>();
        res.setData(entity);
        res.setTotal(historicalTranscriptionService.getCount(address,device_code,user_code,username,start_time,end_time));
        return res;
    }
    //历史缴费
    @GetMapping("/hispay")
    public NormalResponse<HistoricalPayment> queryHistoricalPayment(String address,String device_code,String user_code,String username,String start_time,String end_time,int page,int page_count){
        List<HistoricalPayment> entity = historicalPaymentService.queryHistoricalPaymentService(address,device_code,user_code,username,start_time,end_time,page,page_count);
        NormalResponse<HistoricalPayment> res = new NormalResponse<>();
        res.setData(entity);
        res.setTotal(historicalPaymentService.getCount(address,device_code,user_code,username,start_time,end_time));
        return res;
    }
}

