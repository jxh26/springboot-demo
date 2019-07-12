package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_return_car")
public class TbReturnCar {
    /**
     * 还车管理主键
     */
    @Id
    @Column(name = "return_id")
    private Integer returnId;

    /**
     * 关联订单管理主键
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 关联提车管理表
     */
    @Column(name = "get_car_id")
    private Integer getCarId;

    /**
     * 还车时间
     */
    @Column(name = "return_time")
    private Date returnTime;

    /**
     * 还车公里数据
     */
    private Float kil;

    /**
     * 还车油表刻度
     */
    private Float scale;

    /**
     * 还车交接确认单图片地址
     */
    @Column(name = "confirm_url")
    private String confirmUrl;

    private String remark;

    /**
     * 操作用户ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 状态（0：待还车1：已还车）
     */
    private Short status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取还车管理主键
     *
     * @return return_id - 还车管理主键
     */
    public Integer getReturnId() {
        return returnId;
    }

    /**
     * 设置还车管理主键
     *
     * @param returnId 还车管理主键
     */
    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    /**
     * 获取关联订单管理主键
     *
     * @return order_id - 关联订单管理主键
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置关联订单管理主键
     *
     * @param orderId 关联订单管理主键
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取关联提车管理表
     *
     * @return get_car_id - 关联提车管理表
     */
    public Integer getGetCarId() {
        return getCarId;
    }

    /**
     * 设置关联提车管理表
     *
     * @param getCarId 关联提车管理表
     */
    public void setGetCarId(Integer getCarId) {
        this.getCarId = getCarId;
    }

    /**
     * 获取还车时间
     *
     * @return return_time - 还车时间
     */
    public Date getReturnTime() {
        return returnTime;
    }

    /**
     * 设置还车时间
     *
     * @param returnTime 还车时间
     */
    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    /**
     * 获取还车公里数据
     *
     * @return kil - 还车公里数据
     */
    public Float getKil() {
        return kil;
    }

    /**
     * 设置还车公里数据
     *
     * @param kil 还车公里数据
     */
    public void setKil(Float kil) {
        this.kil = kil;
    }

    /**
     * 获取还车油表刻度
     *
     * @return scale - 还车油表刻度
     */
    public Float getScale() {
        return scale;
    }

    /**
     * 设置还车油表刻度
     *
     * @param scale 还车油表刻度
     */
    public void setScale(Float scale) {
        this.scale = scale;
    }

    /**
     * 获取还车交接确认单图片地址
     *
     * @return confirm_url - 还车交接确认单图片地址
     */
    public String getConfirmUrl() {
        return confirmUrl;
    }

    /**
     * 设置还车交接确认单图片地址
     *
     * @param confirmUrl 还车交接确认单图片地址
     */
    public void setConfirmUrl(String confirmUrl) {
        this.confirmUrl = confirmUrl;
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
     * 获取操作用户ID
     *
     * @return user_id - 操作用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置操作用户ID
     *
     * @param userId 操作用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取状态（0：待还车1：已还车）
     *
     * @return status - 状态（0：待还车1：已还车）
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置状态（0：待还车1：已还车）
     *
     * @param status 状态（0：待还车1：已还车）
     */
    public void setStatus(Short status) {
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