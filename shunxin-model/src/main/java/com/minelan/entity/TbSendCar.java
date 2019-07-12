package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_send_car")
public class TbSendCar {
    /**
     * 派车管理主键
     */
    @Id
    @Column(name = "send_id")
    private Integer sendId;

    /**
     * 订单管理主键
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 车辆管理主键
     */
    @Column(name = "car_id")
    private Integer carId;

    /**
     * 派车时间
     */
    @Column(name = "send_time")
    private Date sendTime;

    /**
     * 派车地点
     */
    private String address;

    /**
     * 当前公里数据
     */
    @Column(name = "current_kil")
    private Float currentKil;

    /**
     * 油表刻度
     */
    private Float scale;

    /**
     * 司机管理主键
     */
    @Column(name = "driver_id")
    private Integer driverId;

    /**
     * 派车交接确认单图片地址
     */
    @Column(name = "confirm_url")
    private String confirmUrl;

    /**
     * 备注
     */
    private String remark;

    /**
     * 结束服务-返车公里数据
     */
    @Column(name = "return_kil")
    private Float returnKil;

    /**
     * 结束服务-返车油表刻度
     */
    @Column(name = "return_scale")
    private Float returnScale;

    /**
     * 结束服务-送到时间
     */
    @Column(name = "finish_time")
    private Date finishTime;

    /**
     * 结束服务-返车附件
     */
    @Column(name = "return_url")
    private String returnUrl;

    @Column(name = "return_remark")
    private String returnRemark;

    /**
     * 创建人
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 派车状态（0：已派车1：已完成服务2：已取消 3:已派车-已取消）
     */
    private Short status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "cancel_order")
    private Short cancelOrder;

    /**
     * 获取派车管理主键
     *
     * @return send_id - 派车管理主键
     */
    public Integer getSendId() {
        return sendId;
    }

    /**
     * 设置派车管理主键
     *
     * @param sendId 派车管理主键
     */
    public void setSendId(Integer sendId) {
        this.sendId = sendId;
    }

    /**
     * 获取订单管理主键
     *
     * @return order_id - 订单管理主键
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单管理主键
     *
     * @param orderId 订单管理主键
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取车辆管理主键
     *
     * @return car_id - 车辆管理主键
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 设置车辆管理主键
     *
     * @param carId 车辆管理主键
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * 获取派车时间
     *
     * @return send_time - 派车时间
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 设置派车时间
     *
     * @param sendTime 派车时间
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 获取派车地点
     *
     * @return address - 派车地点
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置派车地点
     *
     * @param address 派车地点
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取当前公里数据
     *
     * @return current_kil - 当前公里数据
     */
    public Float getCurrentKil() {
        return currentKil;
    }

    /**
     * 设置当前公里数据
     *
     * @param currentKil 当前公里数据
     */
    public void setCurrentKil(Float currentKil) {
        this.currentKil = currentKil;
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
     * 获取司机管理主键
     *
     * @return driver_id - 司机管理主键
     */
    public Integer getDriverId() {
        return driverId;
    }

    /**
     * 设置司机管理主键
     *
     * @param driverId 司机管理主键
     */
    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    /**
     * 获取派车交接确认单图片地址
     *
     * @return confirm_url - 派车交接确认单图片地址
     */
    public String getConfirmUrl() {
        return confirmUrl;
    }

    /**
     * 设置派车交接确认单图片地址
     *
     * @param confirmUrl 派车交接确认单图片地址
     */
    public void setConfirmUrl(String confirmUrl) {
        this.confirmUrl = confirmUrl;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取结束服务-返车公里数据
     *
     * @return return_kil - 结束服务-返车公里数据
     */
    public Float getReturnKil() {
        return returnKil;
    }

    /**
     * 设置结束服务-返车公里数据
     *
     * @param returnKil 结束服务-返车公里数据
     */
    public void setReturnKil(Float returnKil) {
        this.returnKil = returnKil;
    }

    /**
     * 获取结束服务-返车油表刻度
     *
     * @return return_scale - 结束服务-返车油表刻度
     */
    public Float getReturnScale() {
        return returnScale;
    }

    /**
     * 设置结束服务-返车油表刻度
     *
     * @param returnScale 结束服务-返车油表刻度
     */
    public void setReturnScale(Float returnScale) {
        this.returnScale = returnScale;
    }

    /**
     * 获取结束服务-送到时间
     *
     * @return finish_time - 结束服务-送到时间
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * 设置结束服务-送到时间
     *
     * @param finishTime 结束服务-送到时间
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * 获取结束服务-返车附件
     *
     * @return return_url - 结束服务-返车附件
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * 设置结束服务-返车附件
     *
     * @param returnUrl 结束服务-返车附件
     */
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    /**
     * @return return_remark
     */
    public String getReturnRemark() {
        return returnRemark;
    }

    /**
     * @param returnRemark
     */
    public void setReturnRemark(String returnRemark) {
        this.returnRemark = returnRemark;
    }

    /**
     * 获取创建人
     *
     * @return user_id - 创建人
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置创建人
     *
     * @param userId 创建人
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取派车状态（0：已派车1：已完成服务2：已取消 3:已派车-已取消）
     *
     * @return status - 派车状态（0：已派车1：已完成服务2：已取消 3:已派车-已取消）
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置派车状态（0：已派车1：已完成服务2：已取消 3:已派车-已取消）
     *
     * @param status 派车状态（0：已派车1：已完成服务2：已取消 3:已派车-已取消）
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

    /**
     * @return cancel_order
     */
    public Short getCancelOrder() {
        return cancelOrder;
    }

    /**
     * @param cancelOrder
     */
    public void setCancelOrder(Short cancelOrder) {
        this.cancelOrder = cancelOrder;
    }
}