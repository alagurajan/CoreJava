package com.source.thread2;

class N extends Thread
{
 	public void run()
	{ 
 		for (int i = 0; i < 3000; i++)
 		{
 			System.out.println(i);
		}
	}
}

public class Manager15
{

	public static void main(String[] args)
	{
		N n1	=	new N();			/*****   Child thread continuous to execute all 3000 iteration because  
											it is a user thread, so it's doesn't terminate even if main thread leave   *******/
		n1.start();
		System.out.println(n1.isDaemon());
		System.out.println("Done");
	}

}
