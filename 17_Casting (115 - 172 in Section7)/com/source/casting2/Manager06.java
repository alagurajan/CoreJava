package com.source.casting2;

public class Manager06
{
	/**
	 * 
	 *  Examples for auto upcasting while creating object.
	 *  
	 **/
	
	public static void main(String[] args)
	{
		A a1		=	new C();
		System.out.println("--------------");
		Object o1	=	new D();
		System.out.println("--------------");
		B b1		=	new C();
		System.out.println("--------------");
		C c1		=	new D();
		System.out.println("--------------");
		B b2		=	new D();
		System.out.println("--------------");
		Object o2	=	new C();
		System.out.println("--------------");
		
		System.out.println("Done");
	}

}
