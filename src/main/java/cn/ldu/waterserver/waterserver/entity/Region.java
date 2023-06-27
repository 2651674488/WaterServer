package cn.ldu.waterserver.waterserver.entity;

import java.util.List;

public class Region {
    private Integer id;
    private String name;
    private List<Region> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Region> getChildren() {
        return children;
    }

    public void setChildren(List<Region> children) {
        this.children = children;
    }
}
