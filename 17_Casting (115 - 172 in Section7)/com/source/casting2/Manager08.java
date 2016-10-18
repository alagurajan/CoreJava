package com.source.casting2;

public class Manager08
{
	static void test(A a1)
	{
		System.out.println("from test");
	}

	public static void main(String[] args)
	{
		test(new B());
		System.out.println("-------------");
		test(new C());
		System.out.println("-------------");
		test(new D());
		System.out.println("-------------");
		
		B b1	=	new B();
		System.out.println("-------------");
		test(b1);
		System.out.println("-------------");
		
		D d1	=	new D();
		System.out.println("-------------");
		test(d1);
		System.out.println("-------------");
		System.out.println("Done");
	}

}
