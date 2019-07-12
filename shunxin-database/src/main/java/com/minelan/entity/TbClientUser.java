package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_client_user")
public class TbClientUser {
    /**
     * 主键id和tb_cust里对应一致
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 企业客户名称
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取主键id和tb_cust里对应一致
     *
     * @return id - 主键id和tb_cust里对应一致
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id和tb_cust里对应一致
     *
     * @param id 主键id和tb_cust里对应一致
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取企业客户名称
     *
     * @return username - 企业客户名称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置企业客户名称
     *
     * @param username 企业客户名称
     */
    public void setUsername(String username) {
        this.username = username;
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
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
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