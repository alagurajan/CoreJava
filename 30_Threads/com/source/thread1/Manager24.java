package com.source.thread1;

public class Manager24
{

	public static void main(String[] args)
	{
		new Thread()
		{
			public void run() 
			{
				for (int i = 0; i < 1000; i++)
 				{
 					System.out.println(i);
 				}
			}
			
		}.start();

		for (int i = 2000; i < 3000; i++)
		{
			System.out.println(i);
		}
	}

}
