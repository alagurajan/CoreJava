package com.source.methods;

public class M_65
{
	static void test()
	{
		System.out.println("test begin");
		if(true)
		{
			System.out.println("from if");
			return;
		}
		System.out.println("test end");	// This line will not execute if you comment the 11th line, then it will execute
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}

}
