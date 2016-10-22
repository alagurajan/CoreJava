package com.source.exception4;

public class R
{

	public static void main(String[] args)
	{
		System.out.println("main begin");
		assert false;
		Q q1	=	new Q();
		q1.test1();
		System.out.println("main end");
	}

}
