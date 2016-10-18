package com.source.casting2;

public class Manager15
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
		//C c1	=	b1;		//Type mismatch: cannot convert from A to B		(Uncomment this line )
		System.out.println("Done");
 	}

}
