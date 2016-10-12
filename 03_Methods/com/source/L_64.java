package com.source;

public class L_64
{
	static void test()
	{
		System.out.println("from test begin");
		System.out.println("from test end");
		return;			// If method type is void then return type is Optional 
	}
	
	public static void main(String[] args)
	{
		test();
		System.out.println("-------");
		test();
	}

}
