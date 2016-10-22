package com.source.exception2;

public class Y1
{

	public static void main(String[] args)
	{
		try
		{
			int i=10/0;
		}
		catch (ArithmeticException e)
		{
			System.out.println(4);
		}
		catch (RuntimeException e)
		{
			System.out.println(3);
		}		
		catch (Exception t)
		{
			System.out.println(2);
		}		
		catch (Throwable t)
		{
			System.out.println(1);
		}
		
		System.out.println("Done");

	}

}
