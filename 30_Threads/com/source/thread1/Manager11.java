package com.source.thread1;

class F extends Thread
{
 	public void run()
	{
 		for (int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
}

class G implements Runnable
{
 	public void run()
	{
 		for (int i = 1000; i < 2000; i++)
		{
			System.err.println(i);
		}
	}
}

public class Manager11
{

	public static void main(String[] args)
	{
		F	f1		=	new F();		/*****   a new Thread is created (i.e) accept registration + allocation    *******/
		f1.start();
		
		G g1		=	new G();
		Thread t1	=	new Thread(g1);
		t1.start();
		
		System.out.println("Done");
	}

}
