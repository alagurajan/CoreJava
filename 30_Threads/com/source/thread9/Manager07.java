package com.source.thread9;

class G extends Thread
{
 	public void run()
	{
 		System.out.println("begin");
 		
 		try
		{
			Thread.sleep(10000);
		}
 		catch (InterruptedException e)
		{
 			e.printStackTrace();
		}
 		System.out.println("end");
	}
}

public class Manager07
{

	public static void main(String[] args)
	{
		G g1	=	new G();
 		g1.start();
 		try
		{
			Thread.sleep(15000);
		}
 		catch (InterruptedException e)
		{
 			e.printStackTrace();
		}
 		g1.stop();
		try
		{
			Thread.sleep(1000);
		}
 		catch (InterruptedException e)
		{
 			e.printStackTrace();
		}
		System.out.println(g1.getState());
	}

}
