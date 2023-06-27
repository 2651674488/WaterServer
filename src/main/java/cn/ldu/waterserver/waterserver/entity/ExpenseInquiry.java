package cn.ldu.waterserver.waterserver.entity;

public class ExpenseInquiry {

    private Integer region_id;
    private String username;
    private String user_code;
    private String phone_number;
    private float account_balance;
    private float consumed_amount;
    private float arrears_balance;
    private String last_billing_date;

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

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public float getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(float account_balance) {
        this.account_balance = account_balance;
    }

    public float getConsumed_amount() {
        return consumed_amount;
    }

    public void setConsumed_amount(float consumed_amount) {
        this.consumed_amount = consumed_amount;
    }

    public float getArrears_balance() {
        return arrears_balance;
    }

    public void setArrears_balance(float arrears_balance) {
        this.arrears_balance = arrears_balance;
    }

    public String getLast_billing_date() {
        return last_billing_date;
    }

    public void setLast_billing_date(String last_billing_date) {
        this.last_billing_date = last_billing_date;
    }
}
