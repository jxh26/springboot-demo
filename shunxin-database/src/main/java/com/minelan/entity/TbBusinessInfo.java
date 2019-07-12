package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_business_info")
public class TbBusinessInfo {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联企业用户id
     */
    @Column(name = "cust_id")
    private Integer custId;

    /**
     * 公司类型
     */
    @Column(name = "buss_type")
    private String bussType;

    /**
     * 行业
     */
    private String industry;

    /**
     * 办公地址
     */
    @Column(name = "office_add")
    private String officeAdd;

    /**
     * 注册地址
     */
    @Column(name = "regi_add")
    private String regiAdd;

    /**
     * 公司电话
     */
    @Column(name = "buss_phone")
    private String bussPhone;

    /**
     * 公司邮箱
     */
    @Column(name = "buss_mail")
    private String bussMail;

    /**
     * 公司网址
     */
    private String website;

    /**
     * 注册资本
     */
    @Column(name = "regi_capital")
    private String regiCapital;

    /**
     * 人员规模
     */
    @Column(name = "staff_size")
    private String staffSize;

    /**
     * 公司状态0：吊销，1：营业汇总；2：注销
     */
    private Integer status;

    /**
     * 成立时间
     */
    @Column(name = "setup_time")
    private Date setupTime;

    /**
     * 营业起始时间
     */
    @Column(name = "effect_time")
    private Date effectTime;

    /**
     * 营业截止时间
     */
    @Column(name = "fail_time")
    private Date failTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取关联企业用户id
     *
     * @return cust_id - 关联企业用户id
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * 设置关联企业用户id
     *
     * @param custId 关联企业用户id
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * 获取公司类型
     *
     * @return buss_type - 公司类型
     */
    public String getBussType() {
        return bussType;
    }

    /**
     * 设置公司类型
     *
     * @param bussType 公司类型
     */
    public void setBussType(String bussType) {
        this.bussType = bussType;
    }

    /**
     * 获取行业
     *
     * @return industry - 行业
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * 设置行业
     *
     * @param industry 行业
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * 获取办公地址
     *
     * @return office_add - 办公地址
     */
    public String getOfficeAdd() {
        return officeAdd;
    }

    /**
     * 设置办公地址
     *
     * @param officeAdd 办公地址
     */
    public void setOfficeAdd(String officeAdd) {
        this.officeAdd = officeAdd;
    }

    /**
     * 获取注册地址
     *
     * @return regi_add - 注册地址
     */
    public String getRegiAdd() {
        return regiAdd;
    }

    /**
     * 设置注册地址
     *
     * @param regiAdd 注册地址
     */
    public void setRegiAdd(String regiAdd) {
        this.regiAdd = regiAdd;
    }

    /**
     * 获取公司电话
     *
     * @return buss_phone - 公司电话
     */
    public String getBussPhone() {
        return bussPhone;
    }

    /**
     * 设置公司电话
     *
     * @param bussPhone 公司电话
     */
    public void setBussPhone(String bussPhone) {
        this.bussPhone = bussPhone;
    }

    /**
     * 获取公司邮箱
     *
     * @return buss_mail - 公司邮箱
     */
    public String getBussMail() {
        return bussMail;
    }

    /**
     * 设置公司邮箱
     *
     * @param bussMail 公司邮箱
     */
    public void setBussMail(String bussMail) {
        this.bussMail = bussMail;
    }

    /**
     * 获取公司网址
     *
     * @return website - 公司网址
     */
    public String getWebsite() {
        return website;
    }

    /**
     * 设置公司网址
     *
     * @param website 公司网址
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * 获取注册资本
     *
     * @return regi_capital - 注册资本
     */
    public String getRegiCapital() {
        return regiCapital;
    }

    /**
     * 设置注册资本
     *
     * @param regiCapital 注册资本
     */
    public void setRegiCapital(String regiCapital) {
        this.regiCapital = regiCapital;
    }

    /**
     * 获取人员规模
     *
     * @return staff_size - 人员规模
     */
    public String getStaffSize() {
        return staffSize;
    }

    /**
     * 设置人员规模
     *
     * @param staffSize 人员规模
     */
    public void setStaffSize(String staffSize) {
        this.staffSize = staffSize;
    }

    /**
     * 获取公司状态0：吊销，1：营业汇总；2：注销
     *
     * @return status - 公司状态0：吊销，1：营业汇总；2：注销
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置公司状态0：吊销，1：营业汇总；2：注销
     *
     * @param status 公司状态0：吊销，1：营业汇总；2：注销
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取成立时间
     *
     * @return setup_time - 成立时间
     */
    public Date getSetupTime() {
        return setupTime;
    }

    /**
     * 设置成立时间
     *
     * @param setupTime 成立时间
     */
    public void setSetupTime(Date setupTime) {
        this.setupTime = setupTime;
    }

    /**
     * 获取营业起始时间
     *
     * @return effect_time - 营业起始时间
     */
    public Date getEffectTime() {
        return effectTime;
    }

    /**
     * 设置营业起始时间
     *
     * @param effectTime 营业起始时间
     */
    public void setEffectTime(Date effectTime) {
        this.effectTime = effectTime;
    }

    /**
     * 获取营业截止时间
     *
     * @return fail_time - 营业截止时间
     */
    public Date getFailTime() {
        return failTime;
    }

    /**
     * 设置营业截止时间
     *
     * @param failTime 营业截止时间
     */
    public void setFailTime(Date failTime) {
        this.failTime = failTime;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}