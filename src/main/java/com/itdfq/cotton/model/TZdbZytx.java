package com.itdfq.cotton.model;

import lombok.Data;

/**
 *
 */
@Data
public class TZdbZytx {
    /**
     *
     */
    private Integer id;
    /**
     * 选项值
     */
    private String ziDuanMing;
    /**
     * 特性分类
     */
    private String ziDuanZhi;
    /**
     * 是否可用
     */
    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZiDuanMing() {
        return ziDuanMing;
    }

    public void setZiDuanMing(String ziDuanMing) {
        this.ziDuanMing = ziDuanMing;
    }

    public String getZiDuanZhi() {
        return ziDuanZhi;
    }

    public void setZiDuanZhi(String ziDuanZhi) {
        this.ziDuanZhi = ziDuanZhi;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}