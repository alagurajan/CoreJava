package com.source.polymorphism;

public class Manager02
{
	static void method1(C c1)
	{
		c1.test();
	}

	public static void main(String[] args)
	{
		C c1	=	new C();
		C c2	=	new D();
		method1(c1);
		method1(c2);
	}

}
