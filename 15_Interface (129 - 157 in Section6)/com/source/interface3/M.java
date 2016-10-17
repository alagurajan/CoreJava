package com.source.interface3;

public class M implements L
{
	
	public void test1()
	{
		System.out.println("from test1");
	}
	 
	public void test2()
	{
		System.out.println("from test2");
	}

	public static void main(String[] args)
	{
		M obj	=	new M();
		obj.test1();
		obj.test2();
		System.out.println("Done");
	}
}

interface K
{
	void test1();
}
interface L extends K
{
	void test2();
}