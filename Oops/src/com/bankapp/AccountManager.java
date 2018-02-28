package com.bankapp;

public class AccountManager {
	Account openAccount(String custName,int accNum,double initAmt,char type)
	{
		Account acc1=null;
		if(type=='s')
		{
			acc1=new SavingAccount(accNum, custName, initAmt);
		}else if(type=='l')
		{
			acc1=new LoanAccount(accNum, custName, initAmt);
		}
		return acc1;
	}

	void close(Account acc1)
	{
		acc1=null;
	}
}
