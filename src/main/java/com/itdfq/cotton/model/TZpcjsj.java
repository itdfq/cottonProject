package com.itdfq.cotton.model;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;


import java.util.Date;

/**
 *
 */

public class TZpcjsj {


    /**
     *
     */
    @ExcelIgnore
    private Integer id;
    /**
     * 年份
     */
    @ExcelProperty("年份")
    private String nianFen;
    /**
     * 行号
     */
    @ExcelProperty("行号")
    private String hangHao;
    /**
     * 所属账户
     */
    @ExcelProperty("所属账户")
    private String belongToAccount;
    /**
     * 品种名称杂交组合
     */
    @ExcelProperty("品种（系）名称杂交组合")
    private String zhongMing;
    /**
     * 来源
     */
    @ExcelProperty("来源")
    private String laiYuan;
    /**
     * 长度
     */
    @ExcelProperty("长度")
    private String changDu;
    /**
     * 比强
     */
    @ExcelProperty("比强")
    private String biQiang;
    /**
     * 马值
     */
    @ExcelProperty("马值")
    private String maZhi;
    /**
     * 铃重
     */
    @ExcelProperty("铃重")
    private String lingZhong;
    /**
     * 衣分
     */
    @ExcelProperty("衣分")
    private String yiFen;
    /**
     * 出苗期
     */
    @ExcelProperty("出苗期")
    @JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
    private Date chuMiaoQi;
    /**
     * 开花期
     */
    @ExcelProperty("开花期")
    @JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
    private Date kaiHuaQi;
    /**
     *
     */
    @ExcelProperty("吐絮期")
    @JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
    private Date tuXuQi;
    /**
     *
     */
    @ExcelProperty("生长势--苗期")
    private String szsMiaoQi;
    /**
     *
     */
    @ExcelProperty("生长势--花期")
    private String szsHuaQi;
    /**
     *
     */
    @ExcelProperty("整齐度--苗期")
    private String zqdMiaoQi;
    /**
     *
     */
    @ExcelProperty("整齐度--花期")
    private String zqdHuaQi;
    /**
     *
     */
    @ExcelProperty("收获株数")
    private Integer shouHuoZhuShu;
    /**
     *
     */
    @ExcelProperty("主要特征特性--株型")
    private Integer zytxZhuXing;
    /**
     *
     */
    @ExcelProperty("主要特征特性--叶型")
    private Integer zytxYeXing;
    /**
     *
     */
    @ExcelProperty("主要特征特性--铃型")
    private Integer zytxLingXing;
    /**
     *
     */
    @ExcelProperty("主要特征特性--株高")
    private Integer zytxZhuGao;
    /**
     *
     */
    @ExcelProperty(" 主要特征特性--结铃型")
    private Integer zytxJieLingXing;
    /**
     *
     */
    @ExcelProperty("主要特征特性--叶絮型")
    private Integer zytxYeXuXing;
    /**
     *
     */
    @ExcelProperty("抗病性--枯萎病指")
    private Integer kuWeiBingZhi;
    /**
     *
     */
    @ExcelProperty("抗病性--黄萎病指")
    private Integer huangWeiBingZhi;
    /**
     *
     */
    @ExcelProperty("田间绝选")
    private String tianJianJueXuan;
    /**
     *
     */
    @ExcelProperty("备注")
    private String mark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNianFen() {
        return nianFen;
    }

    public void setNianFen(String nianFen) {
        this.nianFen = nianFen;
    }

    public String getHangHao() {
        return hangHao;
    }

    public void setHangHao(String hangHao) {
        this.hangHao = hangHao;
    }

    public String getBelongToAccount() {
        return belongToAccount;
    }

    public void setBelongToAccount(String belongToAccount) {
        this.belongToAccount = belongToAccount;
    }

    public String getZhongMing() {
        return zhongMing;
    }

    public void setZhongMing(String zhongMing) {
        this.zhongMing = zhongMing;
    }

    public String getLaiYuan() {
        return laiYuan;
    }

    public void setLaiYuan(String laiYuan) {
        this.laiYuan = laiYuan;
    }

    public String getChangDu() {
        return changDu;
    }

    public void setChangDu(String changDu) {
        this.changDu = changDu;
    }

    public String getBiQiang() {
        return biQiang;
    }

    public void setBiQiang(String biQiang) {
        this.biQiang = biQiang;
    }

    public String getMaZhi() {
        return maZhi;
    }

    public void setMaZhi(String maZhi) {
        this.maZhi = maZhi;
    }

    public String getLingZhong() {
        return lingZhong;
    }

    public void setLingZhong(String lingZhong) {
        this.lingZhong = lingZhong;
    }

    public String getYiFen() {
        return yiFen;
    }

    public void setYiFen(String yiFen) {
        this.yiFen = yiFen;
    }

    public Date getChuMiaoQi() {
        return chuMiaoQi;
    }

    public void setChuMiaoQi(Date chuMiaoQi) {
        this.chuMiaoQi = chuMiaoQi;
    }

    public Date getKaiHuaQi() {
        return kaiHuaQi;
    }

