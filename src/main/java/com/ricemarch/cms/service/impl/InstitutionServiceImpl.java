package com.ricemarch.cms.service.impl;

import com.ricemarch.cms.bo.dto.CustomUser;
import com.ricemarch.cms.bo.response.InstitutionResp;
import com.ricemarch.cms.bo.reuqest.InstitutionInfo;
import com.ricemarch.cms.entity.Institution;
import com.ricemarch.cms.dao.mapper.InstitutionMapper;
import com.ricemarch.cms.service.InstitutionService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 机构（车间，检查班，仓库等） 服务实现类
 * </p>
 *
 * @author ricemarch
 * @since 2021-03-04
 */
@Service
public class InstitutionServiceImpl extends ServiceImpl<InstitutionMapper, Institution> implements InstitutionService {

    @Override
    public InstitutionResp getInstitutionInfo(Long institutionId) {
        return null;
    }

    @Override
    public void platformAddInstitutionInfo(InstitutionInfo institutionInfo, CustomUser userCore) throws Exception {

    }
}
