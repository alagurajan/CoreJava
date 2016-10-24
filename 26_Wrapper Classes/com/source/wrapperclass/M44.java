package com.source.wrapperclass;

public class M44
{
	static void test(String ...strings) 
	{
		for(String s1:strings)
		{
			System.out.print(s1+",");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		test();
		test("abc");
		test("hello","test");
		test("hello", "test", "xyz");
		test("abc","hello", "test", "xyz");
	}

}
