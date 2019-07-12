package com.minelan.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_driver")
public class TbDriver {
    /**
     * 序号（数据来自tb_user 的id列）
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 司机姓名
     */
    @Column(name = "driver_name")
    private String driverName;

    /**
     * 身份证证件号码
     */
    @Column(name = "id_number")
    private String idNumber;

    /**
     * 民族
     */
    private String nation;

    /**
     * 国籍
     */
    private String nationality;

    /**
     * 证件有效期起始值
     */
    @Column(name = "initial_validity_period")
    private Date initialValidityPeriod;

    /**
     * 证件有效期结束值
     */
    @Column(name = "termination_validity_period")
    private Date terminationValidityPeriod;

    /**
     * 发证机关
     */
    @Column(name = "certification_authority")
    private String certificationAuthority;

    /**
     * 证件地址
     */
    @Column(name = "certificate_address")
    private String certificateAddress;

    /**
     * 头像
     */
    @Column(name = "head_portrait")
    private String headPortrait;

    /**
     * 证件正面照图片路径
     */
    @Column(name = "front_id_photo")
    private String frontIdPhoto;

    /**
     * 证件反面照--图片路径
     */
    @Column(name = "back_id_photo")
    private String backIdPhoto;

    /**
     * 驾驶证号
     */
    @Column(name = "driver_license_number")
    private String driverLicenseNumber;

    /**
     * 驾驶证类型
     */
    @Column(name = "driver_license_type")
    private String driverLicenseType;

    /**
     * 驾驶证领取时间
     */
    @Column(name = "driver_license_collection_date")
    private Date driverLicenseCollectionDate;

    /**
     * 驾驶证到期时间
     */
    @Column(name = "driver_license_expiration_date")
    private Date driverLicenseExpirationDate;

    /**
     * 驾驶证照片--图片路径
     */
    @Column(name = "driver_license_photos")
    private String driverLicensePhotos;

    /**
     * 紧急联系人信息
     */
    @Column(name = "emergency_contact_information")
    private String emergencyContactInformation;

    /**
     * 联系人手机号
     */
    @Column(name = "contact_phone_number")
    private String contactPhoneNumber;

    /**
     * 联系人地址
     */
    @Column(name = "contact_address")
    private String contactAddress;

    /**
     * 服务状态：0：等待服务；1服务中
     */
    @Column(name = "serve_status")
    private Integer serveStatus;

    /**
     * 司机详情创建时间
     */
    @Column(name = "create_time_self")
    private Date createTimeSelf;

    /**
     * 获取序号（数据来自tb_user 的id列）
     *
     * @return id - 序号（数据来自tb_user 的id列）
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置序号（数据来自tb_user 的id列）
     *
     * @param id 序号（数据来自tb_user 的id列）
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取司机姓名
     *
     * @return driver_name - 司机姓名
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * 设置司机姓名
     *
     * @param driverName 司机姓名
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    /**
     * 获取身份证证件号码
     *
     * @return id_number - 身份证证件号码
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 设置身份证证件号码
     *
     * @param idNumber 身份证证件号码
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * 获取民族
     *
     * @return nation - 民族
     */
    public String getNation() {
        return nation;
    }

    /**
     * 设置民族
     *
     * @param nation 民族
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * 获取国籍
     *
     * @return nationality - 国籍
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * 设置国籍
     *
     * @param nationality 国籍
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * 获取证件有效期起始值
     *
     * @return initial_validity_period - 证件有效期起始值
     */
    public Date getInitialValidityPeriod() {
        return initialValidityPeriod;
    }

    /**
     * 设置证件有效期起始值
     *
     * @param initialValidityPeriod 证件有效期起始值
     */
    public void setInitialValidityPeriod(Date initialValidityPeriod) {
        this.initialValidityPeriod = initialValidityPeriod;
    }

    /**
     * 获取证件有效期结束值
     *
     * @return termination_validity_period - 证件有效期结束值
     */
    public Date getTerminationValidityPeriod() {
        return terminationValidityPeriod;
    }

    /**
     * 设置证件有效期结束值
     *
     * @param terminationValidityPeriod 证件有效期结束值
     */
    public void setTerminationValidityPeriod(Date terminationValidityPeriod) {
        this.terminationValidityPeriod = terminationValidityPeriod;
    }

    /**
     * 获取发证机关
     *
     * @return certification_authority - 发证机关
     */
    public String getCertificationAuthority() {
        return certificationAuthority;
    }

    /**
     * 设置发证机关
     *
     * @param certificationAuthority 发证机关
     */
    public void setCertificationAuthority(String certificationAuthority) {
        this.certificationAuthority = certificationAuthority;
    }

    /**
     * 获取证件地址
     *
     * @return certificate_address - 证件地址
     */
    public String getCertificateAddress() {
        return certificateAddress;
    }

    /**
     * 设置证件地址
     *
     * @param certificateAddress 证件地址
     */
    public void setCertificateAddress(String certificateAddress) {
        this.certificateAddress = certificateAddress;
    }

