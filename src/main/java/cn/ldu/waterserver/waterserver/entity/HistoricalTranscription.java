package cn.ldu.waterserver.waterserver.entity;

public class HistoricalTranscription {
    private String username;
    private String house_number;
    private String device_code;
    private float settle_flow;
    private float total_flow;
    private float last_month_flow;
    private float balance;
    private float battery_voltage;
    private String status;
    private String collected_at;
    private float latest_31_day_usage;


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

    public float getSettle_flow() {
        return settle_flow;
    }

    public void setSettle_flow(float settle_flow) {
        this.settle_flow = settle_flow;
    }

    public float getTotal_flow() {
        return total_flow;
    }

    public void setTotal_flow(float total_flow) {
        this.total_flow = total_flow;
    }

    public float getLast_month_flow() {
        return last_month_flow;
    }

    public void setLast_month_flow(float last_month_flow) {
        this.last_month_flow = last_month_flow;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getBattery_voltage() {
        return battery_voltage;
    }

    public void setBattery_voltage(float battery_voltage) {
        this.battery_voltage = battery_voltage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCollected_at() {
        return collected_at;
    }

    public void setCollected_at(String collected_at) {
        this.collected_at = collected_at;
    }

    public float getLatest_31_day_usage() {
        return latest_31_day_usage;
    }

    public void setLatest_31_day_usage(float latest_31_day_usage) {
        this.latest_31_day_usage = latest_31_day_usage;
    }
}
