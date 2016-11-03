package com.source.thread1;

class I extends Thread
{
	 
	public void run()
	{
		for (int i = 0; i < 10; i++)
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

public class Manager13
{

	public static void main(String[] args)
	{
		I obj	=	new I();
		obj.start();
		
		/*****   Even though the exception happened in child thread this main thread will continue the execution    *******/
		for (int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}

}
