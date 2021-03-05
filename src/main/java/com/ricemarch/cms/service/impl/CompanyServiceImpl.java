package com.ricemarch.cms.service.impl;

import com.ricemarch.cms.entity.Company;
import com.ricemarch.cms.mapper.CompanyMapper;
import com.ricemarch.cms.service.CompanyService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

/**
 * <p>
 * 公司 服务实现类
 * </p>
 *
 * @author ricemarch
 * @since 2021-03-05
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements CompanyService {

}
