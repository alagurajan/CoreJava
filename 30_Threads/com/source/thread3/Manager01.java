package com.source.thread3;

class A			/*****   Object of "A" is showing data with "B" thread & "C" thread   *******/
{
	synchronized void test1()
	{
		for (int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
	synchronized void test2()
	{
		for (int i = 1000; i < 2000; i++)
		{
			System.err.println(i);
		}
	}
	
}

class B extends Thread
{
	A a1;
	B(A a1)
	{
		this.a1=a1;
	}
 	public void run()
	{
		a1.test1();
	}
}

class C extends Thread		/*****   If both the thread are using same Object then one thread will execute fully then only the other will execute  *******/
{
	A a1;
	C(A a1)
	{
		this.a1=a1;
	}
 	public void run()
	{
		a1.test2();
	}
}

public class Manager01		/*****   For non-static members synchronization should be Object wise not Method wise   *******/
{

	public static void main(String[] args)
	{
		A a1	=	new A();
		B b1	=	new B(a1);
		C c1	=	new C(a1);
		b1.start();
		c1.start();
	}

}
