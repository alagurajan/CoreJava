package com.source.wrapperclass;

public class M29
{
	static void test(int i)
	{
		System.out.println("Done");
	}

	public static void main(String[] args)
	{
		Integer	obj	=	new Integer(90);	/******	Boxing	*******/
		test(obj.intValue());				/******	Unboxing*******/
	}

}
