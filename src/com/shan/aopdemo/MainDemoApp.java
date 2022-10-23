package com.shan.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shan.aopdemo.dao.AccountDAO;
import com.shan.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// get membership bean from spring container
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		// call the business method
		Account account = new Account();
		account.setName("Madhu");
		account.setLevel("Platinum");
		
		theAccountDAO.addAccount(account,true);
		theAccountDAO.doWork();
		
		theAccountDAO.setName("name");
		theAccountDAO.setServiceCode("serviceCode");
		
		String name = theAccountDAO.getName();
		String code = theAccountDAO.getServiceCode();
		
		// call the membership business method
		theMembershipDAO.addAccount();
		theMembershipDAO.goToSleep();
		
		// close the context
		context.close();
	}

}
