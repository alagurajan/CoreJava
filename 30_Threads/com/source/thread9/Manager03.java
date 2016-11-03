package com.source.thread9;

class B extends Thread
{
 	public void run()
	{
		System.out.println("Begin");
		
		try
		{
			Thread.sleep(10000);
		}
		catch (InterruptedException e)
		{
 			e.printStackTrace();
		}
		System.out.println("End");
	}
}

public class Manager03
{

	public static void main(String[] args)
	{
		B b1	=	new B();
		b1.start();
		
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
 			System.out.println(e);
		}
		
		System.out.println(b1.getState());
		
	}

}
