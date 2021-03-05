package com.ricemarch.cms.bo.reuqest;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Description: User request 包装类
 * @author: tanwentao
 * @date: 2021/3/4
 */
@Data
public class UserReq implements Serializable {


    private static final long serialVersionUID = 937416093630936160L;

    /**
     * 主键
     */
    private String id;
    /**
     * 名称
     */
    @NotNull
    private String username;
}
