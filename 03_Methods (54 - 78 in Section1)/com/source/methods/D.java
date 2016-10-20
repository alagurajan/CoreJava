package com.source.methods;

public class D
{
	static void test()
	{
		System.out.println("from test");
	}
	
	public static void main(String[] args)
	{
		System.out.println("from main");
		test();
		System.out.println("end main");
	}

}