    /**
     * 获取头像
     *
     * @return head_portrait - 头像
     */
    public String getHeadPortrait() {
        return headPortrait;
    }

    /**
     * 设置头像
     *
     * @param headPortrait 头像
     */
    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    /**
     * 获取证件正面照图片路径
     *
     * @return front_id_photo - 证件正面照图片路径
     */
    public String getFrontIdPhoto() {
        return frontIdPhoto;
    }

    /**
     * 设置证件正面照图片路径
     *
     * @param frontIdPhoto 证件正面照图片路径
     */
    public void setFrontIdPhoto(String frontIdPhoto) {
        this.frontIdPhoto = frontIdPhoto;
    }

    /**
     * 获取证件反面照--图片路径
     *
     * @return back_id_photo - 证件反面照--图片路径
     */
    public String getBackIdPhoto() {
        return backIdPhoto;
    }

    /**
     * 设置证件反面照--图片路径
     *
     * @param backIdPhoto 证件反面照--图片路径
     */
    public void setBackIdPhoto(String backIdPhoto) {
        this.backIdPhoto = backIdPhoto;
    }

    /**
     * 获取驾驶证号
     *
     * @return driver_license_number - 驾驶证号
     */
    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    /**
     * 设置驾驶证号
     *
     * @param driverLicenseNumber 驾驶证号
     */
    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    /**
     * 获取驾驶证类型
     *
     * @return driver_license_type - 驾驶证类型
     */
    public String getDriverLicenseType() {
        return driverLicenseType;
    }

    /**
     * 设置驾驶证类型
     *
     * @param driverLicenseType 驾驶证类型
     */
    public void setDriverLicenseType(String driverLicenseType) {
        this.driverLicenseType = driverLicenseType;
    }

    /**
     * 获取驾驶证领取时间
     *
     * @return driver_license_collection_date - 驾驶证领取时间
     */
    public Date getDriverLicenseCollectionDate() {
        return driverLicenseCollectionDate;
    }

    /**
     * 设置驾驶证领取时间
     *
     * @param driverLicenseCollectionDate 驾驶证领取时间
     */
    public void setDriverLicenseCollectionDate(Date driverLicenseCollectionDate) {
        this.driverLicenseCollectionDate = driverLicenseCollectionDate;
    }

    /**
     * 获取驾驶证到期时间
     *
     * @return driver_license_expiration_date - 驾驶证到期时间
     */
    public Date getDriverLicenseExpirationDate() {
        return driverLicenseExpirationDate;
    }

    /**
     * 设置驾驶证到期时间
     *
     * @param driverLicenseExpirationDate 驾驶证到期时间
     */
    public void setDriverLicenseExpirationDate(Date driverLicenseExpirationDate) {
        this.driverLicenseExpirationDate = driverLicenseExpirationDate;
    }

    /**
     * 获取驾驶证照片--图片路径
     *
     * @return driver_license_photos - 驾驶证照片--图片路径
     */
    public String getDriverLicensePhotos() {
        return driverLicensePhotos;
    }

    /**
     * 设置驾驶证照片--图片路径
     *
     * @param driverLicensePhotos 驾驶证照片--图片路径
     */
    public void setDriverLicensePhotos(String driverLicensePhotos) {
        this.driverLicensePhotos = driverLicensePhotos;
    }

    /**
     * 获取紧急联系人信息
     *
     * @return emergency_contact_information - 紧急联系人信息
     */
    public String getEmergencyContactInformation() {
        return emergencyContactInformation;
    }

    /**
     * 设置紧急联系人信息
     *
     * @param emergencyContactInformation 紧急联系人信息
     */
    public void setEmergencyContactInformation(String emergencyContactInformation) {
        this.emergencyContactInformation = emergencyContactInformation;
    }

    /**
     * 获取联系人手机号
     *
     * @return contact_phone_number - 联系人手机号
     */
    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    /**
     * 设置联系人手机号
     *
     * @param contactPhoneNumber 联系人手机号
     */
    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    /**
     * 获取联系人地址
     *
     * @return contact_address - 联系人地址
     */
    public String getContactAddress() {
        return contactAddress;
    }

    /**
     * 设置联系人地址
     *
     * @param contactAddress 联系人地址
     */
    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    /**
     * 获取服务状态：0：等待服务；1服务中
     *
     * @return serve_status - 服务状态：0：等待服务；1服务中
     */
    public Integer getServeStatus() {
        return serveStatus;
    }

    /**
     * 设置服务状态：0：等待服务；1服务中
     *
     * @param serveStatus 服务状态：0：等待服务；1服务中
     */
    public void setServeStatus(Integer serveStatus) {
        this.serveStatus = serveStatus;
    }

    /**
     * 获取司机详情创建时间
     *
     * @return create_time_self - 司机详情创建时间
     */
    public Date getCreateTimeSelf() {
        return createTimeSelf;
    }

    /**
     * 设置司机详情创建时间
     *
     * @param createTimeSelf 司机详情创建时间
     */
    public void setCreateTimeSelf(Date createTimeSelf) {
        this.createTimeSelf = createTimeSelf;
    }
}