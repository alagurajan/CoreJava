package com.source.thread1;

class B extends Thread			/*****   B class contains every method of Thread   *******/
{
 	public void run()			/*****   Override run method  *******/
	{
 		for (int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
}
class C extends Thread
{
 	public void run()
	{
 		for (int i = 1000; i < 2000; i++)
		{
			System.out.println(i);
		}
	}
}
public class Manager08
{

	public static void main(String[] args)
	{
		B b1	=	new B();
		b1.start();
		
		C c1	=	new C();
		c1.start();
		
		for (int i = 2000; i < 3000; i++)
		{
			System.err.println(i);
		}
	}

}
