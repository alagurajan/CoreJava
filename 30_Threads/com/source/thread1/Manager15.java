package com.source.thread1;

class L extends Thread
{
 	public void run()
	{
 		//this.setName("L Thread");
		 System.out.println("begin");
		 start();							/*****   java.lang.IllegalThreadStateException   *******/
		 
		 System.out.println("end");
	}
}

public class Manager15
{

	public static void main(String[] args)
	{
		L obj	=	new L();
		obj.start();
		
		for (int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}

}
