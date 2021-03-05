package com.ricemarch.cms.entity.sys;

import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系統日志實體類
 * </p>
 *
 * @author ricemarch
 * @since 2021-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysReqLog对象", description="")
public class SysReqLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "请求来源 order")
    private String source;

    @ApiModelProperty(value = "companyId")
    private Long companyId;

    @ApiModelProperty(value = "tenant_id")
    private Long tenantId;

    @ApiModelProperty(value = "storeId")
    private Long storeId;

    @ApiModelProperty(value = "org_id")
    private Long orgId;

    @ApiModelProperty(value = "account")
    private String account;

    @ApiModelProperty(value = "openId")
    private String openId;

    @ApiModelProperty(value = "门店用户ID")
    private String storeUserId;

    @ApiModelProperty(value = "user_id")
    private Long userId;

    @ApiModelProperty(value = "门店对应的用户名称")
    private String nickName;

    @ApiModelProperty(value = "username")
    private String username;

    @ApiModelProperty(value = "用户token")
    private String token;

    @ApiModelProperty(value = "请求url")
    @TableField("reqUrl")
    private String reqUrl;

    @ApiModelProperty(value = "请求uri")
    @TableField("reqUri")
    private String reqUri;

    @ApiModelProperty(value = "接口耗时ms")
    private String time;

    @ApiModelProperty(value = "请求方式post get")
    private String method;

    @ApiModelProperty(value = "请求参数")
    @TableField("reqParams")
    private String reqParams;

    @ApiModelProperty(value = "返回参数")
    @TableField("resParams")
    private String resParams;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private Date createTime;

    @ApiModelProperty(value = "requestId")
    @TableField("requestId")
    private String requestId;


}
