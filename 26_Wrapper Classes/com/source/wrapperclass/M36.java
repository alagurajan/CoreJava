package com.source.wrapperclass;

public class M36
{
	 
	static void test(Integer obj)  
	{
		System.out.println("test(Integer)");
	}

	public static void main(String[] args)
	{
		int i		=	20;
		Integer obj	=	new Integer(20);
		test(i);	/*****   Boxing (new Integer(20)) by the compiler  (from JDK1.5 +)  *******/
		test(obj);
		
		 
		
	}

}
