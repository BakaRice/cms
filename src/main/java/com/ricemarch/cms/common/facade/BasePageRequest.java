package com.ricemarch.cms.common.facade;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString(callSuper = true)
public class BasePageRequest extends BaseRequest implements Serializable {


    private static final long serialVersionUID = 1L;

    /**
     * 开始条数（0开始）
     */
    @ApiModelProperty(value = "开始条数(0爱开始)")
    private Integer offSet;

    /**
     * 本次查询条数
     */
    @ApiModelProperty(value = "本次查询条数")
    private Integer length;
}
