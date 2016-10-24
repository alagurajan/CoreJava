package com.source.wrapperclass;

public class M43
{
	static void test(int ...is) 
	{
		System.out.println("var args");
	}

	public static void main(String[] args)
	{
		test();
		test(20,40,70);
		test(90,20,10,60,50);
	}

}
