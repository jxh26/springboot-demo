package com.minelan.entity;

import javax.persistence.*;

@Table(name = "tb_data_base")
public class TbDataBase {
    /**
     * 序号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 类型
     */
    private String type;

    @Column(name = "data_name")
    private String dataName;

    /**
     * 状态 删除：0 修改：1
     */
    private Integer status;

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
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return data_name
     */
    public String getDataName() {
        return dataName;
    }

    /**
     * @param dataName
     */
    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    /**
     * 获取状态 删除：0 修改：1
     *
     * @return status - 状态 删除：0 修改：1
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 删除：0 修改：1
     *
     * @param status 状态 删除：0 修改：1
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}