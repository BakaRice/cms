package com.ricemarch.cms.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 租户，谁租用了这个系统
 * </p>
 *
 * @author ricemarch
 * @since 2021-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Tenant extends Model<Tenant> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 租户名称
     */
    @TableField("tenant_name")
    private String tenantName;
    /**
     * 签约人姓名
     */
    @TableField("principal_name")
    private String principalName;
    /**
     * 签约人移动电话
     */
    @TableField("principal_mobile_phone")
    private String principalMobilePhone;
    /**
     * 身份证
     */
    @TableField("principal_identity_card")
    private String principalIdentityCard;
    /**
     * 租户电话
     */
    private String telephone;
    /**
     * 资质照片
     */
    @TableField("image_url")
    private String imageUrl;
    /**
     * 租户通讯地址
     */
    private String address;
    /**
     * 租户描述
     */
    private String description;
    /**
     * 状态 0 正常
     */
    @TableField("status_type")
    private Integer statusType;
    /**
     * 开始时间
     */
    @TableField("begin_date")
    private Date beginDate;
    /**
     * 结束时间
     */
    @TableField("end_date")
    private Date endDate;
    /**
     * 创建人
     */
    @TableField("create_user")
    private String createUser;
    /**
     * 更新人
     */
    @TableField("update_user")
    private String updateUser;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
