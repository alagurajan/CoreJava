package com.source.casting2;

public class Manager26
{

	public static void main(String[] args)
	{
		A a1	=	new B();	/*** Auto upcasting ***/
		B b1	=	(B)a1;
		System.out.println("-------------");
		
		A a2	=	new A();	/*** No casting at all***/
		B b2	=	(B)a2;
	}

}
