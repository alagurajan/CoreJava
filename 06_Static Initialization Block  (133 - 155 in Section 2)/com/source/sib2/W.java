package com.source.sib2;

public class W
{

	public static void main(String[] args)
	{
		System.out.println("from main:"+X.i);
		X.test();
	}

}
class X
{
	static int i;
	static void test()
	{
		System.out.println("from test:"+i);
	}
}
