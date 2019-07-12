package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_car_dynamic_info")
public class TbCarDynamicInfo {
    /**
     * 车辆主键
     */
    @Id
    @Column(name = "car_id")
    private Integer carId;

    /**
     * 最新公里数
     */
    @Column(name = "last_kilometer")
    private Double lastKilometer;

    /**
     * 最新油表刻度
     */
    @Column(name = "last_scale")
    private Double lastScale;

    /**
     * 累积保养次数
     */
    @Column(name = "maintennace_count")
    private Integer maintennaceCount;

    /**
     * 最近保养时间
     */
    @Column(name = "last_maintenance_time")
    private Date lastMaintenanceTime;

    /**
     * 是否服务中（0:服务中 1：待用）
     */
    private Short status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取车辆主键
     *
     * @return car_id - 车辆主键
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 设置车辆主键
     *
     * @param carId 车辆主键
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * 获取最新公里数
     *
     * @return last_kilometer - 最新公里数
     */
    public Double getLastKilometer() {
        return lastKilometer;
    }

    /**
     * 设置最新公里数
     *
     * @param lastKilometer 最新公里数
     */
    public void setLastKilometer(Double lastKilometer) {
        this.lastKilometer = lastKilometer;
    }

    /**
     * 获取最新油表刻度
     *
     * @return last_scale - 最新油表刻度
     */
    public Double getLastScale() {
        return lastScale;
    }

    /**
     * 设置最新油表刻度
     *
     * @param lastScale 最新油表刻度
     */
    public void setLastScale(Double lastScale) {
        this.lastScale = lastScale;
    }

    /**
     * 获取累积保养次数
     *
     * @return maintennace_count - 累积保养次数
     */
    public Integer getMaintennaceCount() {
        return maintennaceCount;
    }

    /**
     * 设置累积保养次数
     *
     * @param maintennaceCount 累积保养次数
     */
    public void setMaintennaceCount(Integer maintennaceCount) {
        this.maintennaceCount = maintennaceCount;
    }

    /**
     * 获取最近保养时间
     *
     * @return last_maintenance_time - 最近保养时间
     */
    public Date getLastMaintenanceTime() {
        return lastMaintenanceTime;
    }

    /**
     * 设置最近保养时间
     *
     * @param lastMaintenanceTime 最近保养时间
     */
    public void setLastMaintenanceTime(Date lastMaintenanceTime) {
        this.lastMaintenanceTime = lastMaintenanceTime;
    }

    /**
     * 获取是否服务中（0:服务中 1：待用）
     *
     * @return status - 是否服务中（0:服务中 1：待用）
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置是否服务中（0:服务中 1：待用）
     *
     * @param status 是否服务中（0:服务中 1：待用）
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}