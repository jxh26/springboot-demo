package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_car_manage")
public class TbCarManage {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 车牌号
     */
    @Column(name = "license_plate")
    private String licensePlate;

    /**
     * 发动机号
     */
    @Column(name = "engine_number")
    private String engineNumber;

    /**
     * 车型，关联车型主键
     */
    @Column(name = "car_type_id")
    private Integer carTypeId;

    /**
     * 关联车辆品牌表
     */
    @Column(name = "car_brand_id")
    private Integer carBrandId;

    /**
     * 关联车辆级别表
     */
    @Column(name = "car_level_id")
    private Integer carLevelId;

    /**
     * 车辆颜色
     */
    private String color;

    /**
     * 新旧分类(新车、旧车、二手车)
     */
    private Integer extent;

    /**
     * 车辆所有权（如出租人）
     */
    private Integer ownership;

    /**
     * 外租公司主键
     */
    @Column(name = "rent_company_id")
    private Integer rentCompanyId;

    /**
     * 是否外租的车辆（0：公司自己 1：外租获得）
     */
    @Column(name = "is_rent")
    private Short isRent;

    /**
     * 油（电）刻度
     */
    private Float scale;

    /**
     * 公里数
     */
    private Float kilometre;

    /**
     * 购车日期
     */
    @Column(name = "purchase_date")
    private Date purchaseDate;

    /**
     * 验车提醒日期=purchase_date+6year
     */
    @Column(name = "validate_car_date")
    private Date validateCarDate;

    /**
     * 车辆图片
     */
    @Column(name = "car_url")
    private String carUrl;

    /**
     * 供应商
     */
    private String supplier;

    /**
     * 公司电话
     */
    @Column(name = "company_tel")
    private String companyTel;

    /**
     * 公司地址
     */
    @Column(name = "company_address")
    private String companyAddress;

    /**
     * 联系人
     */
    @Column(name = "link_man")
    private String linkMan;

    /**
     * 联系电话
     */
    @Column(name = "link_tel")
    private String linkTel;

    @Column(name = "original_cost")
    private String originalCost;

    @Column(name = "purchase_tax")
    private String purchaseTax;

    @Column(name = "license_plate_cost")
    private String licensePlateCost;

    /**
     * 购置时间
     */
    @Column(name = "purchase_time")
    private Date purchaseTime;

    /**
     * 购置信息图片
     */
    @Column(name = "purchase_info_url")
    private String purchaseInfoUrl;

    /**
     * GPS设备号
     */
    @Column(name = "gps_device_number")
    private String gpsDeviceNumber;

    /**
     * GPS设备型号
     */
    @Column(name = "gps_device_type")
    private String gpsDeviceType;

    /**
     * 状态((0:删除 1：启用 2：停用))
     */
    private Integer status;

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
     * 获取车牌号
     *
     * @return license_plate - 车牌号
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * 设置车牌号
     *
     * @param licensePlate 车牌号
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * 获取发动机号
     *
     * @return engine_number - 发动机号
     */
    public String getEngineNumber() {
        return engineNumber;
    }

    /**
     * 设置发动机号
     *
     * @param engineNumber 发动机号
     */
    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    /**
     * 获取车型，关联车型主键
     *
     * @return car_type_id - 车型，关联车型主键
     */
    public Integer getCarTypeId() {
        return carTypeId;
    }

