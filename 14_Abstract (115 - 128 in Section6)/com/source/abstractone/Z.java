package com.source.abstractone;

public class Z extends Y
{
	Z()
	{
		System.out.println("Z()");
	}
	void test1()
	{
		System.out.println("from test1");
	}

	public static void main(String[] args)
	{
		Z obj	=	new Z();
		System.out.println("----------");
		obj.test1();
	}

}
