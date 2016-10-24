package com.source.wrapperclass;

public class M04
{

	public static void main(String[] args)
	{
		boolean b1	=	false;
		
		/******	Boxing	*******/
		Boolean b2	=	new Boolean(b1);
		Boolean b3	=	new Boolean(true);
		
		/******	Unboxing*******/
		boolean b4	=	b2.booleanValue();
		boolean b5	=	b3.booleanValue();
		
		System.out.println("Done");
	}

}
