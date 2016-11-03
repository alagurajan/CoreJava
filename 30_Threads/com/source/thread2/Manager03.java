package com.source.thread2;

public class Manager03
{

	public static void main(String[] args)
	{
		Thread t1	=	Thread.currentThread();
		
		System.out.println("ID 	: "+t1.getId());
		System.out.println("Name 	: "+t1.getName());
		System.out.println("Priority: "+t1.getPriority());
		System.out.println("Daemons : "+t1.isDaemon());
		System.out.println("---------------------------");
	}

}
