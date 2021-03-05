package com.ricemarch.cms.service.impl;

import com.ricemarch.cms.entity.sys.SysReqLog;
import com.ricemarch.cms.mapper.SysReqLogMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Description:
 * @author: tanwentao
 * @date: 2021/3/5
 */

public class SysReqLogService {

    @Resource
    SysReqLogMapper sysReqLogMapper;

    public void saveReqLog(SysReqLog log) {
        log.setCreateTime(new Date());
        new Thread(() -> sysReqLogMapper.insertAllColumn(log)).start();
    }
}
