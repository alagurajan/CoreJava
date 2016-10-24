package com.source.wrapperclass;

public class M41
{
	static void test() 
	{
		System.out.println("test()");
	}
	
	static void test(int ... argts) 	/*****   From JDK1.5 +   *******/
	{
		System.out.println("test(var-args)");
	}

	public static void main(String[] args)
	{
		test();
		test(10);
		test(10,20);
		test(10,20,30);
		test(10,20,30,40,50);
	}

}
