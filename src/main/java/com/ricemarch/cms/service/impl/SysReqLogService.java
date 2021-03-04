package com.ricemarch.cms.service.impl;

import com.ricemarch.cms.dao.dataobject.sys.SysReqLog;
import com.ricemarch.cms.dao.repository.SysReqLogWriteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Description: 用於存放request日志信息的服務
 * @author: tanwentao
 * @date: 2021/3/4
 */
@Service
@Slf4j
public class SysReqLogService {

    @Autowired
    private SysReqLogWriteRepository sysReqLogWriteRepository;

    public void saveReqLog(SysReqLog log) {
        log.setCreateTime(new Date());
        new Thread(() -> sysReqLogWriteRepository.save(log)).start();
    }
}

