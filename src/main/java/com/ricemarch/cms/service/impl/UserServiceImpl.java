package com.ricemarch.cms.service.impl;

import com.github.pagehelper.PageInfo;
import com.ricemarch.cms.bo.dto.CustomUser;
import com.ricemarch.cms.bo.reuqest.InsertUseInfoReq;
import com.ricemarch.cms.bo.reuqest.UpdateUseInfoReq;
import com.ricemarch.cms.bo.reuqest.UserQueryReq;
import com.ricemarch.cms.dao.dataobject.user.UserFullInfo;
import com.ricemarch.cms.entity.User;
import com.ricemarch.cms.dao.mapper.UserMapper;
import com.ricemarch.cms.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ricemarch
 * @since 2021-03-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public UserFullInfo getUserInfoById(String userId) {
        return null;
    }

    @Override
    public UserFullInfo getDetailUserInfo(String userId) {
        return null;
    }

    @Override
    public void addInstitutionUserInfo(InsertUseInfoReq insertUseInfoReq, CustomUser customUser) {

    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public User getUser(User user) {
        return null;
    }

    @Override
    public User getUserById(String userId) {
        return null;
    }

    @Override
    public void updateUserInfo(UpdateUseInfoReq useInfoReq, CustomUser customUser) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void updateUserWithAllColumn(User user) {

    }

    @Override
    public UserFullInfo getInfoByUserId(String userId, String clientType) {
        return null;
    }

    @Override
    public PageInfo<UserFullInfo> getFullUserList(UserQueryReq userQueryReq) {
        return null;
    }
}
