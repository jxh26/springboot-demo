package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_car_brand")
public class TbCarBrand {
    /**
     * 主键,也是品牌编码，唯一的，系统自动生成
     */
    @Id
    @Column(name = "brand_code")
    private Integer brandCode;

    /**
     * 名称
     */
    private String name;

    /**
     * 英文名称
     */
    @Column(name = "brand_name")
    private String brandName;

    /**
     * 生产商
     */
    private String producer;

    /**
     * logo图片地址
     */
    @Column(name = "logo_url")
    private String logoUrl;

    /**
     * 操作人
     */
    @Column(name = "user_id")
    private Integer userId;

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
     * 获取主键,也是品牌编码，唯一的，系统自动生成
     *
     * @return brand_code - 主键,也是品牌编码，唯一的，系统自动生成
     */
    public Integer getBrandCode() {
        return brandCode;
    }

    /**
     * 设置主键,也是品牌编码，唯一的，系统自动生成
     *
     * @param brandCode 主键,也是品牌编码，唯一的，系统自动生成
     */
    public void setBrandCode(Integer brandCode) {
        this.brandCode = brandCode;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取英文名称
     *
     * @return brand_name - 英文名称
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 设置英文名称
     *
     * @param brandName 英文名称
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * 获取生产商
     *
     * @return producer - 生产商
     */
    public String getProducer() {
        return producer;
    }

    /**
     * 设置生产商
     *
     * @param producer 生产商
     */
    public void setProducer(String producer) {
        this.producer = producer;
    }

    /**
     * 获取logo图片地址
     *
     * @return logo_url - logo图片地址
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * 设置logo图片地址
     *
     * @param logoUrl logo图片地址
     */
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    /**
     * 获取操作人
     *
     * @return user_id - 操作人
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置操作人
     *
     * @param userId 操作人
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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