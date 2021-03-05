package com.ricemarch.cms.service.impl;

import com.ricemarch.cms.entity.User;
import com.ricemarch.cms.mapper.UserMapper;
import com.ricemarch.cms.service.UserService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ricemarch
 * @since 2021-03-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
