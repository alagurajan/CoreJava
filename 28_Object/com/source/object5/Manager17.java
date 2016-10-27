package com.source.object5;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Manager17
{

	public static void main(String[] args) throws Exception
	{
		Scanner sc			=	new Scanner(System.in);
		System.out.println("Enter Class Name");
		String className	=	sc.next();
		System.out.println("Enter Method Name");
		String methodName	=	sc.next();
		
		Class c1			=	Class.forName("com.source.object5."+className);
		Method m1			=	c1.getDeclaredMethod(methodName);
		Object obj			=	c1.newInstance();
		m1.invoke(obj, null);
		System.out.println("done");
	}

}
