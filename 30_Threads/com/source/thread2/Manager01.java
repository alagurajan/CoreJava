package com.source.thread2;

class A extends Thread
{
 	public void run()
	{
 		System.out.println("Done");
	}
}

public class Manager01
{

	public static void main(String[] args)
	{
		A a1	=	new A();
		
		System.out.println("Default Properties");
		long id					=	a1.getId();
		String name				=	a1.getName();
		int priority			=	a1.getPriority();
		boolean daemonsStatus	=	a1.isDaemon();
		
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Priority :"+priority);
		System.out.println("Daemons :"+daemonsStatus);
		
		a1.start();
	}

}
