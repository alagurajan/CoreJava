package com.source.interface3;

public class J extends I implements H
{
 
	public void test2()
	{
		 System.out.println("from test2");
	}

	public static void main(String[] args)
	{
		J obj 	=	new J();
		obj.test1();
		obj.test2();
		System.out.println("Done");
	}

}
