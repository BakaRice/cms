package com.ricemarch.cms.service;

import com.ricemarch.cms.bo.dto.CustomUser;
import com.ricemarch.cms.bo.response.InstitutionResp;
import com.ricemarch.cms.bo.reuqest.InstitutionInfo;
import com.ricemarch.cms.entity.Institution;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 机构（车间，检查班，仓库等） 服务类
 * </p>
 *
 * @author ricemarch
 * @since 2021-03-04
 */
public interface InstitutionService extends IService<Institution> {

    /**
     * 根據機構id查詢機構信息
     *
     * @param institutionId
     * @return
     */
    InstitutionResp getInstitutionInfo(Long institutionId);


    /**
     * 管理平台
     * 添加機構信息
     *
     * @param institutionInfo
     * @param userCore
     */
    void platformAddInstitutionInfo(InstitutionInfo institutionInfo, CustomUser userCore) throws Exception;

}
