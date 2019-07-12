package com.minelan.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "tb_settle_otherpay")
public class TbSettleOtherpay {
    /**
     * 关联结算主键
     */
    @Column(name = "settle_id")
    private Integer settleId;

    /**
     * 收费项目名称
     */
    @Column(name = "chargeName")
    private String chargename;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 标准价格/元（单个价格）
     */
    @Column(name = "standard_price")
    private BigDecimal standardPrice;

    /**
     * 折让价格
     */
    @Column(name = "discount_money")
    private BigDecimal discountMoney;

    /**
     * 获取关联结算主键
     *
     * @return settle_id - 关联结算主键
     */
    public Integer getSettleId() {
        return settleId;
    }

    /**
     * 设置关联结算主键
     *
     * @param settleId 关联结算主键
     */
    public void setSettleId(Integer settleId) {
        this.settleId = settleId;
    }

    /**
     * 获取收费项目名称
     *
     * @return chargeName - 收费项目名称
     */
    public String getChargename() {
        return chargename;
    }

    /**
     * 设置收费项目名称
     *
     * @param chargename 收费项目名称
     */
    public void setChargename(String chargename) {
        this.chargename = chargename;
    }

    /**
     * 获取数量
     *
     * @return count - 数量
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置数量
     *
     * @param count 数量
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 获取标准价格/元（单个价格）
     *
     * @return standard_price - 标准价格/元（单个价格）
     */
    public BigDecimal getStandardPrice() {
        return standardPrice;
    }

    /**
     * 设置标准价格/元（单个价格）
     *
     * @param standardPrice 标准价格/元（单个价格）
     */
    public void setStandardPrice(BigDecimal standardPrice) {
        this.standardPrice = standardPrice;
    }

    /**
     * 获取折让价格
     *
     * @return discount_money - 折让价格
     */
    public BigDecimal getDiscountMoney() {
        return discountMoney;
    }

    /**
     * 设置折让价格
     *
     * @param discountMoney 折让价格
     */
    public void setDiscountMoney(BigDecimal discountMoney) {
        this.discountMoney = discountMoney;
    }
}