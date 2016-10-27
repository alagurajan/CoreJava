package com.source.object3;

public class Manager05
{

	public static void main(String[] args)
	{
		E e1	=	new E();
		e1=null;				/*****   Object get abandoned   *******/
		
		System.gc();	//Runtime.getRuntime().gc();		/*****   Approaches to make a request to garbage collector  *******/
		System.out.println("Done");
	}

}
