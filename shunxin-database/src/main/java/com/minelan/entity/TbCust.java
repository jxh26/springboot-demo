package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_cust")
public class TbCust {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 客户名称
     */
    private String name;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 所属行业
     */
    private String industry;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String telephone;

    /**
     * 客户电话
     */
    private String mobliephone;

    /**
     * 客户电话2
     */
    private String mobliephone2;

    /**
     * 客户地址
     */
    private String address;

    /**
     * 客户类型
     */
    private String type;

    /**
     * 客户来源
     */
    @Column(name = "cust_source")
    private String custSource;

    /**
     * 客户法人
     */
    @Column(name = "juridical_person")
    private String juridicalPerson;

    /**
     * 法人身份证号
     */
    @Column(name = "juridical_person_id")
    private String juridicalPersonId;

    @Column(name = "opening_bank")
    private String openingBank;

    /**
     * 开户账户
     */
    private String account;

    /**
     * 创建人ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 客户好状态（0：删除；1：审核中；2：审核通过；3：审核不通过）
     */
    private Integer status;

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
     * 获取客户名称
     *
     * @return name - 客户名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置客户名称
     *
     * @param name 客户名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取联系人
     *
     * @return contact - 联系人
     */
    public String getContact() {
        return contact;
    }

    /**
     * 设置联系人
     *
     * @param contact 联系人
     */
    public void setContact(String contact) {
        this.contact = contact;
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
     * @return email - 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮箱
     *
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取手机号码
     *
     * @return telephone - 手机号码
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置手机号码
     *
     * @param telephone 手机号码
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取客户电话
     *
     * @return mobliephone - 客户电话
     */
    public String getMobliephone() {
        return mobliephone;
    }

    /**
     * 设置客户电话
     *
     * @param mobliephone 客户电话
     */
    public void setMobliephone(String mobliephone) {
        this.mobliephone = mobliephone;
    }

    /**
     * 获取客户电话2
     *
     * @return mobliephone2 - 客户电话2
     */
    public String getMobliephone2() {
        return mobliephone2;
    }

    /**
     * 设置客户电话2
     *
     * @param mobliephone2 客户电话2
     */
    public void setMobliephone2(String mobliephone2) {
        this.mobliephone2 = mobliephone2;
    }

    /**
     * 获取客户地址
     *
     * @return address - 客户地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置客户地址
     *
     * @param address 客户地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取客户类型
     *
     * @return type - 客户类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置客户类型
     *
     * @param type 客户类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取客户来源
     *
     * @return cust_source - 客户来源
     */
    public String getCustSource() {
        return custSource;
    }

    /**
     * 设置客户来源
     *
     * @param custSource 客户来源
     */
    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    /**
     * 获取客户法人
     *
     * @return juridical_person - 客户法人
     */
    public String getJuridicalPerson() {
        return juridicalPerson;
    }

    /**
     * 设置客户法人
     *
     * @param juridicalPerson 客户法人
     */
    public void setJuridicalPerson(String juridicalPerson) {
        this.juridicalPerson = juridicalPerson;
    }

    /**
     * 获取法人身份证号
     *
     * @return juridical_person_id - 法人身份证号
     */
    public String getJuridicalPersonId() {
        return juridicalPersonId;
    }

    /**
     * 设置法人身份证号
     *
     * @param juridicalPersonId 法人身份证号
     */
    public void setJuridicalPersonId(String juridicalPersonId) {
        this.juridicalPersonId = juridicalPersonId;
    }

    /**
     * @return opening_bank
     */
    public String getOpeningBank() {
        return openingBank;
    }

    /**
     * @param openingBank
     */
    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank;
    }

    /**
     * 获取开户账户
     *
     * @return account - 开户账户
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置开户账户
     *
     * @param account 开户账户
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取创建人ID
     *
     * @return user_id - 创建人ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置创建人ID
     *
     * @param userId 创建人ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取客户好状态（0：删除；1：审核中；2：审核通过；3：审核不通过）
     *
     * @return status - 客户好状态（0：删除；1：审核中；2：审核通过；3：审核不通过）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置客户好状态（0：删除；1：审核中；2：审核通过；3：审核不通过）
     *
     * @param status 客户好状态（0：删除；1：审核中；2：审核通过；3：审核不通过）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}