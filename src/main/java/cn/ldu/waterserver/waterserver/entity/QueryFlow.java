package cn.ldu.waterserver.waterserver.entity;

public class QueryFlow {
    private Integer region_id;
    private String username;
    private String house_number;
    private String device_code;
    private Float balance;
    private String status;
    private Float settle_flow;
    private Float total_flow;
    private Float last_month_flow;
    private String created_at;
    private String flow_chart_url;

    public Integer getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Integer region_id) {
        this.region_id = region_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHouse_number() {
        return house_number;
    }

    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }

    public String getDevice_code() {
        return device_code;
    }

    public void setDevice_code(String device_code) {
        this.device_code = device_code;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getSettle_flow() {
        return settle_flow;
    }

    public void setSettle_flow(Float settle_flow) {
        this.settle_flow = settle_flow;
    }

    public Float getTotal_flow() {
        return total_flow;
    }

    public void setTotal_flow(Float total_flow) {
        this.total_flow = total_flow;
    }

    public Float getLast_month_flow() {
        return last_month_flow;
    }

    public void setLast_month_flow(Float last_month_flow) {
        this.last_month_flow = last_month_flow;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getFlow_chart_url() {
        return flow_chart_url;
    }

    public void setFlow_chart_url(String flow_chart_url) {
        this.flow_chart_url = flow_chart_url;
    }
}
