package com.source.exception1;

public class M
{

	public static void main(String[] args)
	{
		try
		{
			int i=10;
			System.out.println(i);
		} 
		catch (ArithmeticException e)
		{
			//System.out.println(i);
			int j=20;
			System.out.println(j);
		}
		
		//System.out.println(i);
		//System.out.println(j);
	}

}
