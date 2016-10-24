package com.source.wrapperclass;

public class M45
{
	static void test(int x, String ...y) 	/*****   first arg is mandatory, 2nd is optional   *******/
	{
		System.out.println(x);
		System.out.println(y.length);
	}

	public static void main(String[] args)
	{
		test(20);
		test(1,"abc");
		test(30,"xyz","hello");
		test(40,"done","check","hello");
	}

}
