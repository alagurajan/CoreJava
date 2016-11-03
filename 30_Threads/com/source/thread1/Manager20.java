package com.source.thread1;

public class Manager20
{

	public static void main(String[] args)
	{
		class A extends Thread		/*****   This local inner class is not executed by main Thread. It is just a class design *******/
		{
 			public void run()
			{
				for (int i = 0; i < 1000; i++)
				{
					System.out.println(i);
				}
			}
		}
		
		A a1	=	new A();
		a1.start();
		
		for (int i = 1000; i < 2000; i++)
		{
			System.out.println(i);
		}

	}

}
