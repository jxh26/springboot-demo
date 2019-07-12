package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_quote_info")
public class TbQuoteInfo {
    /**
     * 主键
     */
    @Id
    @Column(name = "quote_info_id")
    private Integer quoteInfoId;

    /**
     * 关联报价管理表主键
     */
    @Column(name = "quote_id")
    private Integer quoteId;

    /**
     * 关联车型表主键
     */
    @Column(name = "car_type_id")
    private Integer carTypeId;

    /**
     * 品牌主键
     */
    @Column(name = "car_brand_id")
    private Integer carBrandId;

    /**
     * 车辆租赁及服务费用（元/天）
     */
    private Float rent;

    @Column(name = "in_three_hours")
    private Float inThreeHours;

    /**
     * 基础服务费（元/天）
     */
    @Column(name = "base_charge")
    private Float baseCharge;

    /**
     * 尊享保险费(元)
     */
    private Float premium;

    /**
     * 手续费（元）
     */
    @Column(name = "service_charge")
    private Float serviceCharge;

    /**
     * 车辆整备费（元）
     */
    @Column(name = "prepare_charge")
    private Float prepareCharge;

    /**
     * 限里程（km/天）
     */
    @Column(name = "limit_kil_day")
    private Float limitKilDay;

    /**
     * 超里程费用（元/km）
     */
    @Column(name = "over_kil_charge")
    private Float overKilCharge;

    /**
     * 状态（0：无效：1正常）
     */
    private Short status;

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
     * @return quote_info_id - 主键
     */
    public Integer getQuoteInfoId() {
        return quoteInfoId;
    }

    /**
     * 设置主键
     *
     * @param quoteInfoId 主键
     */
    public void setQuoteInfoId(Integer quoteInfoId) {
        this.quoteInfoId = quoteInfoId;
    }

    /**
     * 获取关联报价管理表主键
     *
     * @return quote_id - 关联报价管理表主键
     */
    public Integer getQuoteId() {
        return quoteId;
    }

    /**
     * 设置关联报价管理表主键
     *
     * @param quoteId 关联报价管理表主键
     */
    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
    }

    /**
     * 获取关联车型表主键
     *
     * @return car_type_id - 关联车型表主键
     */
    public Integer getCarTypeId() {
        return carTypeId;
    }

    /**
     * 设置关联车型表主键
     *
     * @param carTypeId 关联车型表主键
     */
    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
    }

    /**
     * 获取品牌主键
     *
     * @return car_brand_id - 品牌主键
     */
    public Integer getCarBrandId() {
        return carBrandId;
    }

    /**
     * 设置品牌主键
     *
     * @param carBrandId 品牌主键
     */
    public void setCarBrandId(Integer carBrandId) {
        this.carBrandId = carBrandId;
    }

    /**
     * 获取车辆租赁及服务费用（元/天）
     *
     * @return rent - 车辆租赁及服务费用（元/天）
     */
    public Float getRent() {
        return rent;
    }

    /**
     * 设置车辆租赁及服务费用（元/天）
     *
     * @param rent 车辆租赁及服务费用（元/天）
     */
    public void setRent(Float rent) {
        this.rent = rent;
    }

    /**
     * @return in_three_hours
     */
    public Float getInThreeHours() {
        return inThreeHours;
    }

    /**
     * @param inThreeHours
     */
    public void setInThreeHours(Float inThreeHours) {
        this.inThreeHours = inThreeHours;
    }

    /**
     * 获取基础服务费（元/天）
     *
     * @return base_charge - 基础服务费（元/天）
     */
    public Float getBaseCharge() {
        return baseCharge;
    }

    /**
     * 设置基础服务费（元/天）
     *
     * @param baseCharge 基础服务费（元/天）
     */
    public void setBaseCharge(Float baseCharge) {
        this.baseCharge = baseCharge;
    }

    /**
     * 获取尊享保险费(元)
     *
     * @return premium - 尊享保险费(元)
     */
    public Float getPremium() {
        return premium;
    }

    /**
     * 设置尊享保险费(元)
     *
     * @param premium 尊享保险费(元)
     */
    public void setPremium(Float premium) {
        this.premium = premium;
    }

    /**
     * 获取手续费（元）
     *
     * @return service_charge - 手续费（元）
     */
    public Float getServiceCharge() {
        return serviceCharge;
    }

    /**
     * 设置手续费（元）
     *
     * @param serviceCharge 手续费（元）
     */
    public void setServiceCharge(Float serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    /**
     * 获取车辆整备费（元）
     *
     * @return prepare_charge - 车辆整备费（元）
     */
    public Float getPrepareCharge() {
        return prepareCharge;
    }

    /**
     * 设置车辆整备费（元）
     *
     * @param prepareCharge 车辆整备费（元）
     */
    public void setPrepareCharge(Float prepareCharge) {
        this.prepareCharge = prepareCharge;
    }

    /**
     * 获取限里程（km/天）
     *
     * @return limit_kil_day - 限里程（km/天）
     */
    public Float getLimitKilDay() {
        return limitKilDay;
    }

    /**
     * 设置限里程（km/天）
     *
     * @param limitKilDay 限里程（km/天）
     */
    public void setLimitKilDay(Float limitKilDay) {
        this.limitKilDay = limitKilDay;
    }

    /**
     * 获取超里程费用（元/km）
     *
     * @return over_kil_charge - 超里程费用（元/km）
     */
    public Float getOverKilCharge() {
        return overKilCharge;
    }

    /**
     * 设置超里程费用（元/km）
     *
     * @param overKilCharge 超里程费用（元/km）
     */
    public void setOverKilCharge(Float overKilCharge) {
        this.overKilCharge = overKilCharge;
    }

    /**
     * 获取状态（0：无效：1正常）
     *
     * @return status - 状态（0：无效：1正常）
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置状态（0：无效：1正常）
     *
     * @param status 状态（0：无效：1正常）
     */
    public void setStatus(Short status) {
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