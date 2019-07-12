package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_peccancy")
public class TbPeccancy {
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
     * 违章单号
     */
    private String num;

    /**
     * 违章时间
     */
    @Column(name = "pe_time")
    private Date peTime;

    /**
     * 扣分
     */
    private Integer points;

    /**
     * 交警公示时间
     */
    @Column(name = "show_time")
    private Date showTime;

    /**
     * 违章地址
     */
    private String address;

    /**
     * 违章行为
     */
    private String behave;

    /**
     * 责任方（0：客户责任；1：我司责任）
     */
    private Integer responsibility;

    /**
     * 处理方式（0：客户处理；1：我司责任；
若责任方为1，处理方式默认为1）
     */
    private Integer handler;

    /**
     * 罚款
     */
    private Integer fine;

    /**
     * 处理时间
     */
    @Column(name = "hand_time")
    private Date handTime;

    /**
     * 代办费
     */
    @Column(name = "agency_fee")
    private Integer agencyFee;

    /**
     * 滞纳金
     */
    @Column(name = "late_fee")
    private Integer lateFee;

    /**
     * 处理罚分
     */
    private Integer penalty;

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
     * 获取违章单号
     *
     * @return num - 违章单号
     */
    public String getNum() {
        return num;
    }

    /**
     * 设置违章单号
     *
     * @param num 违章单号
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * 获取违章时间
     *
     * @return pe_time - 违章时间
     */
    public Date getPeTime() {
        return peTime;
    }

    /**
     * 设置违章时间
     *
     * @param peTime 违章时间
     */
    public void setPeTime(Date peTime) {
        this.peTime = peTime;
    }

    /**
     * 获取扣分
     *
     * @return points - 扣分
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * 设置扣分
     *
     * @param points 扣分
     */
    public void setPoints(Integer points) {
        this.points = points;
    }

    /**
     * 获取交警公示时间
     *
     * @return show_time - 交警公示时间
     */
    public Date getShowTime() {
        return showTime;
    }

    /**
     * 设置交警公示时间
     *
     * @param showTime 交警公示时间
     */
    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    /**
     * 获取违章地址
     *
     * @return address - 违章地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置违章地址
     *
     * @param address 违章地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取违章行为
     *
     * @return behave - 违章行为
     */
    public String getBehave() {
        return behave;
    }

    /**
     * 设置违章行为
     *
     * @param behave 违章行为
     */
    public void setBehave(String behave) {
        this.behave = behave;
    }

    /**
     * 获取责任方（0：客户责任；1：我司责任）
     *
     * @return responsibility - 责任方（0：客户责任；1：我司责任）
     */
    public Integer getResponsibility() {
        return responsibility;
    }

    /**
     * 设置责任方（0：客户责任；1：我司责任）
     *
     * @param responsibility 责任方（0：客户责任；1：我司责任）
     */
    public void setResponsibility(Integer responsibility) {
        this.responsibility = responsibility;
    }

    /**
     * 获取处理方式（0：客户处理；1：我司责任；
若责任方为1，处理方式默认为1）
     *
     * @return handler - 处理方式（0：客户处理；1：我司责任；
若责任方为1，处理方式默认为1）
     */
    public Integer getHandler() {
        return handler;
    }

    /**
     * 设置处理方式（0：客户处理；1：我司责任；
若责任方为1，处理方式默认为1）
     *
     * @param handler 处理方式（0：客户处理；1：我司责任；
若责任方为1，处理方式默认为1）
     */
    public void setHandler(Integer handler) {
        this.handler = handler;
    }

    /**
     * 获取罚款
     *
     * @return fine - 罚款
     */
    public Integer getFine() {
        return fine;
    }

    /**
     * 设置罚款
     *
     * @param fine 罚款
     */
    public void setFine(Integer fine) {
        this.fine = fine;
    }

    /**
     * 获取处理时间
     *
     * @return hand_time - 处理时间
     */
    public Date getHandTime() {
        return handTime;
    }

    /**
     * 设置处理时间
     *
     * @param handTime 处理时间
     */
    public void setHandTime(Date handTime) {
        this.handTime = handTime;
    }

    /**
     * 获取代办费
     *
     * @return agency_fee - 代办费
     */
    public Integer getAgencyFee() {
        return agencyFee;
    }

    /**
     * 设置代办费
     *
     * @param agencyFee 代办费
     */
    public void setAgencyFee(Integer agencyFee) {
        this.agencyFee = agencyFee;
    }

    /**
     * 获取滞纳金
     *
     * @return late_fee - 滞纳金
     */
    public Integer getLateFee() {
        return lateFee;
    }

    /**
     * 设置滞纳金
     *
     * @param lateFee 滞纳金
     */
    public void setLateFee(Integer lateFee) {
        this.lateFee = lateFee;
    }

    /**
     * 获取处理罚分
     *
     * @return penalty - 处理罚分
     */
    public Integer getPenalty() {
        return penalty;
    }

    /**
     * 设置处理罚分
     *
     * @param penalty 处理罚分
     */
    public void setPenalty(Integer penalty) {
        this.penalty = penalty;
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