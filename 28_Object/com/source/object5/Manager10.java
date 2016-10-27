package com.source.object5;

public class Manager10
{

	public static void main(String[] args) throws Exception
	{
		Class c1	=	Class.forName("com.source.object5.L");
		
		L obj1		=	(L)c1.newInstance();
		System.out.println("----------");
		L obj2		=	(L)c1.newInstance();
		System.out.println("----------");
	}

}
