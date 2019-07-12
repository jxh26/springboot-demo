package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_handed_car")
public class TbHandedCar {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 管理派车管理主键
     */
    @Column(name = "send_id")
    private Integer sendId;

    /**
     * 订单编号
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 交车时间
     */
    @Column(name = "handed_time")
    private Date handedTime;

    /**
     * 交车公里数
     */
    private Float kil;

    /**
     * 交车油表刻度
     */
    private Float scale;

    /**
     * 交车确认单
     */
    @Column(name = "confirm_url")
    private String confirmUrl;

    /**
     * 状态（0：待交车 1：已交车）
     */
    private Short status;

    @Column(name = "user_id")
    private Integer userId;

    private String remark;

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
     * 获取管理派车管理主键
     *
     * @return send_id - 管理派车管理主键
     */
    public Integer getSendId() {
        return sendId;
    }

    /**
     * 设置管理派车管理主键
     *
     * @param sendId 管理派车管理主键
     */
    public void setSendId(Integer sendId) {
        this.sendId = sendId;
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
     * 获取交车时间
     *
     * @return handed_time - 交车时间
     */
    public Date getHandedTime() {
        return handedTime;
    }

    /**
     * 设置交车时间
     *
     * @param handedTime 交车时间
     */
    public void setHandedTime(Date handedTime) {
        this.handedTime = handedTime;
    }

    /**
     * 获取交车公里数
     *
     * @return kil - 交车公里数
     */
    public Float getKil() {
        return kil;
    }

    /**
     * 设置交车公里数
     *
     * @param kil 交车公里数
     */
    public void setKil(Float kil) {
        this.kil = kil;
    }

    /**
     * 获取交车油表刻度
     *
     * @return scale - 交车油表刻度
     */
    public Float getScale() {
        return scale;
    }

    /**
     * 设置交车油表刻度
     *
     * @param scale 交车油表刻度
     */
    public void setScale(Float scale) {
        this.scale = scale;
    }

    /**
     * 获取交车确认单
     *
     * @return confirm_url - 交车确认单
     */
    public String getConfirmUrl() {
        return confirmUrl;
    }

    /**
     * 设置交车确认单
     *
     * @param confirmUrl 交车确认单
     */
    public void setConfirmUrl(String confirmUrl) {
        this.confirmUrl = confirmUrl;
    }

    /**
     * 获取状态（0：待交车 1：已交车）
     *
     * @return status - 状态（0：待交车 1：已交车）
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置状态（0：待交车 1：已交车）
     *
     * @param status 状态（0：待交车 1：已交车）
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
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
}