package com.ricemarch.cms.bo.reuqest;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * @Description:
 * @author: tanwentao
 * @date: 2021/3/4
 */

@Data
public class InstitutionInfo {
    private Long id;
    private Long tenantId;
    private Long companyId;
    @Size(max = 50, message = "機構名称不能超过50字符")
    //store -> Institution
    private String institutionName;

    @Size(max = 50, message = "機構联系人名称不能超过50字符")
    private String contactName;
    @Pattern(regexp = "^(1[3456789])\\d{9}$", message = "機構联系人手机格式错误")
    //@Pattern(regexp = "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\\\d{8}$", message = "门店联系人手机格式错误")
    private String mobilePhone;

    private String provinceId = "";

    private String cityId = "";

    private String regionId = "";
    @Size(max = 50, message = "详细地址不能超过50字符")
    private String address = "";

    private String createUser;
    private String updateUser;
    private Byte statusType = 0;
    private String memo = "";
    /**
     * 网址
     */
    private String website;

    /**
     * 传真
     */
    private String fax;

    /**
     * 经营范围
     */
    private String businessScope;

    /**
     * 邮编
     */
    private String post;
    /**
     * 电子邮箱
     */
    @Email(message = "邮箱格式不正确")
    private String email;

    /**
     * 开户银行
     */
    private String bankName;

    /**
     * 银行账号
     */
    private String bankAccount;
    /**
     * 更新时间
     */
    private Date updateTime;

    private String imagePaths;

    private String clientAppointPhone;

    @JsonFormat(pattern = "HH:mm", timezone = "GMT+8")
    private Date openingEffectiveDate;

    @JsonFormat(pattern = "HH:mm", timezone = "GMT+8")
    private Date openingExpiryDate;

    private String clientCommonService;

    /**
     * 门店类型
     */
    private Byte type = new Byte("1");

    /**
     * 核算方式：0移动加权平均，1先进先出
     */
    private Byte accountingWay;
}
