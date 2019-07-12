package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_process_log")
public class TbProcessLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "process_name")
    private String processName;

    private String type;

    @Column(name = "relative_id")
    private String relativeId;

    /**
     * 状态（0：审核通过 1：待办 2：审核不通过 3：驳回）
     */
    private Short status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    private Short source;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return process_name
     */
    public String getProcessName() {
        return processName;
    }

    /**
     * @param processName
     */
    public void setProcessName(String processName) {
        this.processName = processName;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return relative_id
     */
    public String getRelativeId() {
        return relativeId;
    }

    /**
     * @param relativeId
     */
    public void setRelativeId(String relativeId) {
        this.relativeId = relativeId;
    }

    /**
     * 获取状态（0：审核通过 1：待办 2：审核不通过 3：驳回）
     *
     * @return status - 状态（0：审核通过 1：待办 2：审核不通过 3：驳回）
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置状态（0：审核通过 1：待办 2：审核不通过 3：驳回）
     *
     * @param status 状态（0：审核通过 1：待办 2：审核不通过 3：驳回）
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return source
     */
    public Short getSource() {
        return source;
    }

    /**
     * @param source
     */
    public void setSource(Short source) {
        this.source = source;
    }
}