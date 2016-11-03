package com.source.thread2;

class F extends Thread
{
 	public void run()
	{
		 Util.getProperties();
	}
}

public class Manager04
{

	public static void main(String[] args)
	{
		Util.getProperties();
		F f1	=	new F();
		f1.start();
	}

}

class Util
{
	static void getProperties()
	{
		Thread t1	=	Thread.currentThread();
		System.out.println("ID 	: "+t1.getId());
		System.out.println("Name 	: "+t1.getName());
		System.out.println("Priority: "+t1.getPriority());
		System.out.println("Daemons : "+t1.isDaemon());
		System.out.println("---------------------------");
	}
}