package com.source.object5;

import java.lang.reflect.Method;

public class Manager15
{

	public static void main(String[] args) throws Exception
	{
		Class c1	=	Class.forName("com.source.object5.R");
		Object obj	=	c1.newInstance();
		Method m1	=	c1.getDeclaredMethod("test1");
		m1.invoke(obj);
		System.out.println("-------------");
		Method m2	=	c1.getDeclaredMethod("test1", int.class);
		m2.invoke(obj, 10);
		System.out.println("-------------");
		
	}

}
