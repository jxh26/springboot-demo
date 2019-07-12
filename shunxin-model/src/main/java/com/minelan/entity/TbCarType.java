package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_car_type")
public class TbCarType {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 车型名称
     */
    private String name;

    /**
     * 品牌，关联车辆品牌表
     */
    @Column(name = "brand_id")
    private Integer brandId;

    /**
     * 车辆等级，关联车辆等级表
     */
    @Column(name = "level_id")
    private Integer levelId;

    /**
     * 车辆分类(关联数据项表)
     */
    private Integer classify;

    /**
     * 年款
     */
    @Column(name = "model_year")
    private String modelYear;

    /**
     * 车辆展示图片地址
     */
    @Column(name = "picture_url")
    private String pictureUrl;

    /**
     * 车长
     */
    private Float length;

    /**
     * 宽(单位：m)
     */
    private Float width;

    /**
     * 高(单位：m)
     */
    private Float height;

    /**
     * 车身结构(2：两厢:3：三厢:4：四厢5：五厢6：六厢7：七厢8：八厢)
     */
    private Integer structure;

    /**
     * 油箱容量
     */
    @Column(name = "oil_capacity")
    private String oilCapacity;

    /**
     * 座位数
     */
    private Integer seats;

    /**
     * 参考油耗
     */
    @Column(name = "oil_wear")
    private Float oilWear;

    /**
     * 进气形式(1自然增压、2涡轮增压、3双涡轮增压、4机械增压)
     */
    @Column(name = "air_input_type")
    private Integer airInputType;

    /**
     * 排量
     */
    private String displacement;

    /**
     * 排量单位（T|L）
     */
    private String unit;

    /**
     * 变速箱类型(0：手动 1；自动 2：手动一体)
     */
    @Column(name = "gear_type")
    private Integer gearType;

    /**
     * 档位个数
     */
    @Column(name = "gear_number")
    private Integer gearNumber;

    /**
     * 燃料形式（0：汽油 1：柴油）
     */
    @Column(name = "fuel_form")
    private Integer fuelForm;

    /**
     * 燃油标号(1：89#: 2：92#、3：93# 4:95# 5:97# 6:98#：7：柴油)
     */
    private Integer roz;

    /**
     * 驱动方式1：前置前驱、2：前置四驱、3：前置后驱、4：中置四驱:5：中置后驱:6：后置四驱:7：后置后驱
     */
    @Column(name = "drive_mode")
    private Integer driveMode;

    /**
     * 天窗（1外滑式2内藏式3内藏外翻式4全景式5窗帘式））
     */
    @Column(name = "sun_roof")
    private Integer sunRoof;

    /**
     * 座椅(1皮革座椅，2软皮座椅)
     */
    @Column(name = "seat_material")
    private Integer seatMaterial;

    /**
     * 倒车雷达：0有 1无
     */
    @Column(name = "car_back_radar")
    private Integer carBackRadar;

    /**
     * 气囊
     */
    private String gasbag;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态(0:删除 1：正常)
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
     * 获取车型名称
     *
     * @return name - 车型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置车型名称
     *
     * @param name 车型名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取品牌，关联车辆品牌表
     *
     * @return brand_id - 品牌，关联车辆品牌表
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * 设置品牌，关联车辆品牌表
     *
     * @param brandId 品牌，关联车辆品牌表
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * 获取车辆等级，关联车辆等级表
     *
     * @return level_id - 车辆等级，关联车辆等级表
     */
    public Integer getLevelId() {
        return levelId;
    }

    /**
     * 设置车辆等级，关联车辆等级表
     *
     * @param levelId 车辆等级，关联车辆等级表
     */
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    /**
     * 获取车辆分类(关联数据项表)
     *
     * @return classify - 车辆分类(关联数据项表)
     */
    public Integer getClassify() {
        return classify;
    }

    /**
     * 设置车辆分类(关联数据项表)
     *
     * @param classify 车辆分类(关联数据项表)
     */
    public void setClassify(Integer classify) {
        this.classify = classify;
    }

    /**
     * 获取年款
     *
     * @return model_year - 年款
     */
    public String getModelYear() {
        return modelYear;
    }

    /**
     * 设置年款
     *
     * @param modelYear 年款
     */
    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    /**
     * 获取车辆展示图片地址
     *
     * @return picture_url - 车辆展示图片地址
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * 设置车辆展示图片地址
     *
     * @param pictureUrl 车辆展示图片地址
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    /**
     * 获取车长
     *
     * @return length - 车长
     */
    public Float getLength() {
        return length;
    }

    /**
     * 设置车长
     *
     * @param length 车长
     */
    public void setLength(Float length) {
        this.length = length;
    }

    /**
     * 获取宽(单位：m)
     *
     * @return width - 宽(单位：m)
     */
    public Float getWidth() {
        return width;
    }

    /**
     * 设置宽(单位：m)
     *
     * @param width 宽(单位：m)
     */
    public void setWidth(Float width) {
        this.width = width;
    }

    /**
     * 获取高(单位：m)
     *
     * @return height - 高(单位：m)
     */
    public Float getHeight() {
        return height;
    }

    /**
     * 设置高(单位：m)
     *
     * @param height 高(单位：m)
     */
    public void setHeight(Float height) {
        this.height = height;
    }

    /**
     * 获取车身结构(2：两厢:3：三厢:4：四厢5：五厢6：六厢7：七厢8：八厢)
     *
     * @return structure - 车身结构(2：两厢:3：三厢:4：四厢5：五厢6：六厢7：七厢8：八厢)
     */
    public Integer getStructure() {
        return structure;
    }

