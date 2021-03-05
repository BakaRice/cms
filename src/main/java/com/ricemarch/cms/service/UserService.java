package com.ricemarch.cms.service;

import com.github.pagehelper.PageInfo;
import com.ricemarch.cms.bo.dto.CustomUser;
import com.ricemarch.cms.bo.reuqest.InsertUseInfoReq;
import com.ricemarch.cms.bo.reuqest.UpdateUseInfoReq;
import com.ricemarch.cms.bo.reuqest.UserQueryReq;
import com.ricemarch.cms.dao.dataobject.user.UserFullInfo;
import com.ricemarch.cms.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author ricemarch
 * @since 2021-03-04
 */
public interface UserService extends IService<User> {

    /**
     * 查詢員工詳細信息
     *
     * @param userId
     * @return
     */
    UserFullInfo getUserInfoById(String userId);

    /**
     * 獲取用戶詳細信息
     * 包括用戶的所在部門信息
     *
     * @param userId
     * @return
     */
    UserFullInfo getDetailUserInfo(String userId);

    /**
     * 添加用戶的信息
     * 用戶的權限
     * 用戶的角色
     *
     * @param insertUseInfoReq
     */
    void addInstitutionUserInfo(InsertUseInfoReq insertUseInfoReq, CustomUser customUser);

    /**
     * 添加用户信息
     *
     * @param user
     */
    void addUser(User user);

    /**
     * 获取用户信息
     *
     * @param user
     * @return
     */
    User getUser(User user);

    /**
     * userID 获取用户信息
     *
     * @param userId
     * @return
     */
    User getUserById(String userId);

    /**
     * 更新用户信息
     * 角色列表
     * 电话号码
     *
     * @param useInfoReq
     * @param customUser
     */
    void updateUserInfo(UpdateUseInfoReq useInfoReq, CustomUser customUser);

    void updateUser(User user);

    /**
     * 全字段更新user表
     *
     * @param user
     */
    void updateUserWithAllColumn(User user);

    /**
     * 查询用户全部信息
     * 包括角色和门店
     *
     * @param userId
     * @param clientType
     * @return
     */
    UserFullInfo getInfoByUserId(String userId, String clientType);

    /**
     * 获取用户信息列表
     *
     * @param userQueryReq
     * @return
     */
    PageInfo<UserFullInfo> getFullUserList(UserQueryReq userQueryReq);
}
