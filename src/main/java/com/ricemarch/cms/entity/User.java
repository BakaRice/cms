package com.ricemarch.cms.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ricemarch
 * @since 2021-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;
    /**
     * 微信小程序openId
     */
    @TableField("open_id")
    private String openId;
    /**
     * 微信unionId
     */
    @TableField("union_id")
    private String unionId;
    /**
     * 名称
     */
    private String username;
    /**
     * 头像链接
     */
    @TableField("head_image")
    private String headImage;
    /**
     * 密码
     */
    private String password;
    /**
     * 人事状态 on 在职，off 离职
     */
    private String state;
    /**
     * 账号状态 默认未启用
     */
    @TableField("account_state")
    private Integer accountState;
    /**
     * 薪水
     */
    private Double salary;
    private String gender;
    private Integer active;
    /**
     * 年纪
     */
    private Integer age;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 身份证号码
     */
    @TableField("idcard_number")
    private String idcardNumber;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 入职时间
     */
    @TableField("entry_day")
    private Date entryDay;
    /**
     * 地址信息
     */
    private String address;
    /**
     * store 门店用户 company 公司用户 tenant 租户用户
     */
    @TableField("user_type")
    private String userType;
    @TableField("store_id")
    private Long storeId;
    @TableField("company_id")
    private Long companyId;
    @TableField("tenant_id")
    private Long tenantId;
    /**
     * 组织机构账号ID
     */
    @TableField("sys_user_id")
    private Long sysUserId;
    /**
     * 密码是否手动设置
     */
    @TableField("reset_flag")
    private Integer resetFlag;
    /**
     * 备注
     */
    private String mark;
    /**
     * 是否删除
     */
    @TableField("is_delete")
    private Integer isDelete;
    /**
     * 存id
     */
    @TableField("update_user")
    private String updateUser;
    /**
     * 存id
     */
    @TableField("create_user")
    private String createUser;
    @TableField("create_time")
    private Date createTime;
    @TableField("update_time")
    private Date updateTime;
    /**
     * 店员编码
     */
    @TableField("user_no")
    private String userNo;
    /**
     * 岗位code
     */
    @TableField("position_code")
    private String positionCode;
    /**
     * 工种code
     */
    @TableField("profession_code")
    private String professionCode;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
