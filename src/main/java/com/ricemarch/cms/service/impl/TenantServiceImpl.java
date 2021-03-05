package com.ricemarch.cms.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ricemarch.cms.entity.Tenant;
import com.ricemarch.cms.mapper.TenantMapper;
import com.ricemarch.cms.service.TenantService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 租户，谁租用了这个系统 服务实现类
 * </p>
 *
 * @author ricemarch
 * @since 2021-03-05
 */
@Service
public class TenantServiceImpl extends ServiceImpl<TenantMapper, Tenant> implements TenantService {

}
