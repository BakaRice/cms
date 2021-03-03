package com.ricemarch.cms.common.facade;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 请求基类 供新接口使用
 *
 * @author tanwentao
 * @param <T>
 */

@Setter
@Getter
@ToString(callSuper = true)
public class BizBaseRequest<T> extends BaseRequest {

    private static final long serialVersionUID = 1L;

    @NotNull(message = "postData不能为空")
    @ApiModelProperty(value = "请求对象内容")
    @Valid
    public T postData;
}
