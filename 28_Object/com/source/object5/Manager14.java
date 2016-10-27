package com.source.object5;

import java.lang.reflect.Method;

public class Manager14
{

	public static void main(String[] args) throws Exception
	{
		Class c1	=	Class.forName("com.source.object5.Q");
		Object obj	=	c1.newInstance();
		Method m1	=	c1.getDeclaredMethod("test");
		m1.invoke(obj);
		System.out.println("done");
	}

}
