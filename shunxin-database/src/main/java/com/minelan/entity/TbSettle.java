package com.minelan.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_settle")
public class TbSettle {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 订单编号
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 租赁方式（1：自驾 2：司机代驾）
     */
    @Column(name = "rent_type")
    private Short rentType;

    /**
     * 合计
     */
    private BigDecimal total;

    /**
     * 已支付金额
     */
    @Column(name = "had_pay")
    private BigDecimal hadPay;

    /**
     * 其他费用合计
     */
    @Column(name = "other_pay_total")
    private BigDecimal otherPayTotal;

    /**
     * 应收金额支付方式（0：全额收取 1：比例收取）
     */
    @Column(name = "pay_way")
    private Short payWay;

    /**
     * 按比例收取时，比例值
     */
    @Column(name = "pay_percent")
    private Double payPercent;

    /**
     * 应收金额
     */
    private BigDecimal receivables;

    /**
     * 减免金额
     */
    @Column(name = "reduCount")
    private BigDecimal reducount;

    /**
     * 实收金额
     */
    @Column(name = "realPay")
    private BigDecimal realpay;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 结算状态（0：待结算、1：待审核、2：审核通过；3：审核不通过）
     */
    private Integer status;

    /**
     * 非工作时间超时费计算标记（对应非工作时间超时设置batch）
     */
    private String batch;

    /**
     * 结算时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间即结算时间
     */
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
     * 获取订单编号
     *
     * @return order_id - 订单编号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单编号
     *
     * @param orderId 订单编号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取租赁方式（1：自驾 2：司机代驾）
     *
     * @return rent_type - 租赁方式（1：自驾 2：司机代驾）
     */
    public Short getRentType() {
        return rentType;
    }

    /**
     * 设置租赁方式（1：自驾 2：司机代驾）
     *
     * @param rentType 租赁方式（1：自驾 2：司机代驾）
     */
    public void setRentType(Short rentType) {
        this.rentType = rentType;
    }

    /**
     * 获取合计
     *
     * @return total - 合计
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * 设置合计
     *
     * @param total 合计
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * 获取已支付金额
     *
     * @return had_pay - 已支付金额
     */
    public BigDecimal getHadPay() {
        return hadPay;
    }

    /**
     * 设置已支付金额
     *
     * @param hadPay 已支付金额
     */
    public void setHadPay(BigDecimal hadPay) {
        this.hadPay = hadPay;
    }

    /**
     * 获取其他费用合计
     *
     * @return other_pay_total - 其他费用合计
     */
    public BigDecimal getOtherPayTotal() {
        return otherPayTotal;
    }

    /**
     * 设置其他费用合计
     *
     * @param otherPayTotal 其他费用合计
     */
    public void setOtherPayTotal(BigDecimal otherPayTotal) {
        this.otherPayTotal = otherPayTotal;
    }

    /**
     * 获取应收金额支付方式（0：全额收取 1：比例收取）
     *
     * @return pay_way - 应收金额支付方式（0：全额收取 1：比例收取）
     */
    public Short getPayWay() {
        return payWay;
    }

    /**
     * 设置应收金额支付方式（0：全额收取 1：比例收取）
     *
     * @param payWay 应收金额支付方式（0：全额收取 1：比例收取）
     */
    public void setPayWay(Short payWay) {
        this.payWay = payWay;
    }

    /**
     * 获取按比例收取时，比例值
     *
     * @return pay_percent - 按比例收取时，比例值
     */
    public Double getPayPercent() {
        return payPercent;
    }

    /**
     * 设置按比例收取时，比例值
     *
     * @param payPercent 按比例收取时，比例值
     */
    public void setPayPercent(Double payPercent) {
        this.payPercent = payPercent;
    }

    /**
     * 获取应收金额
     *
     * @return receivables - 应收金额
     */
    public BigDecimal getReceivables() {
        return receivables;
    }

    /**
     * 设置应收金额
     *
     * @param receivables 应收金额
     */
    public void setReceivables(BigDecimal receivables) {
        this.receivables = receivables;
    }

    /**
     * 获取减免金额
     *
     * @return reduCount - 减免金额
     */
    public BigDecimal getReducount() {
        return reducount;
    }

    /**
     * 设置减免金额
     *
     * @param reducount 减免金额
     */
    public void setReducount(BigDecimal reducount) {
        this.reducount = reducount;
    }

    /**
     * 获取实收金额
     *
     * @return realPay - 实收金额
     */
    public BigDecimal getRealpay() {
        return realpay;
    }

    /**
     * 设置实收金额
     *
     * @param realpay 实收金额
     */
    public void setRealpay(BigDecimal realpay) {
        this.realpay = realpay;
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
     * 获取结算状态（0：待结算、1：待审核、2：审核通过；3：审核不通过）
     *
     * @return status - 结算状态（0：待结算、1：待审核、2：审核通过；3：审核不通过）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置结算状态（0：待结算、1：待审核、2：审核通过；3：审核不通过）
     *
     * @param status 结算状态（0：待结算、1：待审核、2：审核通过；3：审核不通过）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取非工作时间超时费计算标记（对应非工作时间超时设置batch）
     *
     * @return batch - 非工作时间超时费计算标记（对应非工作时间超时设置batch）
     */
    public String getBatch() {
        return batch;
    }

    /**
     * 设置非工作时间超时费计算标记（对应非工作时间超时设置batch）
     *
     * @param batch 非工作时间超时费计算标记（对应非工作时间超时设置batch）
     */
    public void setBatch(String batch) {
        this.batch = batch;
    }

    /**
     * 获取结算时间
     *
     * @return create_time - 结算时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置结算时间
     *
     * @param createTime 结算时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间即结算时间
     *
     * @return update_time - 修改时间即结算时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间即结算时间
     *
     * @param updateTime 修改时间即结算时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}