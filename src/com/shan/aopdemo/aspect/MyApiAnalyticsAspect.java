package com.shan.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyApiAnalyticsAspect {
	
	@Before("com.shan.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void perfomApiAnalytics() {
		System.out.println("\n======>>> Performing API analytics");
	}
}
