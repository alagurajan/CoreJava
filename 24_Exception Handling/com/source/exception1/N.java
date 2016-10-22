package com.source.exception1;

public class N
{

	public static void main(String[] args)
	{
		int i=0;
		
		try
		{
			System.out.println(i);
		} 
		catch (ArithmeticException e)
		{
			System.out.println(i);
		}
		
		System.out.println(i);
	}

}
