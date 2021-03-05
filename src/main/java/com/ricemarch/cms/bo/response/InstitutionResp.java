package com.ricemarch.cms.bo.response;

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
public class InstitutionResp implements Serializable {
    private static final long serialVersionUID = 4973845312630369576L;

    private Long institutionId;

    private String institutionCode;

    private String institutionName;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
