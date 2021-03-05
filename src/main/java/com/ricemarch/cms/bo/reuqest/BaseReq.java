package com.ricemarch.cms.bo.reuqest;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * @Description:
 * @author: tanwentao
 * @date: 2021/3/4
 */

@Setter
@Getter
public class BaseReq implements Serializable {

    @ApiModelProperty(value = "頁碼", required = false, example = "2")
    private Integer start = 0;

    @ApiModelProperty(value = "頁量", required = false, example = "10")
    private Integer num = 10;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
