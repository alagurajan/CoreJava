package com.source.wrapperclass;

public class M27
{
	static void test(Integer obj)
	{
		System.out.println("done");
	}

	public static void main(String[] args)
	{
		test(10);
		test(new Integer(10));
	}

}
