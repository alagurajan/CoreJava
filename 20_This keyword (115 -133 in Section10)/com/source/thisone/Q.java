package com.source.thisone;

		/*****   Singleton Design pattern   *******/

class Q
{
	private static Q obj	=	null;
	
	static
	{
		obj=new Q();
	}
	
	private Q()
	{
		System.out.println("Q()");
	}
	
	public static Q getObject()
	{
		return obj;
	}

}
