package com.source.exception1;

public class X
{

	public static void main(String[] args)
	{
		System.out.println(1);
		int i	=	Integer.parseInt("abc");
		System.out.println(2);
		
		try
		{
			System.out.println(3);
		} 
		catch (NullPointerException e)
		{
			System.out.println(4);
		}
		finally
		{
			System.out.println(5);
		}
		
		System.out.println(6);
	}

}
