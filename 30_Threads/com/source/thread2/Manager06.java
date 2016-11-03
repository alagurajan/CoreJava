package com.source.thread2;

class H extends Thread
{
	
}

public class Manager06
{

	public static void main(String[] args)
	{
		H h1	=	new H();
		H h2	=	new H();
		System.out.println(h1.getName());
		System.out.println(h2.getName());
		System.out.println(Thread.currentThread().getName());
		
		h1.setName("abc");
		h2.setName("xyz");
		Thread.currentThread().setName("Intiator");
		
		System.out.println(h1.getName());
		System.out.println(h2.getName());
		System.out.println(Thread.currentThread().getName());
	}

}
