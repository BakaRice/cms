package com.ricemarch.cms;

import com.ricemarch.cms.dao.dataobject.sys.SysReqLog;
import com.ricemarch.cms.service.impl.SysReqLogService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Date;

/**
 * @author RiceMarch
 * @date 2021/3/3 22:02
 */
@Slf4j
@Aspect
@Component
@Order(Ordered.LOWEST_PRECEDENCE - 10)
public class RequestAspect {

    @Autowired
    private SysReqLogService sysReqLogService;


    @Pointcut("execution(* com.ricemarch.cms.controller..*.*(..))")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        log.info("{}", joinPoint.getTarget().getClass().getName());
        log.info("hi!");
        SysReqLog sysReqLog = new SysReqLog();
        sysReqLog.setUsername("Test");
        sysReqLog.setCreateTime(Date.from(Instant.now()));
        sysReqLogService.saveReqLog(sysReqLog);
        log.info("sys req in!");
    }
}
