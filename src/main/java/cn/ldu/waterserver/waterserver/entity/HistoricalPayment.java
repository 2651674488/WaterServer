package cn.ldu.waterserver.waterserver.entity;

public class HistoricalPayment {
    private String user_name;
    private String device_code;
    private String user_code;
    private String address;
    private String user_type;
    private String price_mode;
    private String payment_method;
    private float account_balance;
    private float amcount_recharged;
    private float surplus_balance;
    private String recharge_status;
    private String collected_at;


    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getDevice_code() {
        return device_code;
    }

    public void setDevice_code(String device_code) {
        this.device_code = device_code;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getPrice_mode() {
        return price_mode;
    }

    public void setPrice_mode(String price_mode) {
        this.price_mode = price_mode;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public float getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(float account_balance) {
        this.account_balance = account_balance;
    }

    public float getAmcount_recharged() {
        return amcount_recharged;
    }

    public void setAmcount_recharged(float amcount_recharged) {
        this.amcount_recharged = amcount_recharged;
    }

    public float getSurplus_balance() {
        return surplus_balance;
    }

    public void setSurplus_balance(float surplus_balance) {
        this.surplus_balance = surplus_balance;
    }

    public String getRecharge_status() {
        return recharge_status;
    }

    public void setRecharge_status(String recharge_status) {
        this.recharge_status = recharge_status;
    }

    public String getCollected_at() {
        return collected_at;
    }

    public void setCollected_at(String collected_at) {
        this.collected_at = collected_at;
    }
}
