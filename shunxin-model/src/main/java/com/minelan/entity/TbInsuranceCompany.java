package com.minelan.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "tb_insurance_company")
public class TbInsuranceCompany {
    /**
     * 序号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 公司名称
     */
    @Column(name = "corporate_name")
    private String corporateName;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 联系电话
     */
    @Column(name = "contact_number")
    private String contactNumber;

    /**
     * 服务热线
     */
    private String hotline;

    /**
     * 返点比例%
     */
    @Column(name = "return_point_ratio")
    private BigDecimal returnPointRatio;

    /**
     * 保险公地址
     */
    @Column(name = "company_address")
    private String companyAddress;

    /**
     * 省份
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String area;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 状态正常：1 删除：0
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
     * 获取公司名称
     *
     * @return corporate_name - 公司名称
     */
    public String getCorporateName() {
        return corporateName;
    }

    /**
     * 设置公司名称
     *
     * @param corporateName 公司名称
     */
    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    /**
     * 获取联系人
     *
     * @return contacts - 联系人
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * 设置联系人
     *
     * @param contacts 联系人
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * 获取联系电话
     *
     * @return contact_number - 联系电话
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * 设置联系电话
     *
     * @param contactNumber 联系电话
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * 获取服务热线
     *
     * @return hotline - 服务热线
     */
    public String getHotline() {
        return hotline;
    }

    /**
     * 设置服务热线
     *
     * @param hotline 服务热线
     */
    public void setHotline(String hotline) {
        this.hotline = hotline;
    }

    /**
     * 获取返点比例%
     *
     * @return return_point_ratio - 返点比例%
     */
    public BigDecimal getReturnPointRatio() {
        return returnPointRatio;
    }

    /**
     * 设置返点比例%
     *
     * @param returnPointRatio 返点比例%
     */
    public void setReturnPointRatio(BigDecimal returnPointRatio) {
        this.returnPointRatio = returnPointRatio;
    }

    /**
     * 获取保险公地址
     *
     * @return company_address - 保险公地址
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * 设置保险公地址
     *
     * @param companyAddress 保险公地址
     */
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取区
     *
     * @return area - 区
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置区
     *
     * @param area 区
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取状态正常：1 删除：0
     *
     * @return status - 状态正常：1 删除：0
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态正常：1 删除：0
     *
     * @param status 状态正常：1 删除：0
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}