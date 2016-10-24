package com.source.wrapperclass;

public class M31
{
	static void test(Character obj)
	{
		System.out.println("Done");
	}

	public static void main(String[] args)
	{
		test('a');	/******	Should be boxed, but not required 	*******/
		char c1	=	't';
		test(c1);
		
		Character c2	=	'p';
		test(c2);
	}

}
