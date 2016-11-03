package com.source.thread1;

public class Manager21
{

	public static void main(String[] args)
	{
		class A implements Runnable		/*****   This local inner class is not executed by main Thread. It is just a class design *******/
		{
 			public void run()
			{
 				for (int i = 0; i < 1000; i++)
 				{
 					System.out.println(i);
 				}
			}
		}
		
		A a1		=	new A();
		Thread t1	=	new Thread(a1);
		t1.start();
		
		for (int i = 2000; i < 3000; i++)
		{
			System.out.println(i);
		}
	}

}
