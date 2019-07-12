package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_company_maintain")
public class TbCompanyMaintain {
    /**
     * 序号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 外租公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 所属行业
     */
    private String industry;

    /**
     * 电子邮箱
     */
    @Column(name = "mail_box")
    private String mailBox;

    /**
     * 手机号码
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 座机1
     */
    @Column(name = "landline_one")
    private String landlineOne;

    /**
     * 座机2
     */
    @Column(name = "landline_two")
    private String landlineTwo;

    /**
     * 详细地址
     */
    @Column(name = "detailed_address")
    private String detailedAddress;

    /**
     * 公司类型:0:国营控股企业 1：民国营大型企业（企业超过100人） 2：民营大型企业（收入超过2个亿，人数超过三百） 3：民营中小型企业 4：上市公司
     */
    @Column(name = "company_type")
    private Integer companyType;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 删除：0：删除 1：正常
     */
    private Integer status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取序号
     *
     * @return id - 序号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置序号
     *
     * @param id 序号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取外租公司名称
     *
     * @return company_name - 外租公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置外租公司名称
     *
     * @param companyName 外租公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 获取联系人
     *
     * @return contacts - 联系人
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * 设置联系人
     *
     * @param contacts 联系人
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * 获取所属行业
     *
     * @return industry - 所属行业
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * 设置所属行业
     *
     * @param industry 所属行业
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * 获取电子邮箱
     *
     * @return mail_box - 电子邮箱
     */
    public String getMailBox() {
        return mailBox;
    }

    /**
     * 设置电子邮箱
     *
     * @param mailBox 电子邮箱
     */
    public void setMailBox(String mailBox) {
        this.mailBox = mailBox;
    }

    /**
     * 获取手机号码
     *
     * @return phone_number - 手机号码
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置手机号码
     *
     * @param phoneNumber 手机号码
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取座机1
     *
     * @return landline_one - 座机1
     */
    public String getLandlineOne() {
        return landlineOne;
    }

    /**
     * 设置座机1
     *
     * @param landlineOne 座机1
     */
    public void setLandlineOne(String landlineOne) {
        this.landlineOne = landlineOne;
    }

    /**
     * 获取座机2
     *
     * @return landline_two - 座机2
     */
    public String getLandlineTwo() {
        return landlineTwo;
    }

    /**
     * 设置座机2
     *
     * @param landlineTwo 座机2
     */
    public void setLandlineTwo(String landlineTwo) {
        this.landlineTwo = landlineTwo;
    }

    /**
     * 获取详细地址
     *
     * @return detailed_address - 详细地址
     */
    public String getDetailedAddress() {
        return detailedAddress;
    }

    /**
     * 设置详细地址
     *
     * @param detailedAddress 详细地址
     */
    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    /**
     * 获取公司类型:0:国营控股企业 1：民国营大型企业（企业超过100人） 2：民营大型企业（收入超过2个亿，人数超过三百） 3：民营中小型企业 4：上市公司
     *
     * @return company_type - 公司类型:0:国营控股企业 1：民国营大型企业（企业超过100人） 2：民营大型企业（收入超过2个亿，人数超过三百） 3：民营中小型企业 4：上市公司
     */
    public Integer getCompanyType() {
        return companyType;
    }

    /**
     * 设置公司类型:0:国营控股企业 1：民国营大型企业（企业超过100人） 2：民营大型企业（收入超过2个亿，人数超过三百） 3：民营中小型企业 4：上市公司
     *
     * @param companyType 公司类型:0:国营控股企业 1：民国营大型企业（企业超过100人） 2：民营大型企业（收入超过2个亿，人数超过三百） 3：民营中小型企业 4：上市公司
     */
    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取删除：0：删除 1：正常
     *
     * @return status - 删除：0：删除 1：正常
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置删除：0：删除 1：正常
     *
     * @param status 删除：0：删除 1：正常
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}