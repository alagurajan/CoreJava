package com.source.exception2;

class Y
{
	void test2()
	{
		System.out.println(3);
		try
		{
			Z z1	=	new Z();
			z1.test3();
		} 
		catch (NumberFormatException e)
		{
			System.out.println("ex");
		}
		System.out.println(4);
	}
}
