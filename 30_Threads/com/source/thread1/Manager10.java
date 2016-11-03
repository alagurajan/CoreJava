package com.source.thread1;

class E implements Runnable
{
 	public void run()
	{
 		for (int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
}

/*****   
 * Both child thread will be using a separate copy of the same run() method.
 ****/

public class Manager10
{

	public static void main(String[] args)		/*****   Main Thread   *******/
	{
		E e1	=	new E();
		
		Thread t1	=	new Thread(e1);			/*****   Child Thread   *******/
		t1.start();
		
		Thread t2	=	new Thread(e1);			/*****   Child Thread   *******/
		t2.start();
		
		System.out.println("Done");

	}

}
