package cn.ldu.waterserver.waterserver.entity;

public class ScheduledTasks {
    private String user_code;
    private String user_name;
    private String water_meter_number;
    private String operation_type;
    private String execution_status;
    private int execution_count;
    private String created_at;
    private String execution_time;


    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getWater_meter_number() {
        return water_meter_number;
    }

    public void setWater_meter_number(String water_meter_number) {
        this.water_meter_number = water_meter_number;
    }

    public String getOperation_type() {
        return operation_type;
    }

    public void setOperation_type(String operation_type) {
        this.operation_type = operation_type;
    }

    public String getExecution_status() {
        return execution_status;
    }

    public void setExecution_status(String execution_status) {
        this.execution_status = execution_status;
    }

    public int getExecution_count() {
        return execution_count;
    }

    public void setExecution_count(int execution_count) {
        this.execution_count = execution_count;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getExecution_time() {
        return execution_time;
    }

    public void setExecution_time(String execution_time) {
        this.execution_time = execution_time;
    }
}
