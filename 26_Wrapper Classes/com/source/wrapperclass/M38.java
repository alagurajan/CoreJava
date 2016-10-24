package com.source.wrapperclass;

public class M38
{
	static void test(double d1) 
	{
		System.out.println("test(double)");
	}
	
	static void test(Integer obj)  
	{
		System.out.println("test(Integer)");
	}

	public static void main(String[] args)
	{
		byte i	=	10;
		test(i);		/*****   Auto widening   *******/	
	}

}
