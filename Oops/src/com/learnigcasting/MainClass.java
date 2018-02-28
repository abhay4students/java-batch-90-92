package com.learnigcasting;

public class MainClass {
	public static void main(String[] args) {
		//upcasting
		Sample1 s1=(Sample1)new Sample2();
		
		//Downcasting
		//Sample2 s2=(Sample2)new Sample1();
		
		//Downcasting 
		Sample2 s3=(Sample2)s1;	
	}

}