    /**
     * 设置车身结构(2：两厢:3：三厢:4：四厢5：五厢6：六厢7：七厢8：八厢)
     *
     * @param structure 车身结构(2：两厢:3：三厢:4：四厢5：五厢6：六厢7：七厢8：八厢)
     */
    public void setStructure(Integer structure) {
        this.structure = structure;
    }

    /**
     * 获取油箱容量
     *
     * @return oil_capacity - 油箱容量
     */
    public String getOilCapacity() {
        return oilCapacity;
    }

    /**
     * 设置油箱容量
     *
     * @param oilCapacity 油箱容量
     */
    public void setOilCapacity(String oilCapacity) {
        this.oilCapacity = oilCapacity;
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
     * 获取参考油耗
     *
     * @return oil_wear - 参考油耗
     */
    public Float getOilWear() {
        return oilWear;
    }

    /**
     * 设置参考油耗
     *
     * @param oilWear 参考油耗
     */
    public void setOilWear(Float oilWear) {
        this.oilWear = oilWear;
    }

    /**
     * 获取进气形式(1自然增压、2涡轮增压、3双涡轮增压、4机械增压)
     *
     * @return air_input_type - 进气形式(1自然增压、2涡轮增压、3双涡轮增压、4机械增压)
     */
    public Integer getAirInputType() {
        return airInputType;
    }

    /**
     * 设置进气形式(1自然增压、2涡轮增压、3双涡轮增压、4机械增压)
     *
     * @param airInputType 进气形式(1自然增压、2涡轮增压、3双涡轮增压、4机械增压)
     */
    public void setAirInputType(Integer airInputType) {
        this.airInputType = airInputType;
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

    /**
     * 获取排量单位（T|L）
     *
     * @return unit - 排量单位（T|L）
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置排量单位（T|L）
     *
     * @param unit 排量单位（T|L）
     */
    public void setUnit(String unit) {
        this.unit = unit;
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
     * 获取档位个数
     *
     * @return gear_number - 档位个数
     */
    public Integer getGearNumber() {
        return gearNumber;
    }

    /**
     * 设置档位个数
     *
     * @param gearNumber 档位个数
     */
    public void setGearNumber(Integer gearNumber) {
        this.gearNumber = gearNumber;
    }

    /**
     * 获取燃料形式（0：汽油 1：柴油）
     *
     * @return fuel_form - 燃料形式（0：汽油 1：柴油）
     */
    public Integer getFuelForm() {
        return fuelForm;
    }

    /**
     * 设置燃料形式（0：汽油 1：柴油）
     *
     * @param fuelForm 燃料形式（0：汽油 1：柴油）
     */
    public void setFuelForm(Integer fuelForm) {
        this.fuelForm = fuelForm;
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
     * 获取驱动方式1：前置前驱、2：前置四驱、3：前置后驱、4：中置四驱:5：中置后驱:6：后置四驱:7：后置后驱
     *
     * @return drive_mode - 驱动方式1：前置前驱、2：前置四驱、3：前置后驱、4：中置四驱:5：中置后驱:6：后置四驱:7：后置后驱
     */
    public Integer getDriveMode() {
        return driveMode;
    }

    /**
     * 设置驱动方式1：前置前驱、2：前置四驱、3：前置后驱、4：中置四驱:5：中置后驱:6：后置四驱:7：后置后驱
     *
     * @param driveMode 驱动方式1：前置前驱、2：前置四驱、3：前置后驱、4：中置四驱:5：中置后驱:6：后置四驱:7：后置后驱
     */
    public void setDriveMode(Integer driveMode) {
        this.driveMode = driveMode;
    }

    /**
     * 获取天窗（1外滑式2内藏式3内藏外翻式4全景式5窗帘式））
     *
     * @return sun_roof - 天窗（1外滑式2内藏式3内藏外翻式4全景式5窗帘式））
     */
    public Integer getSunRoof() {
        return sunRoof;
    }

    /**
     * 设置天窗（1外滑式2内藏式3内藏外翻式4全景式5窗帘式））
     *
     * @param sunRoof 天窗（1外滑式2内藏式3内藏外翻式4全景式5窗帘式））
     */
    public void setSunRoof(Integer sunRoof) {
        this.sunRoof = sunRoof;
    }

    /**
     * 获取座椅(1皮革座椅，2软皮座椅)
     *
     * @return seat_material - 座椅(1皮革座椅，2软皮座椅)
     */
    public Integer getSeatMaterial() {
        return seatMaterial;
    }

    /**
     * 设置座椅(1皮革座椅，2软皮座椅)
     *
     * @param seatMaterial 座椅(1皮革座椅，2软皮座椅)
     */
    public void setSeatMaterial(Integer seatMaterial) {
        this.seatMaterial = seatMaterial;
    }

    /**
     * 获取倒车雷达：0有 1无
     *
     * @return car_back_radar - 倒车雷达：0有 1无
     */
    public Integer getCarBackRadar() {
        return carBackRadar;
    }

    /**
     * 设置倒车雷达：0有 1无
     *
     * @param carBackRadar 倒车雷达：0有 1无
     */
    public void setCarBackRadar(Integer carBackRadar) {
        this.carBackRadar = carBackRadar;
    }

    /**
     * 获取气囊
     *
     * @return gasbag - 气囊
     */
    public String getGasbag() {
        return gasbag;
    }

    /**
     * 设置气囊
     *
     * @param gasbag 气囊
     */
    public void setGasbag(String gasbag) {
        this.gasbag = gasbag;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取状态(0:删除 1：正常)
     *
     * @return status - 状态(0:删除 1：正常)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态(0:删除 1：正常)
     *
     * @param status 状态(0:删除 1：正常)
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