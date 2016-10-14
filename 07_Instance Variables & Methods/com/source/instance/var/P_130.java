package com.source.instance.var;

public class P_130
{
	int i;
	
	static void test(P_130 obj)					// Call by reference
	{
		System.out.println("test:"+obj.i);
	}
	
	public static void main(String[] args)
	{
		P_130 p1	=	new P_130();
		System.out.println("main:"+p1.i);
		p1.i=30;
		test(p1);
	}

}
