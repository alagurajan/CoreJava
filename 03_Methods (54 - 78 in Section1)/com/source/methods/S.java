package com.source.methods;

public class S
{
	static int test()
	{
		System.out.println("from test");
		return 20;
	}
	
	public static void main(String[] args)
	{
		System.out.println("main begin");
		int i= test();
		System.out.println(i);
		System.out.println("main end");
	}

}
