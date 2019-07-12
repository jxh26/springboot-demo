package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_orders_manage")
public class TbOrdersManage {
    /**
     * 订单主键
     */
    @Id
    @Column(name = "order_id")
    private String orderId;

    /**
     * 关联客户表主键
     */
    @Column(name = "cust_id")
    private Integer custId;

    private String contact;

    private String telephone;

    /**
     * 合同主键
     */
    @Column(name = "contract_id")
    private Integer contractId;

    /**
     * 订单来源(0:后台录入1：WEB端2：APP端)
     */
    private Short source;

    /**
     * 车型管理表主键
     */
    @Column(name = "car_type_id")
    private Integer carTypeId;

    /**
     * 租赁方式（1：自驾 2：司机代驾）
     */
    @Column(name = "rent_type")
    private Short rentType;

    /**
     * 报价管理表主键
     */
    @Column(name = "quote_id")
    private Integer quoteId;

    @Column(name = "quote_info_id")
    private Integer quoteInfoId;

    @Column(name = "over_time_flag")
    private String overTimeFlag;

    /**
     * 起租时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 预计结束时间
     */
    @Column(name = "predict_time")
    private Date predictTime;

    /**
     * 租期
     */
    @Column(name = "tenancy_term")
    private String tenancyTerm;

    /**
     * 实际租期
     */
    @Column(name = "actual_tenancy_term")
    private String actualTenancyTerm;

    /**
     * 上车地点
     */
    @Column(name = "get_on_address")
    private String getOnAddress;

    /**
     * 目的地
     */
    private String destination;

    /**
     * 实际完成时间
     */
    @Column(name = "actual_time")
    private Date actualTime;

    /**
     * 超租期时间（单位：分钟）
     */
    @Column(name = "super_rent_time")
    private Integer superRentTime;

    /**
     * 超租期费用
     */
    @Column(name = "super_rent_cost")
    private Double superRentCost;

    /**
     * 非工作时间超时间(单位：分)
     */
    @Column(name = "nonwork_time")
    private Float nonworkTime;

    /**
     * 非工作时间超时费用
     */
    @Column(name = "nonwork_cost")
    private Double nonworkCost;

    /**
     * 代驾超里程
     */
    @Column(name = "super_mileage")
    private Double superMileage;

    /**
     * 代驾超里程费用
     */
    @Column(name = "super_mileage_cost")
    private Double superMileageCost;

    /**
     * 合计
     */
    private Double total;

    /**
     * 是否已经付款(0:否1：是)
     */
    @Column(name = "is_payment")
    private Short isPayment;

    /**
     * 已支付的金额
     */
    @Column(name = "had_pay")
    private Double hadPay;

    /**
     * 1：微信 2：支付宝
     */
    @Column(name = "pay_way")
    private Short payWay;

    /**
     * 支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 操作用户主键
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 订单状态(0：待支付1：已支付2：待还车3：已派车4：待交车 5：待结算6：已结算7：已结算-未结清8：已取消9：退款中10：已完成退款)
     */
    private Short status;

    /**
     * 创建时间即预定时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    private Double imprest;

    /**
     * 获取订单主键
     *
     * @return order_id - 订单主键
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单主键
     *
     * @param orderId 订单主键
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取关联客户表主键
     *
     * @return cust_id - 关联客户表主键
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * 设置关联客户表主键
     *
     * @param custId 关联客户表主键
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * @return contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取合同主键
     *
     * @return contract_id - 合同主键
     */
    public Integer getContractId() {
        return contractId;
    }

    /**
     * 设置合同主键
     *
     * @param contractId 合同主键
     */
    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    /**
     * 获取订单来源(0:后台录入1：WEB端2：APP端)
     *
     * @return source - 订单来源(0:后台录入1：WEB端2：APP端)
     */
    public Short getSource() {
        return source;
    }

    /**
     * 设置订单来源(0:后台录入1：WEB端2：APP端)
     *
     * @param source 订单来源(0:后台录入1：WEB端2：APP端)
     */
    public void setSource(Short source) {
        this.source = source;
    }

    /**
     * 获取车型管理表主键
     *
     * @return car_type_id - 车型管理表主键
     */
    public Integer getCarTypeId() {
        return carTypeId;
    }

