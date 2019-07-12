package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_settle_check")
public class TbSettleCheck {
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
     * 审批人id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 审批时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 是否通过（3：不通过，2：通过 1:待审核）
     */
    private Integer pass;

    /**
     * 审批意见
     */
    private String opinion;

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
     * 获取审批人id
     *
     * @return user_id - 审批人id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置审批人id
     *
     * @param userId 审批人id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取审批时间
     *
     * @return create_time - 审批时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置审批时间
     *
     * @param createTime 审批时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取是否通过（3：不通过，2：通过 1:待审核）
     *
     * @return pass - 是否通过（3：不通过，2：通过 1:待审核）
     */
    public Integer getPass() {
        return pass;
    }

    /**
     * 设置是否通过（3：不通过，2：通过 1:待审核）
     *
     * @param pass 是否通过（3：不通过，2：通过 1:待审核）
     */
    public void setPass(Integer pass) {
        this.pass = pass;
    }

    /**
     * 获取审批意见
     *
     * @return opinion - 审批意见
     */
    public String getOpinion() {
        return opinion;
    }

    /**
     * 设置审批意见
     *
     * @param opinion 审批意见
     */
    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}