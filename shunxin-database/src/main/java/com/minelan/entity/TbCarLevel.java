package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_car_level")
public class TbCarLevel {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 级别名称（如：舒适型、经济型等）
     */
    private String name;

    /**
     * 级别简称
     */
    @Column(name = "short_name")
    private String shortName;

    private String remark;

    /**
     * 状态(0:删除 1：正常)
     */
    private Integer status;

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
     * 获取级别名称（如：舒适型、经济型等）
     *
     * @return name - 级别名称（如：舒适型、经济型等）
     */
    public String getName() {
        return name;
    }

    /**
     * 设置级别名称（如：舒适型、经济型等）
     *
     * @param name 级别名称（如：舒适型、经济型等）
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取级别简称
     *
     * @return short_name - 级别简称
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 设置级别简称
     *
     * @param shortName 级别简称
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
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
     * 获取状态(0:删除 1：正常)
     *
     * @return status - 状态(0:删除 1：正常)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态(0:删除 1：正常)
     *
     * @param status 状态(0:删除 1：正常)
     */
    public void setStatus(Integer status) {
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