package com.source.wrapperclass;

public class M49
{
	 
	static void test(Byte b) 
	{
		System.out.println("Byte");
	}
	
	static void test(Double d1) 
	{
		System.out.println("Double");
	}
	
	static void test(Number n1) 
	{
		System.out.println("Number");
	}
	
	static void test(Object obj) 
	{
		System.out.println("Object");
	}
	
	static void test(byte ...b) 
	{
		System.out.println("var-arg");
	}

	public static void main(String[] args)
	{
		byte b1	=	10;
		test(b1);			/*****   Auto boxing(new Byte(b1) by the compiler (no method with primitive signature)   *******/
 	}

}
