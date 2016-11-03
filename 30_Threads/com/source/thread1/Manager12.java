package com.source.thread1;

class H extends Thread
{
 	public void run()
	{
 		for (int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
}

public class Manager12
{

	public static void main(String[] args)
	{
		H h1	=	new H();
		h1.start();
		System.out.println("-------");
		
		h1.start();	 /*****   Same thread can't be start more than one time   *******/ //run time Exception: java.lang.IllegalThreadStateException
		
		/*****   main thread is terminated so below code after this line won't be execute, but child thread (h1) will be continue   *******/
		for (int i = 1000; i < 2000; i++)
		{
			System.err.println(i);
		}
		
		System.out.println("Done");
	}

}
