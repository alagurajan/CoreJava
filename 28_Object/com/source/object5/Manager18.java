package com.source.object5;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Manager18
{

	public static void main(String[] args) throws Exception
	{
		Object obj	=	getObject("com.source.object5.V",new String[]{"xyz","5060"});
		V v1		=	(V)obj;
		System.out.println(v1.getParam1());
		System.out.println(v1.getParam2());
	}
	
	private static Object getObject(String className, String[] args) throws Exception
	{
		Class c1			=	Class.forName(className);
		Object obj			=	c1.newInstance();
		Field[] fields		=	c1.getDeclaredFields();
		Method m1			=	null;
		String methodName;
		String fieldName;
		Object dataType;
		Field f1;
		
		for(int i=0; i<fields.length; i++)
		{
			f1			=	fields[i];
			fieldName	=	f1.getName();
			dataType	=	f1.getType();
			methodName	=	"set"+fieldName.substring(0, 1).toUpperCase()+fieldName.substring(1,fieldName.length());
			m1			=	c1.getDeclaredMethod(methodName, (Class)dataType);
			
			if(dataType.equals(String.class))
			{
				m1.invoke(obj, args[i]);
			}
			if(dataType.equals(int.class))
			{
				int j	=	Integer.parseInt(args[i]);
				m1.invoke(obj, j);
			}
		}
		
		return obj;
	}

}
