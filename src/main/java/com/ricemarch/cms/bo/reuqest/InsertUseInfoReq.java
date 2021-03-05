package com.ricemarch.cms.bo.reuqest;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

/**
 * @Description: 用於插入userinfo的request
 * @author: tanwentao
 * @date: 2021/3/4
 */
@Data
public class InsertUseInfoReq {

    private String id;
    @NotNull(message = "姓名不能为空")
    @Size(max = 60, message = "姓名长度不能超过60位")
    private String username;

    private String password;

    @NotNull(message = "人事状态不能为空")
    private String state;

    @NotNull(message = "手机号不能为空")
    @Size(min = 11, max = 11, message = "手机号只能为11位")
    private String phone;

    private String idcardNumber;

    private Date birthday;

    private Date entryDay;
    @Size(max = 50, message = "家庭住址不能超过50个字符")
    private String address;

    private String userType;

    //由store改建的institution
    private Long institutionId;

    private Long companyId;

    private Long tenantId;

    private Boolean resetFlag;
    @Size(max = 200, message = "备注不能超过200个字符")
    private String mark;

    private Boolean isDelete;

    private String updateUser;

    private String createUser;

    private Date createTime;

    private Date updateTime;

    private Boolean technician = true;

    private Boolean accountState = false;
    /**
     * 性别
     */
    private String gender;

//    /**
//     * 薪水
//     */
//    private Double salary;

    @NotNull(message = "员工角色不能为空")
    private List<String> roleCodeList;

    @ApiModelProperty("岗位code")
    private String positionCode;

    @ApiModelProperty("工种code")
    private String professionCode;

}
