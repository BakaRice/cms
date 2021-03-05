package com.ricemarch.cms.service;

import com.ricemarch.cms.bo.reuqest.CompanyInfo;
import com.ricemarch.cms.entity.Company;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 公司 服务类
 * </p>
 *
 * @author ricemarch
 * @since 2021-03-04
 */
public interface CompanyService extends IService<Company> {


    /**
     * 添加公司信息
     *
     * @param companyInfo
     * @return
     */
    Company addCompanyInfo(CompanyInfo companyInfo);

    void addCompanyInfo(Company company);

    /**
     * 更新公司信息
     *
     * @param companyInfo
     */
    void updateCompanyInfo(CompanyInfo companyInfo);

    void updateCompanyInfo(Company company);

    /**
     * 主鍵查詢公司信息
     *
     * @param id
     * @return
     */
    Company getCompany(Long id);

}
