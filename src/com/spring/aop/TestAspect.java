package com.spring.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面
 */
public class TestAspect {

    private final static Logger log = Logger.getLogger(TestAspect.class);

    public void doAfter(JoinPoint jp) {
	log.info("log Ending method: " + jp.getTarget().getClass().getName()
		+ "." + jp.getSignature().getName());
    }

    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
	long time = System.currentTimeMillis();
	Object retVal = pjp.proceed();
	time = System.currentTimeMillis() - time;
	log.info(pjp.getTarget().getClass().getName() + "."
		+ pjp.getSignature().getName() + "process time: " + time
		+ " ms");
	return retVal;
    }

    public void doBefore(JoinPoint jp) {
	log.info("log Begining method: " + jp.getTarget().getClass().getName()
		+ "." + jp.getSignature().getName());
    }

    public void doThrowing(JoinPoint jp, Throwable ex) {
	log.debug("method " + jp.getTarget().getClass().getName() + "."
		+ jp.getSignature().getName() + " throw exception");
	log.error(ex.getMessage(), ex);
    }
}