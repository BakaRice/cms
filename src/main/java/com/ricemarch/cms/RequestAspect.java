package com.ricemarch.cms;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author RiceMarch
 * @date 2021/3/3 22:02
 */
@Aspect
@Component
@Slf4j
public class RequestAspect {
    @Pointcut("execution(* com.ricemarch.cms.controller..*.*(..))")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        log.info("{}", joinPoint.getTarget().getClass().getName());
        log.info("hi!");
    }
}
