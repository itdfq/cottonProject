package com.itdfq.cotton.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 *
 */

public class TZpcjsj {
    /**
     *
     */
    private Integer id;
    /**
     * 年份
     */
    @JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
    private String nianFen;
    /**
     * 行号
     */
    private String hangHao;
    /**
     * 所属账户
     */
    private String belongToAccount;
    /**
     * 品种名称杂交组合
     */
    private String zhongMing;
    /**
     * 来源
     */
    private String laiYuan;
    /**
     * 长度
     */
    private String changDu;
    /**
     * 比强
     */
    private String biQiang;
    /**
     * 马值
     */
    private String maZhi;
    /**
     * 铃重
     */
    private String lingZhong;
    /**
     * 衣分
     */
    private String yiFen;
    /**
     * 出苗期
     */
    @JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
    private Date chuMiaoQi;
    /**
     * 开花期
     */
    @JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
    private Date kaiHuaQi;
    /**
     *
     */
    @JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
    private Date tuXuQi;
    /**
     *
     */
    private String szsMiaoQi;
    /**
     *
     */
    private String szsHuaQi;
    /**
     *
     */
    private String zqdMiaoQi;
    /**
     *
     */
    private String zqdHuaQi;
    /**
     *
     */
    private Integer shouHuoZhuShu;
    /**
     *
     */
    private Integer zytxZhuXing;
    /**
     *
     */
    private Integer zytxYeXing;
    /**
     *
     */
    private Integer zytxLingXing;
    /**
     *
     */
    private Integer zytxZhuGao;
    /**
     *
     */
    private Integer zytxJieLingXing;
    /**
     *
     */
    private Integer zytxYeXuXing;
    /**
     *
     */
    private Integer kuWeiBingZhi;
    /**
     *
     */
    private Integer huangWeiBingZhi;
    /**
     *
     */
    private String tianJianJueXuan;
    /**
     *
     */
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
}