package com.source.arg.methods;

public class A
{
	static void test(int i)
	{
		System.out.println("from test");
		System.out.println(i);
	}

	public static void main(String[] args)
	{
		System.out.println("main begin");
		//test();								//The method test(int) in the type A_79 is not applicable for the arguments () Uncomment this line
		System.out.println("main end");
	}

}
