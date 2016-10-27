package com.source.object5;

import java.lang.annotation.Annotation;

public class Manager04
{

	public static void main(String[] args) throws Exception
	{
		F f1	=	new F();
		
		Class c1	=	f1.getClass();
		Annotation[] x	=	c1.getDeclaredAnnotations();
		
		for (Annotation a1 : x) {
			System.out.println(a1);
		}
	}

}
