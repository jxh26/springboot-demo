package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_audit_refund")
public class TbAuditRefund {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联订单主键
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 审核操作（0：同意1：拒绝）
     */
    private Short operator;

    /**
     * 退款比例（0：全额退款 1：按比例退款）
     */
    @Column(name = "refund_percent")
    private Short refundPercent;

    /**
     * 按比例退款时百分比
     */
    private Double percent;

    /**
     * 退款金额
     */
    @Column(name = "refund_amount")
    private Double refundAmount;

    /**
     * 支付公司
     */
    @Column(name = "pay_company")
    private String payCompany;

    /**
     * 支付账号
     */
    @Column(name = "pay_account")
    private String payAccount;

    /**
     * 支付方式（0：转账1：现金：支票）
     */
    @Column(name = "pay_mode")
    private Short payMode;

    /**
     * 审批意见
     */
    private String suggest;

    /**
     * 状态
     */
    private Short status;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

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
     * 获取关联订单主键
     *
     * @return order_id - 关联订单主键
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置关联订单主键
     *
     * @param orderId 关联订单主键
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取审核操作（0：同意1：拒绝）
     *
     * @return operator - 审核操作（0：同意1：拒绝）
     */
    public Short getOperator() {
        return operator;
    }

    /**
     * 设置审核操作（0：同意1：拒绝）
     *
     * @param operator 审核操作（0：同意1：拒绝）
     */
    public void setOperator(Short operator) {
        this.operator = operator;
    }

    /**
     * 获取退款比例（0：全额退款 1：按比例退款）
     *
     * @return refund_percent - 退款比例（0：全额退款 1：按比例退款）
     */
    public Short getRefundPercent() {
        return refundPercent;
    }

    /**
     * 设置退款比例（0：全额退款 1：按比例退款）
     *
     * @param refundPercent 退款比例（0：全额退款 1：按比例退款）
     */
    public void setRefundPercent(Short refundPercent) {
        this.refundPercent = refundPercent;
    }

    /**
     * 获取按比例退款时百分比
     *
     * @return percent - 按比例退款时百分比
     */
    public Double getPercent() {
        return percent;
    }

    /**
     * 设置按比例退款时百分比
     *
     * @param percent 按比例退款时百分比
     */
    public void setPercent(Double percent) {
        this.percent = percent;
    }

    /**
     * 获取退款金额
     *
     * @return refund_amount - 退款金额
     */
    public Double getRefundAmount() {
        return refundAmount;
    }

    /**
     * 设置退款金额
     *
     * @param refundAmount 退款金额
     */
    public void setRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * 获取支付公司
     *
     * @return pay_company - 支付公司
     */
    public String getPayCompany() {
        return payCompany;
    }

    /**
     * 设置支付公司
     *
     * @param payCompany 支付公司
     */
    public void setPayCompany(String payCompany) {
        this.payCompany = payCompany;
    }

    /**
     * 获取支付账号
     *
     * @return pay_account - 支付账号
     */
    public String getPayAccount() {
        return payAccount;
    }

    /**
     * 设置支付账号
     *
     * @param payAccount 支付账号
     */
    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    /**
     * 获取支付方式（0：转账1：现金：支票）
     *
     * @return pay_mode - 支付方式（0：转账1：现金：支票）
     */
    public Short getPayMode() {
        return payMode;
    }

    /**
     * 设置支付方式（0：转账1：现金：支票）
     *
     * @param payMode 支付方式（0：转账1：现金：支票）
     */
    public void setPayMode(Short payMode) {
        this.payMode = payMode;
    }

    /**
     * 获取审批意见
     *
     * @return suggest - 审批意见
     */
    public String getSuggest() {
        return suggest;
    }

    /**
     * 设置审批意见
     *
     * @param suggest 审批意见
     */
    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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