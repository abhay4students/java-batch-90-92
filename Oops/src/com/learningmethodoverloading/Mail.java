package com.learningmethodoverloading;

public class Mail {
	int compose(String to)
	{
		
		System.out.println("Msg has been sent");
		return 10;
	}
	void compose(String to,String sub)
	{
		System.out.println("Msg has been sent");
	}
	void compose(String to,String sub,String body)
	{
		System.out.println("Msg has been sent");
	}

}
