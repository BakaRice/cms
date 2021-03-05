package com.ricemarch.cms.bo.dto;

import lombok.Data;

@Data
public class CustomUser extends BaseUser {

    private Integer systemCode;

    private Long storeId;

    private Long companyId;

    private String companyName;

    private Integer companyType;

    private String openId;

    private Long id;

    /**
     * 機構用户ID
     */
    private String institutionUserId;

    /**
     * 機構名称
     */
    private String institutionName;

    /**
     * 機構对应的用户名称
     */
    private String nickName;

}
