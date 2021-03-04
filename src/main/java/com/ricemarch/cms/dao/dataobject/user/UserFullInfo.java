package com.ricemarch.cms.dao.dataobject.user;

import com.ricemarch.cms.BO.RoleBO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class UserFullInfo extends User {
    private List<RoleBO> roleBOList;
    private Store store;
    /**
     * 门店老板及督导不可编辑
     */
    private boolean readOnly = false;

    /**
     * 门店类型：1自主门店，2途虎合作店，3汽配龙三方店
     */
    private Byte storeType;

    @ApiModelProperty("岗位名称")
    private String positionName;

    @ApiModelProperty("工种名称")
    private String professionName;

    @ApiModelProperty("岗位code")
    private String positionCode;

    @ApiModelProperty("工种code")
    private String professionCode;
}
