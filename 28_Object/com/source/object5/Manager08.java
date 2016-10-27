package com.source.object5;

public class Manager08
{

	public static void main(String[] args) throws Exception
	{
		Class c1	=	Class.forName("com.source.object5.J");
		J obj1		=	(J)c1.newInstance();
		J obj2		=	(J)c1.newInstance();
		J obj3		=	(J)c1.newInstance();
		obj1.test();
		obj2.test();
		obj3.test();
	}

}
