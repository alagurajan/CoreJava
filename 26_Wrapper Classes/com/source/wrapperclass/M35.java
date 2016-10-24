package com.source.wrapperclass;

public class M35
{
	static void test(int i) 
	{
		System.out.println("test(int)");
	}
	
	static void test(Integer obj) 	/*****   Method overloading   *******/
	{
		System.out.println("test(Integer)");
	}

	public static void main(String[] args)
	{
		int i		=	20;
		Integer obj	=	new Integer(20);
		test(i);
		test(obj);
		
		/*****   There is no boxing & unboxing required here   *******/
		
	}

}
