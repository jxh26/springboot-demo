package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user")
public class TbUser {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 工号
     */
    private String num;

    /**
     * 用户名
     */
    private String username;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别f:女m:男
     */
    private String sex;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户类型（0：管理员，1：客户）
     */
    private Integer type;

    /**
     * 职位
     */
    private String place;

    /**
     * 手机号
     */
    private String telephone;

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
     * 最后登录时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    /**
     * 状态 0：停用 1 启用
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
     * 获取工号
     *
     * @return num - 工号
     */
    public String getNum() {
        return num;
    }

    /**
     * 设置工号
     *
     * @param num 工号
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别f:女m:男
     *
     * @return sex - 性别f:女m:男
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别f:女m:男
     *
     * @param sex 性别f:女m:男
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户类型（0：管理员，1：客户）
     *
     * @return type - 用户类型（0：管理员，1：客户）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置用户类型（0：管理员，1：客户）
     *
     * @param type 用户类型（0：管理员，1：客户）
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取职位
     *
     * @return place - 职位
     */
    public String getPlace() {
        return place;
    }

    /**
     * 设置职位
     *
     * @param place 职位
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * 获取手机号
     *
     * @return telephone - 手机号
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置手机号
     *
     * @param telephone 手机号
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
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
     * 获取最后登录时间
     *
     * @return last_login_time - 最后登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastLoginTime 最后登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取状态 0：停用 1 启用
     *
     * @return status - 状态 0：停用 1 启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 0：停用 1 启用
     *
     * @param status 状态 0：停用 1 启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}