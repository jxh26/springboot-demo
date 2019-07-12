package com.minelan.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "tb_pay")
public class TbPay {
    /**
     * 序号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 收费项名称
     */
    @Column(name = "charge_name")
    private String chargeName;

    /**
     * 车辆分类 小车：0 大车：1 中型车：2 房车：3
     */
    @Column(name = "baseCarType")
    private Integer basecartype;

    /**
     * 标准价格/元
     */
    @Column(name = "standard_price")
    private BigDecimal standardPrice;

    /**
     * 单位
     */
    private String company;

    /**
     * 是否允许退款 是：0 否：1
     */
    @Column(name = "is_refund_allowed")
    private Integer isRefundAllowed;

    /**
     * 状态 修改：0 删除：1
     */
    private Integer status;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 获取序号
     *
     * @return id - 序号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置序号
     *
     * @param id 序号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取收费项名称
     *
     * @return charge_name - 收费项名称
     */
    public String getChargeName() {
        return chargeName;
    }

    /**
     * 设置收费项名称
     *
     * @param chargeName 收费项名称
     */
    public void setChargeName(String chargeName) {
        this.chargeName = chargeName;
    }

    /**
     * 获取车辆分类 小车：0 大车：1 中型车：2 房车：3
     *
     * @return baseCarType - 车辆分类 小车：0 大车：1 中型车：2 房车：3
     */
    public Integer getBasecartype() {
        return basecartype;
    }

    /**
     * 设置车辆分类 小车：0 大车：1 中型车：2 房车：3
     *
     * @param basecartype 车辆分类 小车：0 大车：1 中型车：2 房车：3
     */
    public void setBasecartype(Integer basecartype) {
        this.basecartype = basecartype;
    }

    /**
     * 获取标准价格/元
     *
     * @return standard_price - 标准价格/元
     */
    public BigDecimal getStandardPrice() {
        return standardPrice;
    }

    /**
     * 设置标准价格/元
     *
     * @param standardPrice 标准价格/元
     */
    public void setStandardPrice(BigDecimal standardPrice) {
        this.standardPrice = standardPrice;
    }

    /**
     * 获取单位
     *
     * @return company - 单位
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置单位
     *
     * @param company 单位
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取是否允许退款 是：0 否：1
     *
     * @return is_refund_allowed - 是否允许退款 是：0 否：1
     */
    public Integer getIsRefundAllowed() {
        return isRefundAllowed;
    }

    /**
     * 设置是否允许退款 是：0 否：1
     *
     * @param isRefundAllowed 是否允许退款 是：0 否：1
     */
    public void setIsRefundAllowed(Integer isRefundAllowed) {
        this.isRefundAllowed = isRefundAllowed;
    }

    /**
     * 获取状态 修改：0 删除：1
     *
     * @return status - 状态 修改：0 删除：1
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 修改：0 删除：1
     *
     * @param status 状态 修改：0 删除：1
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}