package com.source.casting2;

public class Manager12
{

	public static void main(String[] args)
	{
		A a1	=	(A) new B();
		System.out.println("--------------");
		A a2	=	new B();
		System.out.println("--------------");
		C c1	=	new D();
		System.out.println("--------------");
		C c2	=	(C)new D();
		System.out.println("--------------");
		System.out.println("Done");
	}

}
