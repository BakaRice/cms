package com.ricemarch.cms.dao.dataobject.sys;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 系統日志實體類
 * @author: tanwentao
 * @date: 2021/3/4
 */


@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_req_log")
public class SysReqLog implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField(value = "store_id")
    private Long storeId = 0L;
    @TableField(value = "company_id")
    private Long companyId = 0L;
    @TableField(value = "open_id")
    private String openId = "";
    @TableField(value = "store_user_id")
    private String storeUserId = "";
    @TableField(value = "user_id")
    private Long userId = 0L;
    @TableField(value = "account")
    private String account = "";
    @TableField(value = "org_id")
    private Long orgId = 0L;
    @TableField(value = "tenant_id")
    private Long tenantId = 0L;
    @TableField(value = "username")
    private String username = "";
    @TableField(value = "nick_name")
    private String nickName = "";
    private String token = "";
    private String source = "";
    @TableField(value = "reqUrl")
    private String reqUrl = "";
    @TableField(value = "method")
    private String method = "";
    @TableField(value = "reqUri")
    private String reqUri = "";
    @TableField(value = "reqParams")
    private String reqParams = "";
    @TableField(value = "resParams")
    private String resParams = "";
    @TableField(value = "createTime")
    private Date createTime = new Date();
    private String time = "";
    @TableField(value = "requestId")
    private String requestId = "";
}