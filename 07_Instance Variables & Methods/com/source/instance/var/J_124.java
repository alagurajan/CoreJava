package com.source.instance.var;

public class J_124
{
	void test1()
	{
		System.out.println("from test1");
	}
	static void test2()
	{
		J_124 obj	=	new J_124();
		obj.test1();
		System.out.println("from test2");
	}
}