    public void setKaiHuaQi(Date kaiHuaQi) {
        this.kaiHuaQi = kaiHuaQi;
    }

    public Date getTuXuQi() {
        return tuXuQi;
    }

    public void setTuXuQi(Date tuXuQi) {
        this.tuXuQi = tuXuQi;
    }

    public String getSzsMiaoQi() {
        return szsMiaoQi;
    }

    public void setSzsMiaoQi(String szsMiaoQi) {
        this.szsMiaoQi = szsMiaoQi;
    }

    public String getSzsHuaQi() {
        return szsHuaQi;
    }

    public void setSzsHuaQi(String szsHuaQi) {
        this.szsHuaQi = szsHuaQi;
    }

    public String getZqdMiaoQi() {
        return zqdMiaoQi;
    }

    public void setZqdMiaoQi(String zqdMiaoQi) {
        this.zqdMiaoQi = zqdMiaoQi;
    }

    public String getZqdHuaQi() {
        return zqdHuaQi;
    }

    public void setZqdHuaQi(String zqdHuaQi) {
        this.zqdHuaQi = zqdHuaQi;
    }

    public Integer getShouHuoZhuShu() {
        return shouHuoZhuShu;
    }

    public void setShouHuoZhuShu(Integer shouHuoZhuShu) {
        this.shouHuoZhuShu = shouHuoZhuShu;
    }

    public Integer getZytxZhuXing() {
        return zytxZhuXing;
    }

    public void setZytxZhuXing(Integer zytxZhuXing) {
        this.zytxZhuXing = zytxZhuXing;
    }

    public Integer getZytxYeXing() {
        return zytxYeXing;
    }

    public void setZytxYeXing(Integer zytxYeXing) {
        this.zytxYeXing = zytxYeXing;
    }

    public Integer getZytxLingXing() {
        return zytxLingXing;
    }

    public void setZytxLingXing(Integer zytxLingXing) {
        this.zytxLingXing = zytxLingXing;
    }

    public Integer getZytxZhuGao() {
        return zytxZhuGao;
    }

    public void setZytxZhuGao(Integer zytxZhuGao) {
        this.zytxZhuGao = zytxZhuGao;
    }

    public Integer getZytxJieLingXing() {
        return zytxJieLingXing;
    }

    public void setZytxJieLingXing(Integer zytxJieLingXing) {
        this.zytxJieLingXing = zytxJieLingXing;
    }

    public Integer getZytxYeXuXing() {
        return zytxYeXuXing;
    }

    public void setZytxYeXuXing(Integer zytxYeXuXing) {
        this.zytxYeXuXing = zytxYeXuXing;
    }

    public Integer getKuWeiBingZhi() {
        return kuWeiBingZhi;
    }

    public void setKuWeiBingZhi(Integer kuWeiBingZhi) {
        this.kuWeiBingZhi = kuWeiBingZhi;
    }

    public Integer getHuangWeiBingZhi() {
        return huangWeiBingZhi;
    }

    public void setHuangWeiBingZhi(Integer huangWeiBingZhi) {
        this.huangWeiBingZhi = huangWeiBingZhi;
    }

    public String getTianJianJueXuan() {
        return tianJianJueXuan;
    }

    public void setTianJianJueXuan(String tianJianJueXuan) {
        this.tianJianJueXuan = tianJianJueXuan;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "TZpcjsj{" +
                "id=" + id +
                ", nianFen='" + nianFen + '\'' +
                ", hangHao='" + hangHao + '\'' +
                ", belongToAccount='" + belongToAccount + '\'' +
                ", zhongMing='" + zhongMing + '\'' +
                ", laiYuan='" + laiYuan + '\'' +
                ", changDu='" + changDu + '\'' +
                ", biQiang='" + biQiang + '\'' +
                ", maZhi='" + maZhi + '\'' +
                ", lingZhong='" + lingZhong + '\'' +
                ", yiFen='" + yiFen + '\'' +
                ", chuMiaoQi=" + chuMiaoQi +
                ", kaiHuaQi=" + kaiHuaQi +
                ", tuXuQi=" + tuXuQi +
                ", szsMiaoQi='" + szsMiaoQi + '\'' +
                ", szsHuaQi='" + szsHuaQi + '\'' +
                ", zqdMiaoQi='" + zqdMiaoQi + '\'' +
                ", zqdHuaQi='" + zqdHuaQi + '\'' +
                ", shouHuoZhuShu=" + shouHuoZhuShu +
                ", zytxZhuXing=" + zytxZhuXing +
                ", zytxYeXing=" + zytxYeXing +
                ", zytxLingXing=" + zytxLingXing +
                ", zytxZhuGao=" + zytxZhuGao +
                ", zytxJieLingXing=" + zytxJieLingXing +
                ", zytxYeXuXing=" + zytxYeXuXing +
                ", kuWeiBingZhi=" + kuWeiBingZhi +
                ", huangWeiBingZhi=" + huangWeiBingZhi +
                ", tianJianJueXuan='" + tianJianJueXuan + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}