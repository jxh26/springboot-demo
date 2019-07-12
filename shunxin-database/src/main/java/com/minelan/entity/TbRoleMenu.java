package com.minelan.entity;

import javax.persistence.*;

@Table(name = "tb_role_menu")
public class TbRoleMenu {
    /**
     * 角色id
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 权限(菜单里包括权限符)id
     */
    @Column(name = "menu_id")
    private Integer menuId;

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取权限(菜单里包括权限符)id
     *
     * @return menu_id - 权限(菜单里包括权限符)id
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置权限(菜单里包括权限符)id
     *
     * @param menuId 权限(菜单里包括权限符)id
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}