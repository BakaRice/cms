package com.ricemarch.cms.service.impl;

import com.ricemarch.cms.bo.reuqest.CompanyInfo;
import com.ricemarch.cms.entity.Company;
import com.ricemarch.cms.dao.mapper.CompanyMapper;
import com.ricemarch.cms.service.CompanyService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公司 服务实现类
 * </p>
 *
 * @author ricemarch
 * @since 2021-03-04
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements CompanyService {

    @Override
    public Company addCompanyInfo(CompanyInfo companyInfo) {
        return null;
    }

    @Override
    public void addCompanyInfo(Company company) {

    }

    @Override
    public void updateCompanyInfo(CompanyInfo companyInfo) {

    }

    @Override
    public void updateCompanyInfo(Company company) {

    }

    @Override
    public Company getCompany(Long id) {
        return null;
    }
}
