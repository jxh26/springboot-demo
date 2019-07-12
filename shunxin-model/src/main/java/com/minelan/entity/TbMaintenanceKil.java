package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_maintenance_kil")
public class TbMaintenanceKil {
    /**
     * 主键，自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 外键，关联定期保养计划表
     */
    @Column(name = "mplan_id")
    private Integer mplanId;

    /**
     * 公里数,同一车型保养公里数不能相同
     */
    private Float kil;

    /**
     * 提示信息
     */
    @Column(name = "prompt_messages")
    private String promptMessages;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取主键，自增
     *
     * @return id - 主键，自增
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键，自增
     *
     * @param id 主键，自增
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取外键，关联定期保养计划表
     *
     * @return mplan_id - 外键，关联定期保养计划表
     */
    public Integer getMplanId() {
        return mplanId;
    }

    /**
     * 设置外键，关联定期保养计划表
     *
     * @param mplanId 外键，关联定期保养计划表
     */
    public void setMplanId(Integer mplanId) {
        this.mplanId = mplanId;
    }

    /**
     * 获取公里数,同一车型保养公里数不能相同
     *
     * @return kil - 公里数,同一车型保养公里数不能相同
     */
    public Float getKil() {
        return kil;
    }

    /**
     * 设置公里数,同一车型保养公里数不能相同
     *
     * @param kil 公里数,同一车型保养公里数不能相同
     */
    public void setKil(Float kil) {
        this.kil = kil;
    }

    /**
     * 获取提示信息
     *
     * @return prompt_messages - 提示信息
     */
    public String getPromptMessages() {
        return promptMessages;
    }

    /**
     * 设置提示信息
     *
     * @param promptMessages 提示信息
     */
    public void setPromptMessages(String promptMessages) {
        this.promptMessages = promptMessages;
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