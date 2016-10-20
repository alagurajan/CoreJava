package com.source.instance.var;

public class P
{
	int i;
	
	static void test(P obj)					// Call by reference
	{
		System.out.println("test:"+obj.i);
	}
	
	public static void main(String[] args)
	{
		P p1	=	new P();
		System.out.println("main:"+p1.i);
		p1.i=30;
		test(p1);
	}

}
