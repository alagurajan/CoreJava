package com.source.thread2;

class V extends Thread
{
 	public void run()
	{
 		for (int i = 0; i < 20; i++)
		{
			System.out.println(i);
			
			try
			{
				sleep(1000);
			} 
			catch (InterruptedException e)
			{
 				e.printStackTrace();
			}
		}
	}
}

public class Manager23
{

	public static void main(String[] args)
	{
		V v1	=	new V();
		v1.start();
		
		for (int i = 0; i < 30; i++)
		{
			System.out.println(i);
			
			try
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
 				e.printStackTrace();
			}
		}
	}

}
