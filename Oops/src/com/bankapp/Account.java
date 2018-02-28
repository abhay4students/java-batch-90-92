package com.bankapp;

public abstract class Account {
	int accNum;
	String custName;
	double accBal;
	
	abstract void deposit(double amt);
	abstract void withdrawal(double amt);
	void checkBalance()
	{
		System.out.println("Account Ablance :"+accBal);
	}
}
