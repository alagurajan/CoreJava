package com.source.object5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Manager03
{

	public static void main(String[] args) throws Exception
	{
		D d1	=	new D(10);
		
		Class c1	=	d1.getClass();
		Field[] x	=	c1.getFields();
		
		for (Field f1 : x) {
			System.out.println(f1.getName()+":"+f1.getType());
		}
		
		System.out.println("-----------");
		
		Field[] y	=	c1.getDeclaredFields();
		
		for (Field f1 : y) {
			System.out.println(f1.getName()+":"+f1.getType());
		}
		
		System.out.println("-----------");
		
		Method[] z	=	c1.getMethods();
		
		for (Method m1 : z) {
			System.out.println(m1.getName()+":"+m1.getReturnType());
		}
		
		System.out.println("-----------");
		
		Method[] a	=	c1.getDeclaredMethods();
		
		for (Method m1 : a) {
			System.out.println(m1.getName()+":"+m1.getReturnType());
		}
		
		System.out.println("-----------");
		
		Constructor[] b	=	c1.getConstructors();
		
		for (Constructor con1 : b) {
			System.out.println(con1.getName());
		}
		
		System.out.println("-----------");
		
		Constructor[] c	=	c1.getDeclaredConstructors();
		
		for (Constructor con2 : c) {
			System.out.println(con2.getName());
		}
	}

}
