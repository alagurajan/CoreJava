package com.source.interface3;

public class Q implements P
{
	public void test1()
	{
		System.out.println("from test1");
	}

	public void test2()
	{
		System.out.println("from test2");
	}
 
	public void test3()
	{
		System.out.println("from test3");
	}
	public static void main(String[] args)
	{
		Q q1	=	new Q();
		q1.test1();
		q1.test2();
		q1.test3();
		System.out.println("Done");
	}

}

interface N
{
	void test1();
}

interface O
{
	void test2();
}

interface P extends N,O		// One interface can extends to any no of Interface But, Class can't 
{
	void test3();
}