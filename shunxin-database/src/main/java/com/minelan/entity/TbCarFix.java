package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_car_fix")
public class TbCarFix {
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
     * 车辆id
     */
    @Column(name = "car_id")
    private Integer carId;

    /**
     * 送修单号
     */
    private String num;

    /**
     * 维修金额
     */
    private Double cost;

    /**
     * 预计修理完成时间
     */
    @Column(name = "fix_time")
    private Date fixTime;

    @Column(name = "send_person")
    private String sendPerson;

    /**
     * 进厂公里数
     */
    @Column(name = "send_kilo")
    private Integer sendKilo;

    /**
     * 进厂油表刻度
     */
    @Column(name = "send_oil")
    private Integer sendOil;

    /**
     * 维修厂
     */
    @Column(name = "repair_shop")
    private String repairShop;

    /**
     * 维修电话
     */
    private String telephone;

    /**
     * 维修厂地址
     */
    private String address;

    /**
     * 附件图片路径
     */
    @Column(name = "file_url")
    private String fileUrl;

    /**
     * 备注消息
     */
    private String remark;

    /**
     * 订单状态（0：删除；1：待取回；
2：；3：待结算；4：已完成）
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
     * 获取车辆id
     *
     * @return car_id - 车辆id
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 设置车辆id
     *
     * @param carId 车辆id
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * 获取送修单号
     *
     * @return num - 送修单号
     */
    public String getNum() {
        return num;
    }

    /**
     * 设置送修单号
     *
     * @param num 送修单号
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * 获取维修金额
     *
     * @return cost - 维修金额
     */
    public Double getCost() {
        return cost;
    }

    /**
     * 设置维修金额
     *
     * @param cost 维修金额
     */
    public void setCost(Double cost) {
        this.cost = cost;
    }

    /**
     * 获取预计修理完成时间
     *
     * @return fix_time - 预计修理完成时间
     */
    public Date getFixTime() {
        return fixTime;
    }

    /**
     * 设置预计修理完成时间
     *
     * @param fixTime 预计修理完成时间
     */
    public void setFixTime(Date fixTime) {
        this.fixTime = fixTime;
    }

    /**
     * @return send_person
     */
    public String getSendPerson() {
        return sendPerson;
    }

    /**
     * @param sendPerson
     */
    public void setSendPerson(String sendPerson) {
        this.sendPerson = sendPerson;
    }

    /**
     * 获取进厂公里数
     *
     * @return send_kilo - 进厂公里数
     */
    public Integer getSendKilo() {
        return sendKilo;
    }

    /**
     * 设置进厂公里数
     *
     * @param sendKilo 进厂公里数
     */
    public void setSendKilo(Integer sendKilo) {
        this.sendKilo = sendKilo;
    }

    /**
     * 获取进厂油表刻度
     *
     * @return send_oil - 进厂油表刻度
     */
    public Integer getSendOil() {
        return sendOil;
    }

    /**
     * 设置进厂油表刻度
     *
     * @param sendOil 进厂油表刻度
     */
    public void setSendOil(Integer sendOil) {
        this.sendOil = sendOil;
    }

    /**
     * 获取维修厂
     *
     * @return repair_shop - 维修厂
     */
    public String getRepairShop() {
        return repairShop;
    }

    /**
     * 设置维修厂
     *
     * @param repairShop 维修厂
     */
    public void setRepairShop(String repairShop) {
        this.repairShop = repairShop;
    }

    /**
     * 获取维修电话
     *
     * @return telephone - 维修电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置维修电话
     *
     * @param telephone 维修电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取维修厂地址
     *
     * @return address - 维修厂地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置维修厂地址
     *
     * @param address 维修厂地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取附件图片路径
     *
     * @return file_url - 附件图片路径
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * 设置附件图片路径
     *
     * @param fileUrl 附件图片路径
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    /**
     * 获取备注消息
     *
     * @return remark - 备注消息
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注消息
     *
     * @param remark 备注消息
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取订单状态（0：删除；1：待取回；
2：；3：待结算；4：已完成）
     *
     * @return status - 订单状态（0：删除；1：待取回；
2：；3：待结算；4：已完成）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置订单状态（0：删除；1：待取回；
2：；3：待结算；4：已完成）
     *
     * @param status 订单状态（0：删除；1：待取回；
2：；3：待结算；4：已完成）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}