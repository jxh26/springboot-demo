package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_role")
public class TbRole {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 角色名称
     */
    @Column(name = "roleName")
    private String rolename;

    /**
     * 角色类型管理员或用户等
     */
    private String type;

    /**
     * 创建者id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否启用（0：未启用，1：已启用）
     */
    @Column(name = "is_use")
    private Integer isUse;

    /**
     * 数据状态（0：删除；1正常）
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
     * 获取角色名称
     *
     * @return roleName - 角色名称
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * 设置角色名称
     *
     * @param rolename 角色名称
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    /**
     * 获取角色类型管理员或用户等
     *
     * @return type - 角色类型管理员或用户等
     */
    public String getType() {
        return type;
    }

    /**
     * 设置角色类型管理员或用户等
     *
     * @param type 角色类型管理员或用户等
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取创建者id
     *
     * @return user_id - 创建者id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置创建者id
     *
     * @param userId 创建者id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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

    /**
     * 获取是否启用（0：未启用，1：已启用）
     *
     * @return is_use - 是否启用（0：未启用，1：已启用）
     */
    public Integer getIsUse() {
        return isUse;
    }

    /**
     * 设置是否启用（0：未启用，1：已启用）
     *
     * @param isUse 是否启用（0：未启用，1：已启用）
     */
    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }

    /**
     * 获取数据状态（0：删除；1正常）
     *
     * @return status - 数据状态（0：删除；1正常）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置数据状态（0：删除；1正常）
     *
     * @param status 数据状态（0：删除；1正常）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}