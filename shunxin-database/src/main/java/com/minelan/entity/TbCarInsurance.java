package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_car_insurance")
public class TbCarInsurance {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联车辆id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 0:审核不通过；1：审核通过
     */
    @Column(name = "car_id")
    private Integer carId;

    /**
     * 保险单号
     */
    private String num;

    /**
     * 关联保险公司id
     */
    @Column(name = "insu_comp_id")
    private Integer insuCompId;

    /**
     * 保险类型
     */
    @Column(name = "insu_type")
    private String insuType;

    /**
     * 商业保险单号
     */
    @Column(name = "commercial_policy")
    private String commercialPolicy;

    /**
     * 保险生效时间
     */
    @Column(name = "effect_time")
    private Date effectTime;

    /**
     * 保险失效时间
     */
    @Column(name = "fail_time")
    private Date failTime;

    /**
     * 交强险
     */
    private Double insurance;

    @Column(name = "third_insurance")
    private Double thirdInsurance;

    /**
     * 车损险
     */
    @Column(name = "car_insurance")
    private Double carInsurance;

    /**
     * 人员险
     */
    @Column(name = "personnel_insurance")
    private Double personnelInsurance;

    /**
     * 玻璃险
     */
    @Column(name = "glass_insurance")
    private Double glassInsurance;

    /**
     * 自燃险
     */
    @Column(name = "self_ignite_insurance")
    private Double selfIgniteInsurance;

    /**
     * 无法找到第三方责任险
     */
    @Column(name = "not_find_third_insurance")
    private Double notFindThirdInsurance;

    /**
     * 不计免赔险
     */
    private Double sdew;

    /**
     * 盗抢险
     */
    @Column(name = "theft_protection")
    private Double theftProtection;

    /**
     * 其他
     */
    @Column(name = "other_cost")
    private Double otherCost;

    /**
     * 总保费
     */
    @Column(name = "all_cost")
    private Double allCost;

    private Double discount;

    /**
     * 实际支付
     */
    @Column(name = "actual_cost")
    private Double actualCost;

    /**
     * 缴费时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 保费支付方
     */
    @Column(name = "pay_name")
    private String payName;

    /**
     * 保单状态（0：删除，1：正常）
     */
    private Integer status;

    @Column(name = "create_time")
    private Date createTime;

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
     * 获取关联车辆id
     *
     * @return user_id - 关联车辆id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置关联车辆id
     *
     * @param userId 关联车辆id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取0:审核不通过；1：审核通过
     *
     * @return car_id - 0:审核不通过；1：审核通过
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 设置0:审核不通过；1：审核通过
     *
     * @param carId 0:审核不通过；1：审核通过
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * 获取保险单号
     *
     * @return num - 保险单号
     */
    public String getNum() {
        return num;
    }

    /**
     * 设置保险单号
     *
     * @param num 保险单号
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * 获取关联保险公司id
     *
     * @return insu_comp_id - 关联保险公司id
     */
    public Integer getInsuCompId() {
        return insuCompId;
    }

    /**
     * 设置关联保险公司id
     *
     * @param insuCompId 关联保险公司id
     */
    public void setInsuCompId(Integer insuCompId) {
        this.insuCompId = insuCompId;
    }

    /**
     * 获取保险类型
     *
     * @return insu_type - 保险类型
     */
    public String getInsuType() {
        return insuType;
    }

    /**
     * 设置保险类型
     *
     * @param insuType 保险类型
     */
    public void setInsuType(String insuType) {
        this.insuType = insuType;
    }

    /**
     * 获取商业保险单号
     *
     * @return commercial_policy - 商业保险单号
     */
    public String getCommercialPolicy() {
        return commercialPolicy;
    }

    /**
     * 设置商业保险单号
     *
     * @param commercialPolicy 商业保险单号
     */
    public void setCommercialPolicy(String commercialPolicy) {
        this.commercialPolicy = commercialPolicy;
    }

    /**
     * 获取保险生效时间
     *
     * @return effect_time - 保险生效时间
     */
    public Date getEffectTime() {
        return effectTime;
    }

    /**
     * 设置保险生效时间
     *
     * @param effectTime 保险生效时间
     */
    public void setEffectTime(Date effectTime) {
        this.effectTime = effectTime;
    }

    /**
     * 获取保险失效时间
     *
     * @return fail_time - 保险失效时间
     */
    public Date getFailTime() {
        return failTime;
    }

    /**
     * 设置保险失效时间
     *
     * @param failTime 保险失效时间
     */
    public void setFailTime(Date failTime) {
        this.failTime = failTime;
    }

    /**
     * 获取交强险
     *
     * @return insurance - 交强险
     */
    public Double getInsurance() {
        return insurance;
    }

