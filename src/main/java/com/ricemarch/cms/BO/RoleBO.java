package com.ricemarch.cms.BO;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RoleBO implements Serializable {

    private static final long serialVersionUID = 3502136010649680454L;
    private Integer id;

    private Integer userId;

    private String num;

    private String code;
    private String name;

    private String remarks;

    private List<PermissionBO> permissionBOList;

}