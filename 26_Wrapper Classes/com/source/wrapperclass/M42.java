package com.source.wrapperclass;

public class M42
{
	static void test(String ...stringsVariables) 
	{
		System.out.println("var args");
	}

	public static void main(String[] args)
	{
		test();
		test("abc");
		test("msg1", "msg2", "msg3");
	}

}
