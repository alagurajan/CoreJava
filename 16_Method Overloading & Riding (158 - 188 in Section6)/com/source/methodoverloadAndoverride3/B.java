package com.source.methodoverloadAndoverride3;

class B extends A
{
	void test3()
	{
		super.test1();	// Here "super." is optional why because, test1() is not overrided here
		super.test2();
		test1();
		test2();
	}
	
	void test2()
	{
		System.out.println("from B-test2");
	}
	
	public static void main(String[] args)
	{
		B b1	=	new B();
		b1.test3();
		System.out.println("Done");
	}
}
