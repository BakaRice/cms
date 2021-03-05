package com.ricemarch.cms.bo.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @author: tanwentao
 * @date: 2021/3/4
 */

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 866171108910722674L;
    /**
     * 主键
     */
    private String id;

    /**
     * 微信小程序openId
     */
    private String openId;

    /**
     * 名称
     */
    private String username;

    /**
     * 头像链接
     */
    private String headImage;

    /**
     * 密码
     */
    private String password;

    /**
     * 服务技师，默认(是)
     */
    private Boolean technician;

    /**
     * 人事状态 on 在职，off 离职
     */
    private String state;

    /**
     * 账号状态 默认未启用
     */
    private Boolean accountState;

    /**
     * 性别
     */
    private String gender;

    /**
     * 薪水
     */
    private Double salary;

    private Boolean active;

    /**
     * 年纪
     */
    private Integer age;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 身份证号码
     */
    private String idcardNumber;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 入职时间
     */
    private Date entryDay;

    /**
     * 地址信息
     */
    private String address;

    /**
     * store 门店用户 company 公司用户 tenant 租户用户
     */
    private String userType;

    private Long storeId;

    private Long companyId;

    private Long tenantId;

    /**
     * 密码是否手动设置
     */
    private Boolean resetFlag;

    /**
     * 备注
     */
    private String mark;

    /**
     * 组织机构账号ID
     */
    private Long sysUserId;

    /**
     * 是否删除
     */
    private Boolean isDelete;

    /**
     * 存id
     */
    private String updateUser;

    /**
     * 存id
     */
    private String createUser;

    private Date createTime;

    private Date updateTime;

    /**
     * 门店编码
     */
    private String storeNo;

    private String positionCode;

    private String professionCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getTechnician() {
        return technician;
    }

    public void setTechnician(Boolean technician) {
        this.technician = technician;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getAccountState() {
        return accountState;
    }

    public void setAccountState(Boolean accountState) {
        this.accountState = accountState;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdcardNumber() {
        return idcardNumber;
    }

    public void setIdcardNumber(String idcardNumber) {
        this.idcardNumber = idcardNumber;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getEntryDay() {
        return entryDay;
    }

    public void setEntryDay(Date entryDay) {
        this.entryDay = entryDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Boolean getResetFlag() {
        return resetFlag;
    }

    public void setResetFlag(Boolean resetFlag) {
        this.resetFlag = resetFlag;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Long getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Long sysUserId) {
        this.sysUserId = sysUserId;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(String storeNo) {
        this.storeNo = storeNo;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getProfessionCode() {
        return professionCode;
    }

    public void setProfessionCode(String professionCode) {
        this.professionCode = professionCode;
    }
}
