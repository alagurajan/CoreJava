package com.source.thread1;

class Thread1 extends Thread
{
 	public void run()
	{
 		for (int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
}


public class Manager06
{

	public static void main(String[] args)		/*****   main is Parent Thread   *******/
	{
		Thread1 t1	=	new Thread1();
		t1.start();								/*****  t1 is Child Thread   *******/
		
		for (int i = 1000; i < 2000; i++)
		{
			System.out.println(i);
		}

	}

}
