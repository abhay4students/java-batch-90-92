package com.learnnghasarelationship;

public class Battery {
	int capacity=1400;
	int rembattery=14;
	public void charge()
	{
		System.out.println("Charging...");
		for(int i=rembattery;i<=100;i++)
		{
			
			System.out.println("Remaining Battery is :"+rembattery+"%");
			rembattery++;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
}
