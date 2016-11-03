package com.source.thread1;

class D extends Thread
{
 	public void run()
	{
		for (int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
}

/*****   
 * Every child thread will be using a separate copy of the  run() method.
 ****/

public class Manager09
{

	public static void main(String[] args)
	{
		D d1	=	new D();
		d1.start();
		
		D d2	=	new D();
		d2.start();
		
		System.out.println("Done");

	}

}
