package com.source.casting2;

public class Manager13
{
	/**
	 * 
	 * Complier will not do down casting. We need to do explicitly.
	 * 
	 * **/

	public static void main(String[] args)
	{
		A a1	=	new B();
		//B b1	=	a1;	//Type mismatch: cannot convert from A to B		(Uncomment this line )
		System.out.println("Done");
 	}

}
