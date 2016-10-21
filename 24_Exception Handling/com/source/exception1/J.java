package com.source.exception1;

public class J
{

	public static void main(String[] args)
	{
		System.out.println(1);
		try
		{
			int i=10/0;
		} 
		catch (ArithmeticException e)
		{
			System.out.println(2);
			System.out.println(e);
			System.out.println(3);
		}
				
	}
	
}
