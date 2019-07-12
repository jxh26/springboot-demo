package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_cust_contact")
public class TbCustContact {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联企业用户id
     */
    @Column(name = "cust_id")
    private Integer custId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别（m:男；f：女）
     */
    private String sex;

    /**
     * 联系电话
     */
    private String telephone;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 职位
     */
    private String place;

    /**
     * 所在部门
     */
    private String department;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 联系人状态（0：删除；1：正常）
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
     * 获取关联企业用户id
     *
     * @return cust_id - 关联企业用户id
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * 设置关联企业用户id
     *
     * @param custId 关联企业用户id
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
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
     * 获取性别（m:男；f：女）
     *
     * @return sex - 性别（m:男；f：女）
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别（m:男；f：女）
     *
     * @param sex 性别（m:男；f：女）
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取联系电话
     *
     * @return telephone - 联系电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置联系电话
     *
     * @param telephone 联系电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取电子邮箱
     *
     * @return email - 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮箱
     *
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email;
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
     * 获取所在部门
     *
     * @return department - 所在部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置所在部门
     *
     * @param department 所在部门
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取联系人状态（0：删除；1：正常）
     *
     * @return status - 联系人状态（0：删除；1：正常）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置联系人状态（0：删除；1：正常）
     *
     * @param status 联系人状态（0：删除；1：正常）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}