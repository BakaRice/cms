package com.ricemarch.cms.bo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class PermissionBO implements Serializable {

    private Integer id;

    private Integer pid;

    private String name;
    private String sort;

    private String url;

    private String memo;

    private String method;

    private String type;

    private String clientType;

    private Boolean isDelete;

    private String updateUser;

    private String createUser;

    private Date createTime;

    private Date updateTime;
    private String parentName;
    private boolean checked;
    private List<PermissionBO> children;

}
