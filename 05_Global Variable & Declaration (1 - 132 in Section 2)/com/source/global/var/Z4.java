package com.source.global.var;

public class Z_131
{
	static int i= test();
	static int test()
	{
		System.out.println("from test1");
		return 10;
	}

	public static void main(String[] args)
	{
		System.out.println(i);
		System.out.println(test());
	}

}
