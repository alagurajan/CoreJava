package com.source.instance.var;

public class X_138
{
	int i;
	
	static void test(X_138 obj1, X_138 obj2)
	{
		int i=obj1.i;
		obj1.i=obj2.i;
		obj2.i=i;
	}

	public static void main(String[] args)
	{
		X_138	x1	=	new X_138(), x2	=	new X_138();
		x1.i=10;
		x2.i=20;
		test(x1,x2);
		System.out.println(x1.i);
		System.out.println(x2.i);
	}

}
