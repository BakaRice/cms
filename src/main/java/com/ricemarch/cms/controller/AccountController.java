package com.ricemarch.cms.controller;

import com.ricemarch.cms.bo.dto.UserDTO;
import com.ricemarch.cms.bo.reuqest.UserReq;
import com.ricemarch.cms.common.facade.BizBaseResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: 账号controller 用于注册 登录等
 * @author: tanwentao
 * @date: 2021/3/4
 */
@RestController
@RequestMapping("/api/account")
public class AccountController {

    /**
     * 创建新用户
     */
    @PostMapping
    public BizBaseResponse setUser(@Validated @RequestBody UserReq userReq) {
        BizBaseResponse response = new BizBaseResponse();
        //TODO userservice save ...

        response.setData(userReq);
        return response;
    }

    /**
     * 获取单个用户信息
     *
     * @param userId SysUserId
     */
    @GetMapping("/id/{userId}")
    public BizBaseResponse<UserDTO> getUserInfoById(@PathVariable("userId") String userId) {
        BizBaseResponse<UserDTO> response = new BizBaseResponse<>();
        //TODO Userservice getUser

        UserDTO userDTO = new UserDTO();
        userDTO.setSysUserId(Long.valueOf(userId));
        userDTO.setUsername("username");
        response.setData(userDTO);
        return response;
    }
}
