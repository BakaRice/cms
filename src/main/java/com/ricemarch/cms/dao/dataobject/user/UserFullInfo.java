package com.ricemarch.cms.dao.dataobject.user;

import com.ricemarch.cms.bo.RoleBO;
import com.ricemarch.cms.entity.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
//extends User
public class UserFullInfo {
    private List<RoleBO> roleBOList;
//    private Store store;
    //TODO 机构
    /**
     * 门店老板及督导不可编辑
     */
    private boolean readOnly = false;

    /**
     * 機構类型：
     */
    private Byte institutionType;

    @ApiModelProperty("岗位名称")
    private String positionName;

    @ApiModelProperty("工种名称")
    private String professionName;

    @ApiModelProperty("岗位code")
    private String positionCode;

    @ApiModelProperty("工种code")
    private String professionCode;
}
