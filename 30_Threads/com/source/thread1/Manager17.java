package com.source.thread1;

class N extends Thread
{
	N()
	{
		start();
	}
	
 	public void run()
	{
		for (int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
}

public class Manager17
{

	public static void main(String[] args)
	{
		N n1	=	new N();
		n1.start();				/*****   java.lang.IllegalThreadStateException  start() should be used only once   *******/
		
		for (int i = 1000; i < 2000; i++)
		{
			System.out.println(i);
		}
	}

}
