package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_quote")
public class TbQuote {
    /**
     * 主键
     */
    @Id
    @Column(name = "quote_id")
    private Integer quoteId;

    /**
     * 产品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 租赁方式(1日租2周租3：月租4：年租)
     */
    @Column(name = "rent_type")
    private Integer rentType;

    /**
     * 1：正常价
     */
    @Column(name = "product_type")
    private Integer productType;

    /**
     * 业务类型（1：自驾 2：司机代驾）
     */
    @Column(name = "business_type")
    private Integer businessType;

    /**
     * 租赁期限-最短期限
     */
    @Column(name = "min_limit")
    private Integer minLimit;

    /**
     * 最短期限是否含当天(0:不含当:1：含当天)
     */
    @Column(name = "min_is_today")
    private Short minIsToday;

    /**
     * 租赁期限-最长期限
     */
    @Column(name = "max_limit")
    private Integer maxLimit;

    /**
     * 最长期限是否含当天(0:不含当:1：含当天)
     */
    @Column(name = "max_is_today")
    private Short maxIsToday;

    /**
     * 租赁生效时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 租赁失效时间
     */
    @Column(name = "end_time")
    private Date endTime;

    private Short level;

    /**
     * 记录状态（0：删除1：正常）
     */
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取主键
     *
     * @return quote_id - 主键
     */
    public Integer getQuoteId() {
        return quoteId;
    }

    /**
     * 设置主键
     *
     * @param quoteId 主键
     */
    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
    }

    /**
     * 获取产品名称
     *
     * @return product_name - 产品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置产品名称
     *
     * @param productName 产品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取租赁方式(1日租2周租3：月租4：年租)
     *
     * @return rent_type - 租赁方式(1日租2周租3：月租4：年租)
     */
    public Integer getRentType() {
        return rentType;
    }

    /**
     * 设置租赁方式(1日租2周租3：月租4：年租)
     *
     * @param rentType 租赁方式(1日租2周租3：月租4：年租)
     */
    public void setRentType(Integer rentType) {
        this.rentType = rentType;
    }

    /**
     * 获取1：正常价
     *
     * @return product_type - 1：正常价
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * 设置1：正常价
     *
     * @param productType 1：正常价
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    /**
     * 获取业务类型（1：自驾 2：司机代驾）
     *
     * @return business_type - 业务类型（1：自驾 2：司机代驾）
     */
    public Integer getBusinessType() {
        return businessType;
    }

    /**
     * 设置业务类型（1：自驾 2：司机代驾）
     *
     * @param businessType 业务类型（1：自驾 2：司机代驾）
     */
    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    /**
     * 获取租赁期限-最短期限
     *
     * @return min_limit - 租赁期限-最短期限
     */
    public Integer getMinLimit() {
        return minLimit;
    }

    /**
     * 设置租赁期限-最短期限
     *
     * @param minLimit 租赁期限-最短期限
     */
    public void setMinLimit(Integer minLimit) {
        this.minLimit = minLimit;
    }

    /**
     * 获取最短期限是否含当天(0:不含当:1：含当天)
     *
     * @return min_is_today - 最短期限是否含当天(0:不含当:1：含当天)
     */
    public Short getMinIsToday() {
        return minIsToday;
    }

    /**
     * 设置最短期限是否含当天(0:不含当:1：含当天)
     *
     * @param minIsToday 最短期限是否含当天(0:不含当:1：含当天)
     */
    public void setMinIsToday(Short minIsToday) {
        this.minIsToday = minIsToday;
    }

    /**
     * 获取租赁期限-最长期限
     *
     * @return max_limit - 租赁期限-最长期限
     */
    public Integer getMaxLimit() {
        return maxLimit;
    }

    /**
     * 设置租赁期限-最长期限
     *
     * @param maxLimit 租赁期限-最长期限
     */
    public void setMaxLimit(Integer maxLimit) {
        this.maxLimit = maxLimit;
    }

    /**
     * 获取最长期限是否含当天(0:不含当:1：含当天)
     *
     * @return max_is_today - 最长期限是否含当天(0:不含当:1：含当天)
     */
    public Short getMaxIsToday() {
        return maxIsToday;
    }

    /**
     * 设置最长期限是否含当天(0:不含当:1：含当天)
     *
     * @param maxIsToday 最长期限是否含当天(0:不含当:1：含当天)
     */
    public void setMaxIsToday(Short maxIsToday) {
        this.maxIsToday = maxIsToday;
    }

    /**
     * 获取租赁生效时间
     *
     * @return start_time - 租赁生效时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置租赁生效时间
     *
     * @param startTime 租赁生效时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取租赁失效时间
     *
     * @return end_time - 租赁失效时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置租赁失效时间
     *
     * @param endTime 租赁失效时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return level
     */
    public Short getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(Short level) {
        this.level = level;
    }

    /**
     * 获取记录状态（0：删除1：正常）
     *
     * @return status - 记录状态（0：删除1：正常）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置记录状态（0：删除1：正常）
     *
     * @param status 记录状态（0：删除1：正常）
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
}