package com.shan.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.shan.aopdemo.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;
	
	
	
	public String getName() {
		System.out.println(getClass() + ": in getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + ": in setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + ": in getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": in setServiceCode()");
		this.serviceCode = serviceCode;
	}

	public void addAccount(Account account,boolean vipFlag) {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	
	public boolean doWork() {
		System.out.println(getClass() + ": doWork()");
		return true;
	}
	
	public List<Account> findAccounts(boolean tripWire){
		
		// for academic purpose ... simulate an exception
		if(tripWire) {
			throw new RuntimeException("No soup for you!!!");
		}else {
			List<Account> myAccounts = new ArrayList<>();
			
			Account temp1 = new Account("John","Silver");
			Account temp2 = new Account("Madhu","Platinum");
			Account temp3 = new Account("Luca","Gold");
			
			myAccounts.add(temp1);
			myAccounts.add(temp2);
			myAccounts.add(temp3);
			
			return myAccounts;
		}

	}

	
}
