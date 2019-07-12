package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_get_car")
public class TbGetCar {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联企业客户表主键
     */
    @Column(name = "cust_id")
    private Integer custId;

    /**
     * 关联订单管理表主键
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 关联车辆表主键
     */
    @Column(name = "car_id")
    private Integer carId;

    @Column(name = "user_id")
    private Integer userId;

    /**
     * 格式YYYY-MM-DD HH：mm
     */
    @Column(name = "get_time")
    private Date getTime;

    /**
     * 油表刻度
     */
    private Float scale;

    /**
     * 当前公里数据(单位：公里)
     */
    @Column(name = "current_kil")
    private Float currentKil;

    /**
     * 提车交接确认单图片地址
     */
    @Column(name = "confirm_url")
    private String confirmUrl;

    private String remark;

    /**
     * 状态（0：无效1：正常）
     */
    private Short status;

    /**
     * 提车办理时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
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
     * 获取关联企业客户表主键
     *
     * @return cust_id - 关联企业客户表主键
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * 设置关联企业客户表主键
     *
     * @param custId 关联企业客户表主键
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * 获取关联订单管理表主键
     *
     * @return order_id - 关联订单管理表主键
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置关联订单管理表主键
     *
     * @param orderId 关联订单管理表主键
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取关联车辆表主键
     *
     * @return car_id - 关联车辆表主键
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 设置关联车辆表主键
     *
     * @param carId 关联车辆表主键
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
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
     * 获取格式YYYY-MM-DD HH：mm
     *
     * @return get_time - 格式YYYY-MM-DD HH：mm
     */
    public Date getGetTime() {
        return getTime;
    }

    /**
     * 设置格式YYYY-MM-DD HH：mm
     *
     * @param getTime 格式YYYY-MM-DD HH：mm
     */
    public void setGetTime(Date getTime) {
        this.getTime = getTime;
    }

    /**
     * 获取油表刻度
     *
     * @return scale - 油表刻度
     */
    public Float getScale() {
        return scale;
    }

    /**
     * 设置油表刻度
     *
     * @param scale 油表刻度
     */
    public void setScale(Float scale) {
        this.scale = scale;
    }

    /**
     * 获取当前公里数据(单位：公里)
     *
     * @return current_kil - 当前公里数据(单位：公里)
     */
    public Float getCurrentKil() {
        return currentKil;
    }

    /**
     * 设置当前公里数据(单位：公里)
     *
     * @param currentKil 当前公里数据(单位：公里)
     */
    public void setCurrentKil(Float currentKil) {
        this.currentKil = currentKil;
    }

    /**
     * 获取提车交接确认单图片地址
     *
     * @return confirm_url - 提车交接确认单图片地址
     */
    public String getConfirmUrl() {
        return confirmUrl;
    }

    /**
     * 设置提车交接确认单图片地址
     *
     * @param confirmUrl 提车交接确认单图片地址
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
     * 获取状态（0：无效1：正常）
     *
     * @return status - 状态（0：无效1：正常）
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置状态（0：无效1：正常）
     *
     * @param status 状态（0：无效1：正常）
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取提车办理时间
     *
     * @return create_time - 提车办理时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置提车办理时间
     *
     * @param createTime 提车办理时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}