package com.source.thread9;

class A extends Thread
{
 	public void run()
	{
		for (int i = 0; i < 3000; i++)
		{
			System.out.println(i);
		}
	}
}

public class Manager02
{

	public static void main(String[] args)
	{
		A a1	=	new A();
		
		System.out.println("a:"+a1.getState());
		a1.start();
		System.out.println("b:"+a1.getState());
		
		try
		{
			Thread.sleep(1);
		} 
		catch (InterruptedException e)
		{
 			e.printStackTrace();
		}
		System.out.println("C:"+a1.getState());
		
		try
		{
			Thread.sleep(10000);
		} 
		catch (InterruptedException e)
		{
 			e.printStackTrace();
		}
		System.out.println("d:"+a1.getState());
	}

}
