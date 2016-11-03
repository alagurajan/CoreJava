package com.source.thread2;

class J implements Runnable
{
 	public void run()
	{
		
	}
}

public class Manager08
{

	public static void main(String[] args)
	{
		J j1		=	new J();
		
		Thread	t1	=	new Thread(j1);
		Thread	t2	=	new Thread(j1, "abc");		/*****   Applying name when runnable is implement   *******/
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println("------------");
		
		t1.setName("thread1");
		t2.setName("thread2");
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println("------------");
		
	}

}
