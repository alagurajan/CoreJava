package com.source.thread2;

public class Manager14
{

	public static void main(String[] args)   /*****   main Thread always started by JVM   *******/
	{
		Thread t1	=	Thread.currentThread(); 
		System.out.println(t1.isDaemon());
		t1.setDaemon(true);					/*****   java.lang.IllegalThreadStateException.  we can't change started thread to daemon status   *******/
		System.out.println(t1.isDaemon());
	}

}
