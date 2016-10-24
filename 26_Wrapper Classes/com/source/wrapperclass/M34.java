package com.source.wrapperclass;

public class M34
{
	static int test()
	{
		Integer obj	=	new Integer(20);
		return obj;		/*****   Unboxing(obj.intValue()) by complier (from JDK1.5 +)   *******/
	}

	public static void main(String[] args)
	{
		Integer o1	=	test();		/*****   Boxing(new Integer(20) by Complier (from JDK1.5 +)  *******/
		
		System.out.println("Done");
		
	}

}
