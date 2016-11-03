package com.source.thread2;

class O extends Thread
{
 	public void run()
	{
 		for (int i = 0; i < 3000; i++)
 		{
 			System.out.println(i);
		}
	}
}

public class Manager16
{

	public static void main(String[] args)
	{
		O obj1	=	new O();
		obj1.setDaemon(true);			/*****   Terminate when main thread finish its execution  (need to change before start the thread)   *******/
		obj1.start();
		System.out.println(obj1.isDaemon());
		System.out.println("Done");	
	}

}
