package com.source.thread2;

class R extends Thread
{
 	public void run()
	{
 		for (int i = 0; i < 3000; i++)
 		{
 			System.out.println(i);
		}
	}
}

public class Manager19
{

	public static void main(String[] args)
	{
		R r1	=	new R();
		r1.setDaemon(true);	/*** Child is changed to daemon. It will not executed fully, when main thread terminate, then this tread also terminate ****/
		r1.start();
		System.out.println("Done");
	}

}
