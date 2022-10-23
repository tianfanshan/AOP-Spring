package com.shan.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.shan.aopdemo.Account;

@Aspect
@Component
@Order(-1)
public class MyCloudLogAsyncAspect {

	@Before("com.shan.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void logToCloudAsync(JoinPoint theJoinPoint) {
		System.out.println("\n======>>> Logging to Cloud in async fashion");
		
		// display the method signature
		MethodSignature signature = (MethodSignature)theJoinPoint.getSignature();
		System.out.println("Method signature: " + signature);
		
		// display method arguments
		Object[] args = theJoinPoint.getArgs();
		
		for(Object tempArg : args) {
			System.out.println(tempArg);
			if(tempArg instanceof Account) {
				Account theAccount = (Account) tempArg;
				System.out.println("account name: " + theAccount.getName());
				System.out.println("account level: " + theAccount.getLevel());
			}
		}
	}
}
