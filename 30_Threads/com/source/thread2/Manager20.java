package com.source.thread2;

class S extends Thread
{
 	public void run()
	{
 		for (int i = 0; i < 3000; i++)
 		{
 			System.out.println(i);
		}
	}
}

public class Manager20
{

	public static void main(String[] args)
	{
		S s1	=	new S();
		s1.start();
		
		try
		{
			s1.join();			/*****   Parent will execute after child thread execution got over   *******/
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Done");
	}

}
