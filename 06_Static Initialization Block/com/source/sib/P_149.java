package com.source.sib;

public class P_149
{

	public static void main(String[] args)
	{
		System.out.println("-------------");
		Q.test1();
		Q.test1();
		Q.test1();
		System.out.println("-------------");
	}
	static
	{
		System.out.println("P-SIB");
	}

}

class Q
{
	static
	{
		System.out.println("Q-SIB");
	}
	static void test1()
	{
		System.out.println("from test1");
	}
}