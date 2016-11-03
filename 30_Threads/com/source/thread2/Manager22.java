package com.source.thread2;

public class Manager22
{

	public static void main(String[] args)
	{
		for (int i = 0; i < 20; i++)
		{
			System.out.println(i);
			
			try
			{
				Thread.sleep(1000);		/*****   For every iteration of the for loop thread is sleeping for one second (millisecond)   *******/
			} 
			catch (InterruptedException e)
			{
 				e.printStackTrace();
			}
		}
	}

}
