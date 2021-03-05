package com.ricemarch.cms.service.impl;

import com.ricemarch.cms.dao.dataobject.sys.SysReqLog;
import com.ricemarch.cms.dao.mapper.SysReqLogWriteMapper;
//import com.ricemarch.cms.dao.repository.SysReqLogWriteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Description: 用於存放request日志信息的服務
 * @author: tanwentao
 * @date: 2021/3/4
 */
@Service
@Slf4j
public class SysReqLogService {

    @Resource
    private SysReqLogWriteMapper sysReqLogWriteMapper;

    public void saveReqLog(SysReqLog log) {
        log.setCreateTime(new Date());
        new Thread(() -> sysReqLogWriteMapper.insertAllColumn(log)).start();
    }
}

