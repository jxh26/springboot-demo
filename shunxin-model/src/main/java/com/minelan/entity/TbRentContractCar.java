package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_rent_contract_car")
public class TbRentContractCar {
    /**
     * 外租车辆主键
     */
    @Id
    @Column(name = "car_id")
    private Integer carId;

    /**
     * 租入合同主键
     */
    @Column(name = "rent_id")
    private Integer rentId;

    private Short status;

    /**
     * 获取外租车辆主键
     *
     * @return car_id - 外租车辆主键
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 设置外租车辆主键
     *
     * @param carId 外租车辆主键
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * 获取租入合同主键
     *
     * @return rent_id - 租入合同主键
     */
    public Integer getRentId() {
        return rentId;
    }

    /**
     * 设置租入合同主键
     *
     * @param rentId 租入合同主键
     */
    public void setRentId(Integer rentId) {
        this.rentId = rentId;
    }

    /**
     * @return status
     */
    public Short getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Short status) {
        this.status = status;
    }
}