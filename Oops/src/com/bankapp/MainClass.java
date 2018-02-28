package com.bankapp;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("*****************************");
		System.out.println("Welcome To QspiderBank");
		AccountManager divya=new AccountManager();
		TellerTxn abhay=new TellerTxn();
		Account malathyAccount=divya.openAccount("Malathy", 12344, 50000, 's');
		abhay.balanceEnquiry(malathyAccount);
		System.out.println("*****************************");
		abhay.depositTxn(malathyAccount, 5000);
		abhay.balanceEnquiry(malathyAccount);
		System.out.println("*****************************");
		abhay.withdrawalTxn(malathyAccount, 10000);
		abhay.balanceEnquiry(malathyAccount);
		System.out.println("*****************************");	
	}
}
