package com.source.casting2;

public class Manager17
{

	public static void main(String[] args)
	{
		A a1	=	new D();
		System.out.println("------------");
		B b1	= 	(B)a1;
		System.out.println("------------");
		C c1	=	(C)b1;
		System.out.println("------------");
		D d1	=	(D)a1;
		System.out.println("------------");
		System.out.println("Done");
	}

}
