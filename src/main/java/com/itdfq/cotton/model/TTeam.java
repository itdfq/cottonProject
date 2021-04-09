package com.itdfq.cotton.model;

import lombok.Data;

/**
 *
 */
@Data
public class TTeam {
    /**
     *
     */
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户类型
     */
    private String role;
    /**
     * 用户状态
     */
    private String aaccountState;
    /**
     * 电话
     */
    private String tel;
    /**
     * 课题组名
     */
    private String teamName;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 电子邮件
     */
    private String email;
    /**
     * 地址--省份
     */
    private String addressProvince;
    /**
     * 地址--城市
     */
    private String addressCity;
    /**
     * 地址--详细地址
     */
    private String addressDistrict;
    /**
     * 备注
     */
    private String addressDetail;
    /**
     * 头像名
     */
    private String mark;
    /**
     *
     */
    private String headImgName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAaccountState() {
        return aaccountState;
    }

    public void setAaccountState(String aaccountState) {
        this.aaccountState = aaccountState;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressProvince() {
        return addressProvince;
    }

    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressDistrict() {
        return addressDistrict;
    }

    public void setAddressDistrict(String addressDistrict) {
        this.addressDistrict = addressDistrict;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getHeadImgName() {
        return headImgName;
    }

    public void setHeadImgName(String headImgName) {
        this.headImgName = headImgName;
    }
}