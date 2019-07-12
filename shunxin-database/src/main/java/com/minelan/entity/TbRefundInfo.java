package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_refund_info")
public class TbRefundInfo {
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
     * 关联客户主键
     */
    @Column(name = "client_user_id")
    private Integer clientUserId;

    /**
     * 关联业务人员主键
     */
    @Column(name = "user_id")
    private Integer userId;

    private String reason;

    /**
     * 申请退款来源（0：线上1：业务人员）
     */
    private Short source;

    /**
     * 状态1:退款拒绝；9：审核中10：退款成功）
     */
    private Short status;

    /**
     * 申请退款时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取关联客户主键
     *
     * @return client_user_id - 关联客户主键
     */
    public Integer getClientUserId() {
        return clientUserId;
    }

    /**
     * 设置关联客户主键
     *
     * @param clientUserId 关联客户主键
     */
    public void setClientUserId(Integer clientUserId) {
        this.clientUserId = clientUserId;
    }

    /**
     * 获取关联业务人员主键
     *
     * @return user_id - 关联业务人员主键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置关联业务人员主键
     *
     * @param userId 关联业务人员主键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * 获取申请退款来源（0：线上1：业务人员）
     *
     * @return source - 申请退款来源（0：线上1：业务人员）
     */
    public Short getSource() {
        return source;
    }

    /**
     * 设置申请退款来源（0：线上1：业务人员）
     *
     * @param source 申请退款来源（0：线上1：业务人员）
     */
    public void setSource(Short source) {
        this.source = source;
    }

    /**
     * 获取状态1:退款拒绝；9：审核中10：退款成功）
     *
     * @return status - 状态1:退款拒绝；9：审核中10：退款成功）
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置状态1:退款拒绝；9：审核中10：退款成功）
     *
     * @param status 状态1:退款拒绝；9：审核中10：退款成功）
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取申请退款时间
     *
     * @return create_time - 申请退款时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置申请退款时间
     *
     * @param createTime 申请退款时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}