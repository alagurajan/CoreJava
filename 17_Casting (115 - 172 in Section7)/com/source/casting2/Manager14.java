package com.source.casting2;

public class Manager14
{
	/**
	 * 
	 * Complier will not do down casting. We need to do explicitly.
	 * 
	 * **/

	public static void main(String[] args)
	{
		A a1	=	new B();
		System.out.println("------------");
		B b1	=	(B)a1;
		System.out.println("------------");
		System.out.println("Done");
	}

}
