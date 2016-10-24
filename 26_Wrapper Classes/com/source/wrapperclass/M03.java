package com.source.wrapperclass;

public class M03
{

	public static void main(String[] args)
	{
		char c1			=	'a';
		Character	c2	=	new Character(c1);		/******	Boxing	*******/
		char c3			=	c2.charValue();			/******	Unboxing*******/
		
		System.out.println("Done");
	}

}
