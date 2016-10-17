package com.source.interface3;

public class D extends C implements A, B
{
 
	public void test2()
	{
		 System.out.println("from test2");
	}

	public void test1()
	{
		 System.out.println("from test1");
	}

	void test3()
	{
		 System.out.println("from test3");

	}

	public static void main(String[] args)
	{
		D obj	=	new D();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		System.out.println("Done");
	}

}
