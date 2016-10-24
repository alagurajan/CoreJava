package com.source.wrapperclass;

public class M39
{
	static void test(Byte b) 	/*****   Argument is wrapper class so, compiler prefer the other(int) method by auto widening   *******/
	{
		System.out.println("test(Byte)");
	}
	
	static void test(int i)  
	{
		System.out.println("test(int)");
	}

	public static void main(String[] args)
	{
		byte i	=	10;
		test(i);		/*****   Auto widening   *******/	
	}

}
