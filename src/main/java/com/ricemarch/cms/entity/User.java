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
 * 
 * </p>
 *
 * @author ricemarch
 * @since 2021-03-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @ApiModelProperty(value = "微信小程序openId")
    private String openId;

    @ApiModelProperty(value = "微信unionId")
    private String unionId;

    @ApiModelProperty(value = "名称")
    private String username;

    @ApiModelProperty(value = "头像链接")
    private String headImage;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "人事状态 on 在职，off 离职")
    private String state;

    @ApiModelProperty(value = "账号状态 默认未启用")
    private Boolean accountState;

    @ApiModelProperty(value = "薪水")
    private Double salary;

    private String gender;

    private Boolean active;

    @ApiModelProperty(value = "年纪")
    private Integer age;

    @ApiModelProperty(value = "手机号码")
    private String phone;

    @ApiModelProperty(value = "身份证号码")
    private String idcardNumber;

    @ApiModelProperty(value = "生日")
    private Date birthday;

    @ApiModelProperty(value = "入职时间")
    private Date entryDay;

    @ApiModelProperty(value = "地址信息")
    private String address;

    @ApiModelProperty(value = "store 门店用户 company 公司用户 tenant 租户用户")
    private String userType;

    private Long storeId;

    private Long companyId;

    private Long tenantId;

    @ApiModelProperty(value = "组织机构账号ID")
    private Long sysUserId;

    @ApiModelProperty(value = "密码是否手动设置")
    private Boolean resetFlag;

    @ApiModelProperty(value = "备注")
    private String mark;

    @ApiModelProperty(value = "是否删除")
    private Boolean isDelete;

    @ApiModelProperty(value = "存id")
    private String updateUser;

    @ApiModelProperty(value = "存id")
    private String createUser;

    private Date createTime;

    private Date updateTime;

    @ApiModelProperty(value = "店员编码")
    private String userNo;

    @ApiModelProperty(value = "岗位code")
    private String positionCode;

    @ApiModelProperty(value = "工种code")
    private String professionCode;


}
