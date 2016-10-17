package com.source.interface2;

public class L extends K
{
 
	public void test1()
	{
		 System.out.println("from test1");
	}
 
	public void test3()
	{
		System.out.println("from test3");
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
