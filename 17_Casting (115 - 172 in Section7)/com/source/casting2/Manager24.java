package com.source.casting2;

public class Manager24
{

	public static void main(String[] args)
	{
		A a1	=	new B();
		System.out.println("---------");
		B b1	=	(B)a1;
		System.out.println("---------");
		C c1	=	(C)a1;						/** Object created for "B" so we can do downcast up to "B" only **/
		System.out.println("---------");
		

	}

}
