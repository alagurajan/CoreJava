package com.source.thread2;

class Thread2 extends Thread
{
 	public void run()
	{
 		try
		{
			sleep(10000);
		} 
		catch (InterruptedException e)
		{
			System.out.println("exception");
		}
			
			System.out.println(isInterrupted());
	}
}

public class Manager28
{
	public static void main(String[] args) 
	{
		Thread2 t1	=	new Thread2();
		t1.start();
		
		ThreadUtil.sleep(2000);
		t1.interrupt();
		
		System.out.println("done");
	}
}
