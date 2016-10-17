package com.source.abstractone;

public class L extends K
{	
	void test2()
	{
		System.out.println("from test2");
	}

	public static void main(String[] args)
	{
		L obj	=	new L();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("Done");
	}

}
