package com.source.casting2;

public class Manager22
{

	public static void main(String[] args)
	{
		A a1	=	new B();					/** Object created for "B" so we can do downcast **/
		B b1	=	(B)a1;					
		System.out.println("----------");
		
		A a2	=	new A();					/** Object created for "A" so we can't do downcast **/
		B b2	=	(B)a2;
		System.out.println("----------");
	}

}
