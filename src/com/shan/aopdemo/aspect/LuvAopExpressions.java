package com.shan.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LuvAopExpressions {

	@Pointcut("execution(* com.shan.aopdemo.dao.*.*(..))")
	protected void forDaoPackage() {}
	
	@Pointcut("execution(* com.shan.aopdemo.dao.*.get*(..))")
	protected void getter() {}
	
	@Pointcut("execution(* com.shan.aopdemo.dao.*.set*(..))")
	protected void setter() {}
	
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	protected void forDaoPackageNoGetterSetter() {}
}
