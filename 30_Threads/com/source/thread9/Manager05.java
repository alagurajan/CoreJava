package com.source.thread9;

class D extends Thread
{
	Thread main;
	D(Thread main)
	{
		this.main=main;
	}
	
	public void run()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
 			System.out.println(e);
		}
		
		System.out.println(main.getState());
	}
}

public class Manager05
{

	public static void main(String[] args)
	{
		Thread main	=	Thread.currentThread();
		D d1		=	new D(main);
		d1.start();
		
		try
		{
			d1.join();
		} 
		catch (InterruptedException e)
		{
 			e.printStackTrace();
		}
		
		System.out.println("end");
	}

}
