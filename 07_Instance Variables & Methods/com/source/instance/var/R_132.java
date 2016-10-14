package com.source.instance.var;

public class R_132
{
	int i;
	
	static void test(R_132 obj)
	{
		obj.i=20;
	}
	
	public static void main(String[] args)
	{
		R_132	r1	=	new R_132();
		r1.i=10;
		System.out.println("A:"+r1.i);
		test(r1);
		System.out.println("B:"+r1.i);
	}

}
