package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_validate_car_warn")
public class TbValidateCarWarn {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 车辆主键
     */
    @Column(name = "car_id")
    private Integer carId;

    /**
     * 状态（0：已验车1：需要验车）
     */
    private Short status;

    @Column(name = "creat_time")
    private Date creatTime;

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
     * 获取状态（0：已验车1：需要验车）
     *
     * @return status - 状态（0：已验车1：需要验车）
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置状态（0：已验车1：需要验车）
     *
     * @param status 状态（0：已验车1：需要验车）
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * @return creat_time
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * @param creatTime
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
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