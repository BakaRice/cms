package com.ricemarch.cms.dao.dataobject.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
public class Store implements Serializable {
    private Long id;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 公司ID
     */
    private Long companyId;

    /**
     * 状态 0 正常
     */
    private Byte statusType;

    /**
     * 门店名称
     */
    private String storeName;

    /**
     * 门店门头图片
     */
    private String imagePath;

    /**
     * 省份ID
     */
    private String provinceId;

    /**
     * 城市ID
     */
    private String cityId;

    /**
     * 区ID
     */
    private String regionId;

    /**
     * 门店地址
     */
    private String address;

    /**
     * 负责人
     */
    private String principalName;

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 固定电话
     */
    private String lineTelephone;

    /**
     * 手机
     */
    private String mobilePhone;

    /**
     * 电子邮箱
     */
    private String email;

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
     * qq账号
     */
    private String qqAccount;

    /**
     * 开户银行
     */
    private String bankName;

    /**
     * 银行账号
     */
    private String bankAccount;

    /**
     * 营业时间起
     */
    @JsonFormat(pattern = "HH:mm", timezone = "GMT+8")
    private Date openingEffectiveDate;

    /**
     * 营业时间止
     */
    @JsonFormat(pattern = "HH:mm", timezone = "GMT+8")
    private Date openingExpiryDate;

    /**
     * 备注
     */
    private String memo;

    /**
     * 创建用户
     */
    private String createUser;

    /**
     * 更改用户
     */
    private String updateUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 门店照片,最多5张,多个逗号分隔
     */
    private String imagePaths;

    /**
     * c端预约电话
     */
    private String clientAppointPhone;

    /**
     * c端展示标签id,多个逗号分隔
     */
    private String clientTag;

    /**
     * 门店地址经度
     */
    private Double lon;

    /**
     * 门店地址维度
     */
    private Double lat;

    /**
     * 微信小程序二维码图片链接
     */
    private String weixinQrUrl;

    /**
     * 门店编码
     */
    private String storeNo;

    /**
     * 门店类型：1自主门店，2途虎合作店，3汽配龙三方店
     */
    private Byte type;

    /**
     * c端展示常规服务项目编码code，项目名称，别名,json字符串
     */
    private String clientCommonService;

    /**
     * 核算方式：0移动加权平均，1先进先出
     */
    private Byte accountingWay;

    /**
     * 途虎企业id
     */
    private Long tuhuTenantId;

    /**
     * 门店扫码收款开关，0-关，1-开
     */
    private Integer scanReceiveFlag;

    private static final long serialVersionUID = 1L;

}