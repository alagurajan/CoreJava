package com.source.object5;

import java.lang.reflect.Method;

public class Manager13
{

	public static void main(String[] args) throws Exception
	{
		Class c1	=	Class.forName("com.source.object5.P");
		P p1		=	(P)c1.newInstance();
		p1.test();
		System.out.println("----------------");
		
		Object obj	=	c1.newInstance();
		P p2		=	(P)obj;
		p2.test();
		System.out.println("---------------");
		
		Object obj1	=	c1.newInstance();
		Method m1	=	c1.getDeclaredMethod("test");
		m1.invoke(obj1);
		
	}

}
