package com.ricemarch.cms.bo.reuqest;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Description:
 * @author: tanwentao
 * @date: 2021/3/4
 */

@Data
public class CompanyInfo {
    private Long id;
    @NotNull(message = "签约主体不能为空")
    private Long tenantId;
    // 公司名称
    @NotNull(message = "公司名称不能为空")
    private String companyName;

    //联系人
    @NotNull(message = "联系人不能为空")
    private String contactName;
    //手机。
    @NotNull(message = "联系人手机不能为空")
    private String contactMobilePhone;


    private String createUser;

    private String updateUser;
    private Date updateTime;
    //描述
    private String description = "";

}
