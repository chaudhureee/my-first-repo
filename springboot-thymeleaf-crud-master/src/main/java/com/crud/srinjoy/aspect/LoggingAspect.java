package com.crud.srinjoy.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	 private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	    @AfterReturning(pointcut = "execution(* com.crud.srinjoy.service.*.*(..))", returning = "result")
	    public void logServiceMethods(Object result) {
	        logger.info("Method executed successfully with result: {}", result);

	    }
}