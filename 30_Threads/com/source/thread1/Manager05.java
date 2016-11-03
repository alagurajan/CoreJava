package com.source.thread1;

class A
{
	void test() 
	{
		for (int i = 0; i < 1000; i++)
		{
			System.out.println(i);
		}
	}
}

public class Manager05
{

	public static void main(String[] args)
	{
		for (int i = 1000; i < 2000; i++)
		{
			System.out.println(i);
		}
		
		A a1	=	new A();
		a1.test();
		for (int i =3000; i < 4000; i++)
		{
			System.out.println(i);
		}

	}

}


/*****   
 *   Sequential flow one after that other.
 *  
 *   Entire program is executed by main Thread.
 *    
 */