    /**
     * 设置交强险
     *
     * @param insurance 交强险
     */
    public void setInsurance(Double insurance) {
        this.insurance = insurance;
    }

    /**
     * @return third_insurance
     */
    public Double getThirdInsurance() {
        return thirdInsurance;
    }

    /**
     * @param thirdInsurance
     */
    public void setThirdInsurance(Double thirdInsurance) {
        this.thirdInsurance = thirdInsurance;
    }

    /**
     * 获取车损险
     *
     * @return car_insurance - 车损险
     */
    public Double getCarInsurance() {
        return carInsurance;
    }

    /**
     * 设置车损险
     *
     * @param carInsurance 车损险
     */
    public void setCarInsurance(Double carInsurance) {
        this.carInsurance = carInsurance;
    }

    /**
     * 获取人员险
     *
     * @return personnel_insurance - 人员险
     */
    public Double getPersonnelInsurance() {
        return personnelInsurance;
    }

    /**
     * 设置人员险
     *
     * @param personnelInsurance 人员险
     */
    public void setPersonnelInsurance(Double personnelInsurance) {
        this.personnelInsurance = personnelInsurance;
    }

    /**
     * 获取玻璃险
     *
     * @return glass_insurance - 玻璃险
     */
    public Double getGlassInsurance() {
        return glassInsurance;
    }

    /**
     * 设置玻璃险
     *
     * @param glassInsurance 玻璃险
     */
    public void setGlassInsurance(Double glassInsurance) {
        this.glassInsurance = glassInsurance;
    }

    /**
     * 获取自燃险
     *
     * @return self_ignite_insurance - 自燃险
     */
    public Double getSelfIgniteInsurance() {
        return selfIgniteInsurance;
    }

    /**
     * 设置自燃险
     *
     * @param selfIgniteInsurance 自燃险
     */
    public void setSelfIgniteInsurance(Double selfIgniteInsurance) {
        this.selfIgniteInsurance = selfIgniteInsurance;
    }

    /**
     * 获取无法找到第三方责任险
     *
     * @return not_find_third_insurance - 无法找到第三方责任险
     */
    public Double getNotFindThirdInsurance() {
        return notFindThirdInsurance;
    }

    /**
     * 设置无法找到第三方责任险
     *
     * @param notFindThirdInsurance 无法找到第三方责任险
     */
    public void setNotFindThirdInsurance(Double notFindThirdInsurance) {
        this.notFindThirdInsurance = notFindThirdInsurance;
    }

    /**
     * 获取不计免赔险
     *
     * @return sdew - 不计免赔险
     */
    public Double getSdew() {
        return sdew;
    }

    /**
     * 设置不计免赔险
     *
     * @param sdew 不计免赔险
     */
    public void setSdew(Double sdew) {
        this.sdew = sdew;
    }

    /**
     * 获取盗抢险
     *
     * @return theft_protection - 盗抢险
     */
    public Double getTheftProtection() {
        return theftProtection;
    }

    /**
     * 设置盗抢险
     *
     * @param theftProtection 盗抢险
     */
    public void setTheftProtection(Double theftProtection) {
        this.theftProtection = theftProtection;
    }

    /**
     * 获取其他
     *
     * @return other_cost - 其他
     */
    public Double getOtherCost() {
        return otherCost;
    }

    /**
     * 设置其他
     *
     * @param otherCost 其他
     */
    public void setOtherCost(Double otherCost) {
        this.otherCost = otherCost;
    }

    /**
     * 获取总保费
     *
     * @return all_cost - 总保费
     */
    public Double getAllCost() {
        return allCost;
    }

    /**
     * 设置总保费
     *
     * @param allCost 总保费
     */
    public void setAllCost(Double allCost) {
        this.allCost = allCost;
    }

    /**
     * @return discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param discount
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * 获取实际支付
     *
     * @return actual_cost - 实际支付
     */
    public Double getActualCost() {
        return actualCost;
    }

    /**
     * 设置实际支付
     *
     * @param actualCost 实际支付
     */
    public void setActualCost(Double actualCost) {
        this.actualCost = actualCost;
    }

    /**
     * 获取缴费时间
     *
     * @return pay_time - 缴费时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置缴费时间
     *
     * @param payTime 缴费时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取保费支付方
     *
     * @return pay_name - 保费支付方
     */
    public String getPayName() {
        return payName;
    }

    /**
     * 设置保费支付方
     *
     * @param payName 保费支付方
     */
    public void setPayName(String payName) {
        this.payName = payName;
    }

    /**
     * 获取保单状态（0：删除，1：正常）
     *
     * @return status - 保单状态（0：删除，1：正常）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置保单状态（0：删除，1：正常）
     *
     * @param status 保单状态（0：删除，1：正常）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}