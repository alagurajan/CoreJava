package com.source.thread2;

class Q extends Thread
{
 	public void run()
	{
 		for (int i = 0; i < 3000; i++)
 		{
 			System.out.println(i);
		}
	}
}

public class Manager18
{

	public static void main(String[] args)
	{
		Q q1	=	new Q();
		q1.start();
		System.out.println("Done");
	}

}
