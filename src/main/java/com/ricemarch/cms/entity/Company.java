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
 * 公司
 * </p>
 *
 * @author ricemarch
 * @since 2021-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Company extends Model<Company> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 租户ID
     */
    @TableField("tenant_id")
    private Long tenantId;
    /**
     * 公司名称
     */
    @TableField("company_name")
    private String companyName;
    /**
     * 公司描述
     */
    private String description;
    /**
     * 联系人姓名
     */
    @TableField("contact_name")
    private String contactName;
    /**
     * 联系人手机
     */
    @TableField("contact_mobile_phone")
    private String contactMobilePhone;
    /**
     * 公司电话
     */
    private String telephone;
    /**
     * 公司通讯地址
     */
    private String address;
    /**
     * 营业执照照片
     */
    @TableField("image_url")
    private String imageUrl;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 状态 0 正常
     */
    @TableField("status_type")
    private Integer statusType;
    /**
     * 创建用户
     */
    @TableField("create_user")
    private String createUser;
    /**
     * 更新用户
     */
    @TableField("update_user")
    private String updateUser;
    @TableField("create_time")
    private Date createTime;
    @TableField("update_time")
    private Date updateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
