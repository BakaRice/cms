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
 * 租户，谁租用了这个系统
 * </p>
 *
 * @author ricemarch
 * @since 2021-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Tenant对象", description="租户，谁租用了这个系统")
public class Tenant implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "租户名称")
    private String tenantName;

    @ApiModelProperty(value = "签约人姓名")
    private String principalName;

    @ApiModelProperty(value = "签约人移动电话")
    private String principalMobilePhone;

    @ApiModelProperty(value = "身份证")
    private String principalIdentityCard;

    @ApiModelProperty(value = "租户电话")
    private String telephone;

    @ApiModelProperty(value = "资质照片")
    private String imageUrl;

    @ApiModelProperty(value = "租户通讯地址")
    private String address;

    @ApiModelProperty(value = "租户描述")
    private String description;

    @ApiModelProperty(value = "状态 0 正常")
    private Integer statusType;

    @ApiModelProperty(value = "开始时间")
    private Date beginDate;

    @ApiModelProperty(value = "结束时间")
    private Date endDate;

    @ApiModelProperty(value = "创建人")
    private String createUser;

    @ApiModelProperty(value = "更新人")
    private String updateUser;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;


}
