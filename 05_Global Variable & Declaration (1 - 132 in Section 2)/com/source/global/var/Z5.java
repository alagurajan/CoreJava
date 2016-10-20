package com.source.global.var;

public class Z5
{
	static int i= test();
	static int test()
	{
		System.out.println("from test1");
		main(null);
		return 10;
	}
	
	public static void main(String[] args)
	{
		System.out.println("from main");
		System.out.println(i);
	}

}
