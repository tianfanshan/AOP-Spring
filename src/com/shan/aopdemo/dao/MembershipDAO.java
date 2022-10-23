package com.shan.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public String addAccount() {
		System.out.println(getClass() + ": DOING STUFF: ADDING A MENBERSHIP ACCOUNT");
		return "string";
	}
	
	public void goToSleep() {
		System.out.println(getClass() + ": goToSleep()");
	}
}
