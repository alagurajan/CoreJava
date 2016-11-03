package com.source.thread2;

class Thread3 extends Thread
{
 	public void run()
	{
		ThreadUtil.sleep(5000);
		
		for (int i = 0; i < 5000; i++)
		{
			System.out.println(i);
		}
	}
}

public class Manager29
{

	public static void main(String[] args)
	{
		Thread3 t1	=	new Thread3();
		t1.start();
		ThreadUtil.sleep(5000);
		t1.interrupt();
		System.out.println("Done");
	}

}
