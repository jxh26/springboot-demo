package com.minelan.entity;

import javax.persistence.*;

@Table(name = "tb_quote_overlimit")
public class TbQuoteOverlimit {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联产品报价管理表主键
     */
    @Column(name = "quote_id")
    private Integer quoteId;

    /**
     * 超时最小值（单位：小时）
     */
    @Column(name = "min_time")
    private Integer minTime;

    /**
     * 超时最大值（单位：小时）
     */
    @Column(name = "max_time")
    private Integer maxTime;

    /**
     * 费用（自驾时：0半天租金1：全天租金）
     */
    private Float cost;

    /**
     * 状态（0：不在使用1：正常使用）
     */
    private Short status;

    private String batch;

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
     * 获取关联产品报价管理表主键
     *
     * @return quote_id - 关联产品报价管理表主键
     */
    public Integer getQuoteId() {
        return quoteId;
    }

    /**
     * 设置关联产品报价管理表主键
     *
     * @param quoteId 关联产品报价管理表主键
     */
    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
    }

    /**
     * 获取超时最小值（单位：小时）
     *
     * @return min_time - 超时最小值（单位：小时）
     */
    public Integer getMinTime() {
        return minTime;
    }

    /**
     * 设置超时最小值（单位：小时）
     *
     * @param minTime 超时最小值（单位：小时）
     */
    public void setMinTime(Integer minTime) {
        this.minTime = minTime;
    }

    /**
     * 获取超时最大值（单位：小时）
     *
     * @return max_time - 超时最大值（单位：小时）
     */
    public Integer getMaxTime() {
        return maxTime;
    }

    /**
     * 设置超时最大值（单位：小时）
     *
     * @param maxTime 超时最大值（单位：小时）
     */
    public void setMaxTime(Integer maxTime) {
        this.maxTime = maxTime;
    }

    /**
     * 获取费用（自驾时：0半天租金1：全天租金）
     *
     * @return cost - 费用（自驾时：0半天租金1：全天租金）
     */
    public Float getCost() {
        return cost;
    }

    /**
     * 设置费用（自驾时：0半天租金1：全天租金）
     *
     * @param cost 费用（自驾时：0半天租金1：全天租金）
     */
    public void setCost(Float cost) {
        this.cost = cost;
    }

    /**
     * 获取状态（0：不在使用1：正常使用）
     *
     * @return status - 状态（0：不在使用1：正常使用）
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置状态（0：不在使用1：正常使用）
     *
     * @param status 状态（0：不在使用1：正常使用）
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * @return batch
     */
    public String getBatch() {
        return batch;
    }

    /**
     * @param batch
     */
    public void setBatch(String batch) {
        this.batch = batch;
    }
}