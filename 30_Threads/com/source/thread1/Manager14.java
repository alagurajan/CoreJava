package com.source.thread1;

class J extends Thread
{
 	public void run()
	{
 		for (int i = 0; i < 1000; i++)
		{
			System.err.println(i);
			if(i==6)
			{
				int j=10/0;				/*****   While exception happened child thread terminated  *******/			
				
				System.out.println("End of Child Thread");
			}
		}
	}
}

class K extends Thread
{
 	public void run()
	{
		for (int i = 1000; i < 2000; i++)
		{
			System.out.println(i);
		}
	}
}

public class Manager14
{
	/*****   Even though the exception happened in "J" Thread it won't affect "K" Thread as well as "Main" Thread   *******/
	
	public static void main(String[] args)
	{
		J j1	=	new J();
		j1.start();
		
		K k1	=	new K();
		k1.start();
		
		for (int i = 2000; i < 3000; i++)
		{
			System.out.println(i);
		}
	}

}
