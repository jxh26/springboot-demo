package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_rent_in_contract")
public class TbRentInContract {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "contract_number")
    private String contractNumber;

    /**
     * 外租公司主键
     */
    @Column(name = "rent_company_id")
    private Integer rentCompanyId;

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

    private Short status;

    /**
     * 创建日期
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新日期
     */
    @Column(name = "upate_time")
    private Date upateTime;

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
     * @return contract_number
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * @param contractNumber
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    /**
     * 获取外租公司主键
     *
     * @return rent_company_id - 外租公司主键
     */
    public Integer getRentCompanyId() {
        return rentCompanyId;
    }

    /**
     * 设置外租公司主键
     *
     * @param rentCompanyId 外租公司主键
     */
    public void setRentCompanyId(Integer rentCompanyId) {
        this.rentCompanyId = rentCompanyId;
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
     * @return status
     */
    public Short getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取创建日期
     *
     * @return create_time - 创建日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建日期
     *
     * @param createTime 创建日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新日期
     *
     * @return upate_time - 更新日期
     */
    public Date getUpateTime() {
        return upateTime;
    }

    /**
     * 设置更新日期
     *
     * @param upateTime 更新日期
     */
    public void setUpateTime(Date upateTime) {
        this.upateTime = upateTime;
    }
}