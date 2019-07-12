package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_cust_check")
public class TbCustCheck {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联企业用户id
     */
    @Column(name = "cust_id")
    private Integer custId;

    /**
     * 审批用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 0:审核不通过；1：审核通过
     */
    private Integer pass;

    /**
     * 审核意见
     */
    private String opinion;

    /**
     * 审核时间
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
     * 获取关联企业用户id
     *
     * @return cust_id - 关联企业用户id
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * 设置关联企业用户id
     *
     * @param custId 关联企业用户id
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * 获取审批用户id
     *
     * @return user_id - 审批用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置审批用户id
     *
     * @param userId 审批用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取0:审核不通过；1：审核通过
     *
     * @return pass - 0:审核不通过；1：审核通过
     */
    public Integer getPass() {
        return pass;
    }

    /**
     * 设置0:审核不通过；1：审核通过
     *
     * @param pass 0:审核不通过；1：审核通过
     */
    public void setPass(Integer pass) {
        this.pass = pass;
    }

    /**
     * 获取审核意见
     *
     * @return opinion - 审核意见
     */
    public String getOpinion() {
        return opinion;
    }

    /**
     * 设置审核意见
     *
     * @param opinion 审核意见
     */
    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    /**
     * 获取审核时间
     *
     * @return create_time - 审核时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置审核时间
     *
     * @param createTime 审核时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}