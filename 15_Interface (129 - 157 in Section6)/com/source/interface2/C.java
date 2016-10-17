package com.source.interface2;

public class C implements A, B
{
 
	public void test2()
	{
		 System.out.println("from test2");
	}
	 
	public void test1()
	{
		 System.out.println("from test1");
	}

	public static void main(String[] args)
	{
		C c1	=	new C();
		c1.test1();
		c1.test2();
		System.out.println("done");
	}

}
