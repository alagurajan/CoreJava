package com.source.arg.methods;

public class D_82
{
	static void test(int i)
	{
		System.out.println("from test:"+i);
	}

	public static void main(String[] args)
	{
		int m;
		test(m=10);
		System.out.println("done");
	}

}
