package com.source.sib;

public class W_155
{

	public static void main(String[] args)
	{
		System.out.println("from main:"+W.i);
		W.test();
	}

}
class W
{
	static int i;
	static void test()
	{
		System.out.println("from test:"+i);
	}
}
