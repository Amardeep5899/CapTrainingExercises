package com.assignment8.exercise2;

import java.time.LocalTime;

public class RunnablePart implements Runnable {

	 int timer=0;
	@Override
	public void run() {
		while(timer!=10)
		{
			
		    try {
		    	//System.out.println("Countdown: "+(timer++));
		    	LocalTime time=LocalTime.now();
		    	System.out.println(time);
		  //  	timer=timer+1;
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		//    if(timer==10)
		  //  timer=0;
		   
		}
		 
		
		
		
	}
	public static void main(String ar[])
	{
		
		RunnablePart rp=new RunnablePart();
		Thread t=new Thread(rp);
		t.start();
	}
	

}
