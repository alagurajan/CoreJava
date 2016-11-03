package com.source.thread1;

public class Manager22
{

	public static void main(String[] args)
	{
		Thread t1	=	new Thread()		/*****   Anonymous inner class which is subclass to Thread class   *******/
							{
				 				public void run()
								{
				 					for (int i = 0; i < 1000; i++)
				 	 				{
				 	 					System.out.println(i);
				 	 				}
								}
							};
				t1.start();
				
				for (int i = 1000; i < 2000; i++)
 				{
 					System.out.println(i);
 				}
	}

}