    /**
     * 设置车型管理表主键
     *
     * @param carTypeId 车型管理表主键
     */
    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
    }

    /**
     * 获取租赁方式（1：自驾 2：司机代驾）
     *
     * @return rent_type - 租赁方式（1：自驾 2：司机代驾）
     */
    public Short getRentType() {
        return rentType;
    }

    /**
     * 设置租赁方式（1：自驾 2：司机代驾）
     *
     * @param rentType 租赁方式（1：自驾 2：司机代驾）
     */
    public void setRentType(Short rentType) {
        this.rentType = rentType;
    }

    /**
     * 获取报价管理表主键
     *
     * @return quote_id - 报价管理表主键
     */
    public Integer getQuoteId() {
        return quoteId;
    }

    /**
     * 设置报价管理表主键
     *
     * @param quoteId 报价管理表主键
     */
    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
    }

    /**
     * @return quote_info_id
     */
    public Integer getQuoteInfoId() {
        return quoteInfoId;
    }

    /**
     * @param quoteInfoId
     */
    public void setQuoteInfoId(Integer quoteInfoId) {
        this.quoteInfoId = quoteInfoId;
    }

    /**
     * @return over_time_flag
     */
    public String getOverTimeFlag() {
        return overTimeFlag;
    }

    /**
     * @param overTimeFlag
     */
    public void setOverTimeFlag(String overTimeFlag) {
        this.overTimeFlag = overTimeFlag;
    }

    /**
     * 获取起租时间
     *
     * @return start_time - 起租时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置起租时间
     *
     * @param startTime 起租时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取预计结束时间
     *
     * @return predict_time - 预计结束时间
     */
    public Date getPredictTime() {
        return predictTime;
    }

    /**
     * 设置预计结束时间
     *
     * @param predictTime 预计结束时间
     */
    public void setPredictTime(Date predictTime) {
        this.predictTime = predictTime;
    }

    /**
     * 获取租期
     *
     * @return tenancy_term - 租期
     */
    public String getTenancyTerm() {
        return tenancyTerm;
    }

    /**
     * 设置租期
     *
     * @param tenancyTerm 租期
     */
    public void setTenancyTerm(String tenancyTerm) {
        this.tenancyTerm = tenancyTerm;
    }

    /**
     * 获取实际租期
     *
     * @return actual_tenancy_term - 实际租期
     */
    public String getActualTenancyTerm() {
        return actualTenancyTerm;
    }

    /**
     * 设置实际租期
     *
     * @param actualTenancyTerm 实际租期
     */
    public void setActualTenancyTerm(String actualTenancyTerm) {
        this.actualTenancyTerm = actualTenancyTerm;
    }

    /**
     * 获取上车地点
     *
     * @return get_on_address - 上车地点
     */
    public String getGetOnAddress() {
        return getOnAddress;
    }

    /**
     * 设置上车地点
     *
     * @param getOnAddress 上车地点
     */
    public void setGetOnAddress(String getOnAddress) {
        this.getOnAddress = getOnAddress;
    }

    /**
     * 获取目的地
     *
     * @return destination - 目的地
     */
    public String getDestination() {
        return destination;
    }

    /**
     * 设置目的地
     *
     * @param destination 目的地
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * 获取实际完成时间
     *
     * @return actual_time - 实际完成时间
     */
    public Date getActualTime() {
        return actualTime;
    }

    /**
     * 设置实际完成时间
     *
     * @param actualTime 实际完成时间
     */
    public void setActualTime(Date actualTime) {
        this.actualTime = actualTime;
    }

    /**
     * 获取超租期时间（单位：分钟）
     *
     * @return super_rent_time - 超租期时间（单位：分钟）
     */
    public Integer getSuperRentTime() {
        return superRentTime;
    }

    /**
     * 设置超租期时间（单位：分钟）
     *
     * @param superRentTime 超租期时间（单位：分钟）
     */
    public void setSuperRentTime(Integer superRentTime) {
        this.superRentTime = superRentTime;
    }

    /**
     * 获取超租期费用
     *
     * @return super_rent_cost - 超租期费用
     */
    public Double getSuperRentCost() {
        return superRentCost;
    }

    /**
     * 设置超租期费用
     *
     * @param superRentCost 超租期费用
     */
    public void setSuperRentCost(Double superRentCost) {
        this.superRentCost = superRentCost;
    }

    /**
     * 获取非工作时间超时间(单位：分)
     *
     * @return nonwork_time - 非工作时间超时间(单位：分)
     */
    public Float getNonworkTime() {
        return nonworkTime;
    }

    /**
     * 设置非工作时间超时间(单位：分)
     *
     * @param nonworkTime 非工作时间超时间(单位：分)
     */
    public void setNonworkTime(Float nonworkTime) {
        this.nonworkTime = nonworkTime;
    }

    /**
     * 获取非工作时间超时费用
     *
     * @return nonwork_cost - 非工作时间超时费用
     */
    public Double getNonworkCost() {
        return nonworkCost;
    }

    /**
     * 设置非工作时间超时费用
     *
     * @param nonworkCost 非工作时间超时费用
     */
    public void setNonworkCost(Double nonworkCost) {
        this.nonworkCost = nonworkCost;
    }

    /**
     * 获取代驾超里程
     *
     * @return super_mileage - 代驾超里程
     */
    public Double getSuperMileage() {
        return superMileage;
    }

    /**
     * 设置代驾超里程
     *
     * @param superMileage 代驾超里程
     */
    public void setSuperMileage(Double superMileage) {
        this.superMileage = superMileage;
    }

    /**
     * 获取代驾超里程费用
     *
     * @return super_mileage_cost - 代驾超里程费用
     */
    public Double getSuperMileageCost() {
        return superMileageCost;
    }

    /**
     * 设置代驾超里程费用
     *
     * @param superMileageCost 代驾超里程费用
     */
    public void setSuperMileageCost(Double superMileageCost) {
        this.superMileageCost = superMileageCost;
    }

    /**
     * 获取合计
     *
     * @return total - 合计
     */
    public Double getTotal() {
        return total;
    }

    /**
     * 设置合计
     *
     * @param total 合计
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * 获取是否已经付款(0:否1：是)
     *
     * @return is_payment - 是否已经付款(0:否1：是)
     */
    public Short getIsPayment() {
        return isPayment;
    }

    /**
     * 设置是否已经付款(0:否1：是)
     *
     * @param isPayment 是否已经付款(0:否1：是)
     */
    public void setIsPayment(Short isPayment) {
        this.isPayment = isPayment;
    }

    /**
     * 获取已支付的金额
     *
     * @return had_pay - 已支付的金额
     */
    public Double getHadPay() {
        return hadPay;
    }

    /**
     * 设置已支付的金额
     *
     * @param hadPay 已支付的金额
     */
    public void setHadPay(Double hadPay) {
        this.hadPay = hadPay;
    }

    /**
     * 获取1：微信 2：支付宝
     *
     * @return pay_way - 1：微信 2：支付宝
     */
    public Short getPayWay() {
        return payWay;
    }

    /**
     * 设置1：微信 2：支付宝
     *
     * @param payWay 1：微信 2：支付宝
     */
    public void setPayWay(Short payWay) {
        this.payWay = payWay;
    }

    /**
     * 获取支付时间
     *
     * @return pay_time - 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取操作用户主键
     *
     * @return user_id - 操作用户主键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置操作用户主键
     *
     * @param userId 操作用户主键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取订单状态(0：待支付1：已支付2：待还车3：已派车4：待交车 5：待结算6：已结算7：已结算-未结清8：已取消9：退款中10：已完成退款)
     *
     * @return status - 订单状态(0：待支付1：已支付2：待还车3：已派车4：待交车 5：待结算6：已结算7：已结算-未结清8：已取消9：退款中10：已完成退款)
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置订单状态(0：待支付1：已支付2：待还车3：已派车4：待交车 5：待结算6：已结算7：已结算-未结清8：已取消9：退款中10：已完成退款)
     *
     * @param status 订单状态(0：待支付1：已支付2：待还车3：已派车4：待交车 5：待结算6：已结算7：已结算-未结清8：已取消9：退款中10：已完成退款)
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取创建时间即预定时间
     *
     * @return create_time - 创建时间即预定时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间即预定时间
     *
     * @param createTime 创建时间即预定时间
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
     * @return imprest
     */
    public Double getImprest() {
        return imprest;
    }

    /**
     * @param imprest
     */
    public void setImprest(Double imprest) {
        this.imprest = imprest;
    }
}