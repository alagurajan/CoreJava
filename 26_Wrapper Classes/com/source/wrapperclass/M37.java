package com.source.wrapperclass;

public class M37
{

	static void test(int i) 
	{
		System.out.println("test(int)");
	}
	
	 
	public static void main(String[] args)
	{
		int i		=	20;
		Integer obj	=	new Integer(20);
		test(i);
		test(obj);	/*****   Unboxing (obj.intValue()) by the compiler  (from JDK1.5 +)  *******/
		
		 
	}

}
