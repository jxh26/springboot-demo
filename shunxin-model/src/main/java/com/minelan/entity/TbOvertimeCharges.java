package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_overtime_charges")
public class TbOvertimeCharges {
    /**
     * 起始工作时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 结束工作时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 超时区间下限
     */
    @Column(name = "lower_limit")
    private Integer lowerLimit;

    /**
     * 超时区间上限
     */
    @Column(name = "upper_limit")
    private Integer upperLimit;

    /**
     * 超时费
     */
    private Integer charge;

    /**
     * 状态（0：失效：1正常）
     */
    private Short status;

    /**
     * 操作批次
     */
    private String batch;

    /**
     * 操作时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取起始工作时间
     *
     * @return start_time - 起始工作时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置起始工作时间
     *
     * @param startTime 起始工作时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束工作时间
     *
     * @return end_time - 结束工作时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束工作时间
     *
     * @param endTime 结束工作时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取超时区间下限
     *
     * @return lower_limit - 超时区间下限
     */
    public Integer getLowerLimit() {
        return lowerLimit;
    }

    /**
     * 设置超时区间下限
     *
     * @param lowerLimit 超时区间下限
     */
    public void setLowerLimit(Integer lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    /**
     * 获取超时区间上限
     *
     * @return upper_limit - 超时区间上限
     */
    public Integer getUpperLimit() {
        return upperLimit;
    }

    /**
     * 设置超时区间上限
     *
     * @param upperLimit 超时区间上限
     */
    public void setUpperLimit(Integer upperLimit) {
        this.upperLimit = upperLimit;
    }

    /**
     * 获取超时费
     *
     * @return charge - 超时费
     */
    public Integer getCharge() {
        return charge;
    }

    /**
     * 设置超时费
     *
     * @param charge 超时费
     */
    public void setCharge(Integer charge) {
        this.charge = charge;
    }

    /**
     * 获取状态（0：失效：1正常）
     *
     * @return status - 状态（0：失效：1正常）
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置状态（0：失效：1正常）
     *
     * @param status 状态（0：失效：1正常）
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取操作批次
     *
     * @return batch - 操作批次
     */
    public String getBatch() {
        return batch;
    }

    /**
     * 设置操作批次
     *
     * @param batch 操作批次
     */
    public void setBatch(String batch) {
        this.batch = batch;
    }

    /**
     * 获取操作时间
     *
     * @return create_time - 操作时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置操作时间
     *
     * @param createTime 操作时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}