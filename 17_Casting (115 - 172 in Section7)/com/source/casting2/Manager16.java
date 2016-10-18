package com.source.casting2;

public class Manager16
{
	/**
	 * 
	 * Complier will not do down casting. We need to do explicitly.
	 * 
	 * **/
	
	public static void main(String[] args)
	{		
		B b1	=	new D();
		System.out.println("------------");
		C c1	=	(C)b1;		
		System.out.println("Done");
	}

}
