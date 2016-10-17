package com.source.interface2;

public class Z1 extends Z implements X, Y
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
		Z1 obj	=	new Z1();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("Done");
	}

}
