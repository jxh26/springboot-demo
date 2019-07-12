package com.minelan.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_settle_unpaid")
public class TbSettleUnpaid {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 结算id
     */
    @Column(name = "settle_id")
    private Integer settleId;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 欠款金额
     */
    private BigDecimal debt;

    /**
     * 结清状态（默认0：未结清，1结清）
     */
    private Integer status;

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
     * 获取结算id
     *
     * @return settle_id - 结算id
     */
    public Integer getSettleId() {
        return settleId;
    }

    /**
     * 设置结算id
     *
     * @param settleId 结算id
     */
    public void setSettleId(Integer settleId) {
        this.settleId = settleId;
    }

    /**
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取欠款金额
     *
     * @return debt - 欠款金额
     */
    public BigDecimal getDebt() {
        return debt;
    }

    /**
     * 设置欠款金额
     *
     * @param debt 欠款金额
     */
    public void setDebt(BigDecimal debt) {
        this.debt = debt;
    }

    /**
     * 获取结清状态（默认0：未结清，1结清）
     *
     * @return status - 结清状态（默认0：未结清，1结清）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置结清状态（默认0：未结清，1结清）
     *
     * @param status 结清状态（默认0：未结清，1结清）
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