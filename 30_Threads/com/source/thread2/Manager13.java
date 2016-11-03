package com.source.thread2;

public class Manager13
{

	public static void main(String[] args)
	{
		Thread t1	=	Thread.currentThread();
		System.out.println(t1.getPriority());
		
		t1.setPriority(11);						/*****   java.lang.IllegalArgumentException  priority should be between 0-10   *******/
		System.out.println(t1.getPriority());
	}

}
