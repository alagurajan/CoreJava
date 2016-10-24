package com.source.wrapperclass;

public class M05
{

	public static void main(String[] args)
	{
		String s1	=	"10";
		Integer obj	=	new Integer(s1);	/******	Boxing	*******/
		int i= obj.intValue();				/******	Unboxing*******/
		System.out.println("Done");
	}

}
