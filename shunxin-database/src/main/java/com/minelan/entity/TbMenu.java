package com.minelan.entity;

import javax.persistence.*;

@Table(name = "tb_menu")
public class TbMenu {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 父级菜单id字符串，以“,”号间隔
     */
    @Column(name = "parent_ids")
    private String parentIds;

    /**
     * 父级菜单id一级菜单此项全部为0
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 请求链接（servlet的路径）
     */
    private String href;

    /**
     * 跳转方式指向打开页面，可为空由前端开发控制
     */
    private String target;

    /**
     * 图标路径，部分功能无图标
     */
    private String icon;

    /**
     * 是否显示（需要在菜单栏的全部是1，其他全部是0）
     */
    @Column(name = "is_show")
    private Integer isShow;

    /**
     * 排序序号
     */
    private Integer sort;

    /**
     * 权限标识，和shiro注解上要求一致
     */
    private String permission;

    /**
     * 数据状态（0：删除，1：正常）
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
     * 获取父级菜单id字符串，以“,”号间隔
     *
     * @return parent_ids - 父级菜单id字符串，以“,”号间隔
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * 设置父级菜单id字符串，以“,”号间隔
     *
     * @param parentIds 父级菜单id字符串，以“,”号间隔
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    /**
     * 获取父级菜单id一级菜单此项全部为0
     *
     * @return parent_id - 父级菜单id一级菜单此项全部为0
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置父级菜单id一级菜单此项全部为0
     *
     * @param parentId 父级菜单id一级菜单此项全部为0
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取菜单名称
     *
     * @return name - 菜单名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置菜单名称
     *
     * @param name 菜单名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取请求链接（servlet的路径）
     *
     * @return href - 请求链接（servlet的路径）
     */
    public String getHref() {
        return href;
    }

    /**
     * 设置请求链接（servlet的路径）
     *
     * @param href 请求链接（servlet的路径）
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * 获取跳转方式指向打开页面，可为空由前端开发控制
     *
     * @return target - 跳转方式指向打开页面，可为空由前端开发控制
     */
    public String getTarget() {
        return target;
    }

    /**
     * 设置跳转方式指向打开页面，可为空由前端开发控制
     *
     * @param target 跳转方式指向打开页面，可为空由前端开发控制
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * 获取图标路径，部分功能无图标
     *
     * @return icon - 图标路径，部分功能无图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标路径，部分功能无图标
     *
     * @param icon 图标路径，部分功能无图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取是否显示（需要在菜单栏的全部是1，其他全部是0）
     *
     * @return is_show - 是否显示（需要在菜单栏的全部是1，其他全部是0）
     */
    public Integer getIsShow() {
        return isShow;
    }

    /**
     * 设置是否显示（需要在菜单栏的全部是1，其他全部是0）
     *
     * @param isShow 是否显示（需要在菜单栏的全部是1，其他全部是0）
     */
    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    /**
     * 获取排序序号
     *
     * @return sort - 排序序号
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序序号
     *
     * @param sort 排序序号
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取权限标识，和shiro注解上要求一致
     *
     * @return permission - 权限标识，和shiro注解上要求一致
     */
    public String getPermission() {
        return permission;
    }

    /**
     * 设置权限标识，和shiro注解上要求一致
     *
     * @param permission 权限标识，和shiro注解上要求一致
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * 获取数据状态（0：删除，1：正常）
     *
     * @return status - 数据状态（0：删除，1：正常）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置数据状态（0：删除，1：正常）
     *
     * @param status 数据状态（0：删除，1：正常）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}