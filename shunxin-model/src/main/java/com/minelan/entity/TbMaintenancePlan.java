package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_maintenance_plan")
public class TbMaintenancePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 车辆定期保养计划名称
     */
    private String name;

    /**
     * 关联车辆类型表
     */
    @Column(name = "type_id")
    private Integer typeId;

    /**
     * 关联用户表
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 保养间隔时间(单位:月)
     */
    @Column(name = "interval_time")
    private Integer intervalTime;

    /**
     * 状态(0:无效1:正常)
     */
    private Byte status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取车辆定期保养计划名称
     *
     * @return name - 车辆定期保养计划名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置车辆定期保养计划名称
     *
     * @param name 车辆定期保养计划名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取关联车辆类型表
     *
     * @return type_id - 关联车辆类型表
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 设置关联车辆类型表
     *
     * @param typeId 关联车辆类型表
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取关联用户表
     *
     * @return user_id - 关联用户表
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置关联用户表
     *
     * @param userId 关联用户表
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取保养间隔时间(单位:月)
     *
     * @return interval_time - 保养间隔时间(单位:月)
     */
    public Integer getIntervalTime() {
        return intervalTime;
    }

    /**
     * 设置保养间隔时间(单位:月)
     *
     * @param intervalTime 保养间隔时间(单位:月)
     */
    public void setIntervalTime(Integer intervalTime) {
        this.intervalTime = intervalTime;
    }

    /**
     * 获取状态(0:无效1:正常)
     *
     * @return status - 状态(0:无效1:正常)
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态(0:无效1:正常)
     *
     * @param status 状态(0:无效1:正常)
     */
    public void setStatus(Byte status) {
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