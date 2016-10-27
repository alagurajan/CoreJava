package com.source.object5;

import java.lang.reflect.Method;

public class Manager16
{

	public static void main(String[] args) throws Exception
	{
		Class c1	=	Class.forName("com.source.object5.S");
		Object obj	=	c1.newInstance();
		
		Method m1 	=	c1.getDeclaredMethod("test", String.class);
		int i		=   (Integer)m1.invoke(obj, "abc");
		System.out.println(i);
	}

}
