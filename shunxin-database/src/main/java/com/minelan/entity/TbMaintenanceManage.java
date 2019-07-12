package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_maintenance_manage")
public class TbMaintenanceManage {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联车辆表
     */
    @Column(name = "car_id")
    private Integer carId;

    /**
     * 保养地址
     */
    private String address;

    private String remark;

    /**
     * 记录状态0无效1正常
     */
    private Short status;

    /**
     * 创建时间
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
     * 获取关联车辆表
     *
     * @return car_id - 关联车辆表
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 设置关联车辆表
     *
     * @param carId 关联车辆表
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * 获取保养地址
     *
     * @return address - 保养地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置保养地址
     *
     * @param address 保养地址
     */
    public void setAddress(String address) {
        this.address = address;
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
     * 获取记录状态0无效1正常
     *
     * @return status - 记录状态0无效1正常
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置记录状态0无效1正常
     *
     * @param status 记录状态0无效1正常
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
}