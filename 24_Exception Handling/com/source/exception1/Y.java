package com.source.exception1;

public class Y
{

	public static void main(String[] args)
	{
		System.out.println(1);
		
		try
		{
			System.out.println(1);
			int i=10/0;
			System.out.println(2);
			
		} 
		catch (ArithmeticException e)
		{
			System.out.println(3);
			int i=20/0;
			System.out.println(4);
		}
		finally
		{
			System.out.println(5);
		}
		
		System.out.println(6);

	}

}
