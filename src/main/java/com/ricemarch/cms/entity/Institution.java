package com.ricemarch.cms.entity;

import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 机构（车间，检查班，仓库等）
 * </p>
 *
 * @author ricemarch
 * @since 2021-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Institution对象", description="机构（车间，检查班，仓库等）")
public class Institution implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "租户ID")
    private Long tenantId;

    @ApiModelProperty(value = "公司ID")
    private Long companyId;

    @ApiModelProperty(value = "状态 0 正常")
    private Integer statusType;

    @ApiModelProperty(value = "门店名称")
    private String institutionName;

    @ApiModelProperty(value = "门店门头图片")
    private String imagePath;

    @ApiModelProperty(value = "城市ID")
    private String cityId;

    @ApiModelProperty(value = "区ID")
    private String regionId;

    @ApiModelProperty(value = "门店地址")
    private String address;

    @ApiModelProperty(value = "负责人")
    private String principalName;

    @ApiModelProperty(value = "联系人姓名")
    private String contactName;

    @ApiModelProperty(value = "固定电话")
    private String lineTelephone;

    @ApiModelProperty(value = "手机")
    private String mobilePhone;

    @ApiModelProperty(value = "电子邮箱")
    private String email;

    @ApiModelProperty(value = "网址")
    private String website;

    @ApiModelProperty(value = "传真")
    private String fax;

    @ApiModelProperty(value = "经营范围")
    private String businessScope;

    @ApiModelProperty(value = "邮编")
    private String post;

    @ApiModelProperty(value = "qq账号")
    private String qqAccount;

    @ApiModelProperty(value = "开户银行")
    private String bankName;

    @ApiModelProperty(value = "银行账号")
    private String bankAccount;

    @ApiModelProperty(value = "营业时间起")
    private Date openingEffectiveDate;

    @ApiModelProperty(value = "营业时间止")
    private Date openingExpiryDate;

    @ApiModelProperty(value = "备注")
    private String memo;

    @ApiModelProperty(value = "创建用户")
    private String createUser;

    @ApiModelProperty(value = "更改用户")
    private String updateUser;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "门店照片,最多5张,多个逗号分隔")
    private String imagePaths;

    @ApiModelProperty(value = "c端预约电话")
    private String clientAppointPhone;

    @ApiModelProperty(value = "c端展示标签id,多个逗号分隔")
    private String clientTag;

    @ApiModelProperty(value = "c端展示常规服务项目编码code，项目名称，别名,json字符串")
    private String clientCommonService;

    @ApiModelProperty(value = "门店地址经度")
    private Double lon;

    @ApiModelProperty(value = "门店地址维度")
    private Double lat;

    @ApiModelProperty(value = "微信小程序二维码图片链接")
    private String weixinQrUrl;

    @ApiModelProperty(value = "门店编码")
    private String storeNo;

    @ApiModelProperty(value = "是否删除")
    private Boolean isDelete;


}
