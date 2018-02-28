package com.learnnghasarelationship;

public class Mobile {
	String color = "Silver";
	double size = 4.5;
	String os = "Windows";
	static Battery b1=new Battery();
	static void call(long number)
	{
		System.out.println("Calling "+number+"......");
	}
	public void music(String song)
	{
		System.out.println("Palying "+song+".......");
	}
	public void charging()
	{
		b1.charge();
	}
	
}
