package com.ricemarch.cms.bo.reuqest;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Description: 登錄請求
 * @author: tanwentao
 * @date: 2021/3/4
 */

public class LoginReq implements Serializable {
    private static final long serialVersionUID = -5214828800659357757L;

    @ApiModelProperty("用户账号（手机号码）")
    private String account;

    @ApiModelProperty("密码")
    private String clientSecret;

    @ApiModelProperty("機構id")
    private Long institutionId;
}
