package com.ricemarch.cms.common.facade;


import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 请求基类 供新接口使用
 *
 * @author tanwentao
 */
@Getter
@Setter
@ToString
public class BaseRequest implements Serializable {


    /**
     * 渠道
     */
    @NotNull(message = "渠道不能为空")
    @ApiModelProperty(value = "渠道")
    private String channel;

    /**
     * API版本
     */
    @ApiModelProperty(value = "API版本")
    private String apiVersion = "1.0";

}