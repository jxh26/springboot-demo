package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_car_rent_out_contract")
public class TbCarRentOutContract {
    /**
     * 序号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 合同编号，遵守一定编号规则
     */
    @Column(name = "contractNum")
    private String contractnum;

    /**
     * 客户名称pid
     */
    @Column(name = "custId")
    private Integer custid;

    /**
     * 生效日期
     */
    @Column(name = "effective_date")
    private Date effectiveDate;

    /**
     * 失效日期
     */
    @Column(name = "expiration_date")
    private Date expirationDate;

    /**
     * 营业执照
     */
    @Column(name = "business_license")
    private String businessLicense;

    /**
     * 附件
     */
    private String enclosure;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 签订日期（合同提交日期）
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 合同状态 0：作废 1：正常
     */
    private Integer status;

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
     * 获取合同编号，遵守一定编号规则
     *
     * @return contractNum - 合同编号，遵守一定编号规则
     */
    public String getContractnum() {
        return contractnum;
    }

    /**
     * 设置合同编号，遵守一定编号规则
     *
     * @param contractnum 合同编号，遵守一定编号规则
     */
    public void setContractnum(String contractnum) {
        this.contractnum = contractnum;
    }

    /**
     * 获取客户名称pid
     *
     * @return custId - 客户名称pid
     */
    public Integer getCustid() {
        return custid;
    }

    /**
     * 设置客户名称pid
     *
     * @param custid 客户名称pid
     */
    public void setCustid(Integer custid) {
        this.custid = custid;
    }

    /**
     * 获取生效日期
     *
     * @return effective_date - 生效日期
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置生效日期
     *
     * @param effectiveDate 生效日期
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * 获取失效日期
     *
     * @return expiration_date - 失效日期
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * 设置失效日期
     *
     * @param expirationDate 失效日期
     */
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * 获取营业执照
     *
     * @return business_license - 营业执照
     */
    public String getBusinessLicense() {
        return businessLicense;
    }

    /**
     * 设置营业执照
     *
     * @param businessLicense 营业执照
     */
    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    /**
     * 获取附件
     *
     * @return enclosure - 附件
     */
    public String getEnclosure() {
        return enclosure;
    }

    /**
     * 设置附件
     *
     * @param enclosure 附件
     */
    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure;
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
     * 获取签订日期（合同提交日期）
     *
     * @return create_time - 签订日期（合同提交日期）
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置签订日期（合同提交日期）
     *
     * @param createTime 签订日期（合同提交日期）
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取合同状态 0：作废 1：正常
     *
     * @return status - 合同状态 0：作废 1：正常
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置合同状态 0：作废 1：正常
     *
     * @param status 合同状态 0：作废 1：正常
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}