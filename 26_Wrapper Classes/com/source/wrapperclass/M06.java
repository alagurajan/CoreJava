package com.source.wrapperclass;

public class M06
{

	public static void main(String[] args)
	{
		String 	s1		=	"9.989";
		Double d1		=	new Double(s1);		/******	Boxing	*******/
		double d2		=	d1.doubleValue();	/******	Unboxing*******/
		System.out.println("Done");
	}

}
