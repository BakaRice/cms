package com.ricemarch.cms.bo.dto;

import com.ricemarch.cms.bo.response.CurrentAccountRoleResp;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class BaseUser {
    private Long accountId;
    private String password;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("登录账号")
    private String account;

    @ApiModelProperty("组织id")
    private Long orgId;

    @ApiModelProperty("组织名称")
    private String orgName;

    @ApiModelProperty("機構id")
    private Long institutionId;

    @ApiModelProperty("機構名称")
    private String institutionName;

    @ApiModelProperty("角色列表")
    private List<CurrentAccountRoleResp> userRoleList;

    @ApiModelProperty("用户名称")
    private String username;

    private boolean enabled;
    private boolean accountNonExpired;
    private boolean credentialsNonExpired;
    private boolean accountNonLocked;

}
