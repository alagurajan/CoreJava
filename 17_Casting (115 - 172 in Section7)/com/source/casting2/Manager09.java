package com.source.casting2;

public class Manager09
{
	static Object test1()
	{
		D d1	=	new D();
		return d1;
	}

	public static void main(String[] args)
	{
		Object obj	=	test1();
		System.out.println("Done");
	}

}
