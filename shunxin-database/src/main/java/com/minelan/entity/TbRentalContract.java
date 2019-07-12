package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_rental_contract")
public class TbRentalContract {
    /**
     * 序号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 外租公司名称
     */
    @Column(name = "company_pid")
    private Integer companyPid;

    /**
     * 生效日期
     */
    @Column(name = "effective_date")
    private Date effectiveDate;

    /**
     * 失效日期
     */
    @Column(name = "failure_time")
    private Date failureTime;

    /**
     * 外租车辆
     */
    @Column(name = "rent_pid")
    private Integer rentPid;

    /**
     * 租入合同编号
     */
    @Column(name = "contract_number")
    private String contractNumber;

    /**
     * 签订日期
     */
    @Column(name = "sign_date")
    private Date signDate;

    /**
     * 合同状态:0生效中1：已失效
     */
    @Column(name = "contract_status")
    private Integer contractStatus;

    /**
     * 删除：0已删除1：未删除
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
     * 获取外租公司名称
     *
     * @return company_pid - 外租公司名称
     */
    public Integer getCompanyPid() {
        return companyPid;
    }

    /**
     * 设置外租公司名称
     *
     * @param companyPid 外租公司名称
     */
    public void setCompanyPid(Integer companyPid) {
        this.companyPid = companyPid;
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
     * @return failure_time - 失效日期
     */
    public Date getFailureTime() {
        return failureTime;
    }

    /**
     * 设置失效日期
     *
     * @param failureTime 失效日期
     */
    public void setFailureTime(Date failureTime) {
        this.failureTime = failureTime;
    }

    /**
     * 获取外租车辆
     *
     * @return rent_pid - 外租车辆
     */
    public Integer getRentPid() {
        return rentPid;
    }

    /**
     * 设置外租车辆
     *
     * @param rentPid 外租车辆
     */
    public void setRentPid(Integer rentPid) {
        this.rentPid = rentPid;
    }

    /**
     * 获取租入合同编号
     *
     * @return contract_number - 租入合同编号
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * 设置租入合同编号
     *
     * @param contractNumber 租入合同编号
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    /**
     * 获取签订日期
     *
     * @return sign_date - 签订日期
     */
    public Date getSignDate() {
        return signDate;
    }

    /**
     * 设置签订日期
     *
     * @param signDate 签订日期
     */
    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    /**
     * 获取合同状态:0生效中1：已失效
     *
     * @return contract_status - 合同状态:0生效中1：已失效
     */
    public Integer getContractStatus() {
        return contractStatus;
    }

    /**
     * 设置合同状态:0生效中1：已失效
     *
     * @param contractStatus 合同状态:0生效中1：已失效
     */
    public void setContractStatus(Integer contractStatus) {
        this.contractStatus = contractStatus;
    }

    /**
     * 获取删除：0已删除1：未删除
     *
     * @return status - 删除：0已删除1：未删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置删除：0已删除1：未删除
     *
     * @param status 删除：0已删除1：未删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}