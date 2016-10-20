package com.source.global.var;

public class Z_127
{
	static int i=test();		// Complier only checking the Return Type of the Method ("test()").
	static int j=10;
	static int test()
	{
		return j;
	}

	public static void main(String[] args)
	{
		System.out.println(i);
		System.out.println(j);
	}

}
