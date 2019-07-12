package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_maintenance_cost")
public class TbMaintenanceCost {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "mcost_id")
    private Integer mcostId;

    /**
     * 保养项目明细
     */
    @Column(name = "propmt_message")
    private String propmtMessage;

    /**
     * 保养项目花销单位（元）
     */
    private Float cost;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * @return mcost_id
     */
    public Integer getMcostId() {
        return mcostId;
    }

    /**
     * @param mcostId
     */
    public void setMcostId(Integer mcostId) {
        this.mcostId = mcostId;
    }

    /**
     * 获取保养项目明细
     *
     * @return propmt_message - 保养项目明细
     */
    public String getPropmtMessage() {
        return propmtMessage;
    }

    /**
     * 设置保养项目明细
     *
     * @param propmtMessage 保养项目明细
     */
    public void setPropmtMessage(String propmtMessage) {
        this.propmtMessage = propmtMessage;
    }

    /**
     * 获取保养项目花销单位（元）
     *
     * @return cost - 保养项目花销单位（元）
     */
    public Float getCost() {
        return cost;
    }

    /**
     * 设置保养项目花销单位（元）
     *
     * @param cost 保养项目花销单位（元）
     */
    public void setCost(Float cost) {
        this.cost = cost;
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