package com.ricemarch.cms.bo.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Description:
 * @author: tanwentao
 * @date: 2021/3/4
 */

@Data
public class CurrentAccountRoleResp implements Serializable {
    private static final long serialVersionUID = 1489614499221748754L;

    @ApiModelProperty("角色id")
    private Long roleId;

    @ApiModelProperty("角色编码")
    private String roleCode;

    @ApiModelProperty("角色名称")
    private String roleName;
    @ApiModelProperty("系统标识")
    private String systemCode;

//    @ApiModelProperty("权限列表")
//    private List<CurrentUserPermissionResp> permissionRespList;
}