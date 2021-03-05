package com.ricemarch.cms.bo.reuqest;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Description: user 查詢 request
 * @author: tanwentao
 * @date: 2021/3/4
 */

@Data
public class UserQueryReq implements Serializable {

    @NotNull(message = "关键字不能为空")
    private String search;

    private Integer roleId;

    private String state;

    private Integer pageNum = 0;

    private Integer pageSize = 10;
    private Boolean accountState;
    //store -> institution
    private String institutionId;
    private String companyId;
    private String tenant;
    private String userType;
    private String clientType;

    @ApiModelProperty("岗位code")
    private String positionCode;

    @ApiModelProperty("工种code")
    private String professionCode;

    public Integer getPageNum() {
        return pageNum + 1;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}