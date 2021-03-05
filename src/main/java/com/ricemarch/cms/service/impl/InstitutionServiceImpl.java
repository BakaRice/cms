package com.ricemarch.cms.service.impl;

import com.ricemarch.cms.entity.Institution;
import com.ricemarch.cms.mapper.InstitutionMapper;
import com.ricemarch.cms.service.InstitutionService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

/**
 * <p>
 * 机构（车间，检查班，仓库等） 服务实现类
 * </p>
 *
 * @author ricemarch
 * @since 2021-03-05
 */
@Service
public class InstitutionServiceImpl extends ServiceImpl<InstitutionMapper, Institution> implements InstitutionService {

}
