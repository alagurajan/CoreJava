package com.source.exception2;

public class H
{

	public static void main(String[] args)
	{
		System.out.println(1);
		test();
		System.out.println(2);
	}
	
	static void test()
	{
		System.out.println(3);
		try
		{
			int i=10/0;
		} 
		catch (ArithmeticException e)
		{
			System.out.println(4);
		}
		System.out.println(5);
	}

}
