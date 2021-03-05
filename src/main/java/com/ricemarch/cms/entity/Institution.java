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
 * 机构（车间，检查班，仓库等）
 * </p>
 *
 * @author ricemarch
 * @since 2021-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Institution extends Model<Institution> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 租户ID
     */
    @TableField("tenant_id")
    private Long tenantId;
    /**
     * 公司ID
     */
    @TableField("company_id")
    private Long companyId;
    /**
     * 状态 0 正常
     */
    @TableField("status_type")
    private Integer statusType;
    /**
     * 门店名称
     */
    @TableField("institution_name")
    private String institutionName;
    /**
     * 门店门头图片
     */
    @TableField("image_path")
    private String imagePath;
    /**
     * 城市ID
     */
    @TableField("city_id")
    private String cityId;
    /**
     * 区ID
     */
    @TableField("region_id")
    private String regionId;
    /**
     * 门店地址
     */
    private String address;
    /**
     * 负责人
     */
    @TableField("principal_name")
    private String principalName;
    /**
     * 联系人姓名
     */
    @TableField("contact_name")
    private String contactName;
    /**
     * 固定电话
     */
    @TableField("line_telephone")
    private String lineTelephone;
    /**
     * 手机
     */
    @TableField("mobile_phone")
    private String mobilePhone;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 网址
     */
    private String website;
    /**
     * 传真
     */
    private String fax;
    /**
     * 经营范围
     */
    @TableField("business_scope")
    private String businessScope;
    /**
     * 邮编
     */
    private String post;
    /**
     * qq账号
     */
    @TableField("qq_account")
    private String qqAccount;
    /**
     * 开户银行
     */
    @TableField("bank_name")
    private String bankName;
    /**
     * 银行账号
     */
    @TableField("bank_account")
    private String bankAccount;
    /**
     * 营业时间起
     */
    @TableField("opening_effective_date")
    private Date openingEffectiveDate;
    /**
     * 营业时间止
     */
    @TableField("opening_expiry_date")
    private Date openingExpiryDate;
    /**
     * 备注
     */
    private String memo;
    /**
     * 创建用户
     */
    @TableField("create_user")
    private String createUser;
    /**
     * 更改用户
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
    /**
     * 门店照片,最多5张,多个逗号分隔
     */
    @TableField("image_paths")
    private String imagePaths;
    /**
     * c端预约电话
     */
    @TableField("client_appoint_phone")
    private String clientAppointPhone;
    /**
     * c端展示标签id,多个逗号分隔
     */
    @TableField("client_tag")
    private String clientTag;
    /**
     * c端展示常规服务项目编码code，项目名称，别名,json字符串
     */
    @TableField("client_common_service")
    private String clientCommonService;
    /**
     * 门店地址经度
     */
    private Double lon;
    /**
     * 门店地址维度
     */
    private Double lat;
    /**
     * 微信小程序二维码图片链接
     */
    @TableField("weixin_qr_url")
    private String weixinQrUrl;
    /**
     * 门店编码
     */
    @TableField("store_no")
    private String storeNo;
    /**
     * 是否删除
     */
    @TableField("is_delete")
    private Integer isDelete;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
