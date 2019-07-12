package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "vw_carinfo")
public class VwCarinfo {
    /**
     * 主键
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 车型名称
     */
    @Column(name = "typeName")
    private String typename;

    /**
     * 名称
     */
    @Column(name = "brandName")
    private String brandname;

    /**
     * 级别名称（如：舒适型、经济型等）
     */
    @Column(name = "levelName")
    private String levelname;

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
     * 油（电）刻度
     */
    private Float scale;

    /**
     * 购车日期
     */
    @Column(name = "purchase_date")
    private Date purchaseDate;

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
     * 变速箱类型(0：手动 1；自动 2：手动一体)
     */
    @Column(name = "gear_type")
    private Integer gearType;

    /**
     * 燃油标号(1：89#: 2：92#、3：93# 4:95# 5:97# 6:98#：7：柴油)
     */
    private Integer roz;

    /**
     * 油箱容量
     */
    @Column(name = "oilCapacity")
    private String oilcapacity;

    /**
     * 座位数
     */
    private Integer seats;

    /**
     * 排量
     */
    private String displacement;

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
     * 获取车型名称
     *
     * @return typeName - 车型名称
     */
    public String getTypename() {
        return typename;
    }

    /**
     * 设置车型名称
     *
     * @param typename 车型名称
     */
    public void setTypename(String typename) {
        this.typename = typename;
    }

    /**
     * 获取名称
     *
     * @return brandName - 名称
     */
    public String getBrandname() {
        return brandname;
    }

    /**
     * 设置名称
     *
     * @param brandname 名称
     */
    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    /**
     * 获取级别名称（如：舒适型、经济型等）
     *
     * @return levelName - 级别名称（如：舒适型、经济型等）
     */
    public String getLevelname() {
        return levelname;
    }

    /**
     * 设置级别名称（如：舒适型、经济型等）
     *
     * @param levelname 级别名称（如：舒适型、经济型等）
     */
    public void setLevelname(String levelname) {
        this.levelname = levelname;
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

    /**
     * 获取变速箱类型(0：手动 1；自动 2：手动一体)
     *
     * @return gear_type - 变速箱类型(0：手动 1；自动 2：手动一体)
     */
    public Integer getGearType() {
        return gearType;
    }

    /**
     * 设置变速箱类型(0：手动 1；自动 2：手动一体)
     *
     * @param gearType 变速箱类型(0：手动 1；自动 2：手动一体)
     */
    public void setGearType(Integer gearType) {
        this.gearType = gearType;
    }

    /**
     * 获取燃油标号(1：89#: 2：92#、3：93# 4:95# 5:97# 6:98#：7：柴油)
     *
     * @return roz - 燃油标号(1：89#: 2：92#、3：93# 4:95# 5:97# 6:98#：7：柴油)
     */
    public Integer getRoz() {
        return roz;
    }

    /**
     * 设置燃油标号(1：89#: 2：92#、3：93# 4:95# 5:97# 6:98#：7：柴油)
     *
     * @param roz 燃油标号(1：89#: 2：92#、3：93# 4:95# 5:97# 6:98#：7：柴油)
     */
    public void setRoz(Integer roz) {
        this.roz = roz;
    }

    /**
     * 获取油箱容量
     *
     * @return oilCapacity - 油箱容量
     */
    public String getOilcapacity() {
        return oilcapacity;
    }

    /**
     * 设置油箱容量
     *
     * @param oilcapacity 油箱容量
     */
    public void setOilcapacity(String oilcapacity) {
        this.oilcapacity = oilcapacity;
    }

    /**
     * 获取座位数
     *
     * @return seats - 座位数
     */
    public Integer getSeats() {
        return seats;
    }

    /**
     * 设置座位数
     *
     * @param seats 座位数
     */
    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    /**
     * 获取排量
     *
     * @return displacement - 排量
     */
    public String getDisplacement() {
        return displacement;
    }

    /**
     * 设置排量
     *
     * @param displacement 排量
     */
    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }
}