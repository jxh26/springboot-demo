package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_car_testing")
public class TbCarTesting {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 创建人
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 关联车辆id
     */
    @Column(name = "car_id")
    private Integer carId;

    /**
     * 验车费用
     */
    private Double cost;

    /**
     * 验车地址
     */
    private String address;

    /**
     * 备注
     */
    private String remark;

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
     * 数据状态（0：删除，1正常）
     */
    private Integer status;

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
     * 获取关联车辆id
     *
     * @return car_id - 关联车辆id
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 设置关联车辆id
     *
     * @param carId 关联车辆id
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * 获取验车费用
     *
     * @return cost - 验车费用
     */
    public Double getCost() {
        return cost;
    }

    /**
     * 设置验车费用
     *
     * @param cost 验车费用
     */
    public void setCost(Double cost) {
        this.cost = cost;
    }

    /**
     * 获取验车地址
     *
     * @return address - 验车地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置验车地址
     *
     * @param address 验车地址
     */
    public void setAddress(String address) {
        this.address = address;
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

    /**
     * 获取数据状态（0：删除，1正常）
     *
     * @return status - 数据状态（0：删除，1正常）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置数据状态（0：删除，1正常）
     *
     * @param status 数据状态（0：删除，1正常）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}