    /**
     * 设置车型，关联车型主键
     *
     * @param carTypeId 车型，关联车型主键
     */
    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
    }

    /**
     * 获取关联车辆品牌表
     *
     * @return car_brand_id - 关联车辆品牌表
     */
    public Integer getCarBrandId() {
        return carBrandId;
    }

    /**
     * 设置关联车辆品牌表
     *
     * @param carBrandId 关联车辆品牌表
     */
    public void setCarBrandId(Integer carBrandId) {
        this.carBrandId = carBrandId;
    }

    /**
     * 获取关联车辆级别表
     *
     * @return car_level_id - 关联车辆级别表
     */
    public Integer getCarLevelId() {
        return carLevelId;
    }

    /**
     * 设置关联车辆级别表
     *
     * @param carLevelId 关联车辆级别表
     */
    public void setCarLevelId(Integer carLevelId) {
        this.carLevelId = carLevelId;
    }

    /**
     * 获取车辆颜色
     *
     * @return color - 车辆颜色
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置车辆颜色
     *
     * @param color 车辆颜色
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取新旧分类(新车、旧车、二手车)
     *
     * @return extent - 新旧分类(新车、旧车、二手车)
     */
    public Integer getExtent() {
        return extent;
    }

    /**
     * 设置新旧分类(新车、旧车、二手车)
     *
     * @param extent 新旧分类(新车、旧车、二手车)
     */
    public void setExtent(Integer extent) {
        this.extent = extent;
    }

    /**
     * 获取车辆所有权（如出租人）
     *
     * @return ownership - 车辆所有权（如出租人）
     */
    public Integer getOwnership() {
        return ownership;
    }

    /**
     * 设置车辆所有权（如出租人）
     *
     * @param ownership 车辆所有权（如出租人）
     */
    public void setOwnership(Integer ownership) {
        this.ownership = ownership;
    }

    /**
     * 获取外租公司主键
     *
     * @return rent_company_id - 外租公司主键
     */
    public Integer getRentCompanyId() {
        return rentCompanyId;
    }

    /**
     * 设置外租公司主键
     *
     * @param rentCompanyId 外租公司主键
     */
    public void setRentCompanyId(Integer rentCompanyId) {
        this.rentCompanyId = rentCompanyId;
    }

    /**
     * 获取是否外租的车辆（0：公司自己 1：外租获得）
     *
     * @return is_rent - 是否外租的车辆（0：公司自己 1：外租获得）
     */
    public Short getIsRent() {
        return isRent;
    }

    /**
     * 设置是否外租的车辆（0：公司自己 1：外租获得）
     *
     * @param isRent 是否外租的车辆（0：公司自己 1：外租获得）
     */
    public void setIsRent(Short isRent) {
        this.isRent = isRent;
    }

    /**
     * 获取油（电）刻度
     *
     * @return scale - 油（电）刻度
     */
    public Float getScale() {
        return scale;
    }

    /**
     * 设置油（电）刻度
     *
     * @param scale 油（电）刻度
     */
    public void setScale(Float scale) {
        this.scale = scale;
    }

    /**
     * 获取公里数
     *
     * @return kilometre - 公里数
     */
    public Float getKilometre() {
        return kilometre;
    }

    /**
     * 设置公里数
     *
     * @param kilometre 公里数
     */
    public void setKilometre(Float kilometre) {
        this.kilometre = kilometre;
    }

    /**
     * 获取购车日期
     *
     * @return purchase_date - 购车日期
     */
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * 设置购车日期
     *
     * @param purchaseDate 购车日期
     */
    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     * 获取验车提醒日期=purchase_date+6year
     *
     * @return validate_car_date - 验车提醒日期=purchase_date+6year
     */
    public Date getValidateCarDate() {
        return validateCarDate;
    }

    /**
     * 设置验车提醒日期=purchase_date+6year
     *
     * @param validateCarDate 验车提醒日期=purchase_date+6year
     */
    public void setValidateCarDate(Date validateCarDate) {
        this.validateCarDate = validateCarDate;
    }

    /**
     * 获取车辆图片
     *
     * @return car_url - 车辆图片
     */
    public String getCarUrl() {
        return carUrl;
    }

    /**
     * 设置车辆图片
     *
     * @param carUrl 车辆图片
     */
    public void setCarUrl(String carUrl) {
        this.carUrl = carUrl;
    }

    /**
     * 获取供应商
     *
     * @return supplier - 供应商
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * 设置供应商
     *
     * @param supplier 供应商
     */
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    /**
     * 获取公司电话
     *
     * @return company_tel - 公司电话
     */
    public String getCompanyTel() {
        return companyTel;
    }

    /**
     * 设置公司电话
     *
     * @param companyTel 公司电话
     */
    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel;
    }

    /**
     * 获取公司地址
     *
     * @return company_address - 公司地址
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * 设置公司地址
     *
     * @param companyAddress 公司地址
     */
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    /**
     * 获取联系人
     *
     * @return link_man - 联系人
     */
    public String getLinkMan() {
        return linkMan;
    }

    /**
     * 设置联系人
     *
     * @param linkMan 联系人
     */
    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    /**
     * 获取联系电话
     *
     * @return link_tel - 联系电话
     */
    public String getLinkTel() {
        return linkTel;
    }

    /**
     * 设置联系电话
     *
     * @param linkTel 联系电话
     */
    public void setLinkTel(String linkTel) {
        this.linkTel = linkTel;
    }

    /**
     * @return original_cost
     */
    public String getOriginalCost() {
        return originalCost;
    }

    /**
     * @param originalCost
     */
    public void setOriginalCost(String originalCost) {
        this.originalCost = originalCost;
    }

    /**
     * @return purchase_tax
     */
    public String getPurchaseTax() {
        return purchaseTax;
    }

    /**
     * @param purchaseTax
     */
    public void setPurchaseTax(String purchaseTax) {
        this.purchaseTax = purchaseTax;
    }

    /**
     * @return license_plate_cost
     */
    public String getLicensePlateCost() {
        return licensePlateCost;
    }

    /**
     * @param licensePlateCost
     */
    public void setLicensePlateCost(String licensePlateCost) {
        this.licensePlateCost = licensePlateCost;
    }

    /**
     * 获取购置时间
     *
     * @return purchase_time - 购置时间
     */
    public Date getPurchaseTime() {
        return purchaseTime;
    }

    /**
     * 设置购置时间
     *
     * @param purchaseTime 购置时间
     */
    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    /**
     * 获取购置信息图片
     *
     * @return purchase_info_url - 购置信息图片
     */
    public String getPurchaseInfoUrl() {
        return purchaseInfoUrl;
    }

    /**
     * 设置购置信息图片
     *
     * @param purchaseInfoUrl 购置信息图片
     */
    public void setPurchaseInfoUrl(String purchaseInfoUrl) {
        this.purchaseInfoUrl = purchaseInfoUrl;
    }

    /**
     * 获取GPS设备号
     *
     * @return gps_device_number - GPS设备号
     */
    public String getGpsDeviceNumber() {
        return gpsDeviceNumber;
    }

    /**
     * 设置GPS设备号
     *
     * @param gpsDeviceNumber GPS设备号
     */
    public void setGpsDeviceNumber(String gpsDeviceNumber) {
        this.gpsDeviceNumber = gpsDeviceNumber;
    }

    /**
     * 获取GPS设备型号
     *
     * @return gps_device_type - GPS设备型号
     */
    public String getGpsDeviceType() {
        return gpsDeviceType;
    }

    /**
     * 设置GPS设备型号
     *
     * @param gpsDeviceType GPS设备型号
     */
    public void setGpsDeviceType(String gpsDeviceType) {
        this.gpsDeviceType = gpsDeviceType;
    }

    /**
     * 获取状态((0:删除 1：启用 2：停用))
     *
     * @return status - 状态((0:删除 1：启用 2：停用))
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态((0:删除 1：启用 2：停用))
     *
     * @param status 状态((0:删除 1：启用 2：停用))
     */
    public void setStatus(Integer status) {
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