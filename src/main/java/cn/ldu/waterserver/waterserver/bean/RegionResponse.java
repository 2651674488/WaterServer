package cn.ldu.waterserver.waterserver.bean;

import java.util.List;

public class RegionResponse<T> {
    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
