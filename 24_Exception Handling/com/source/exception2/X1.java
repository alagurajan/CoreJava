package com.source.exception2;

public class X1
{

	public static void main(String[] args)
	{
		try
		{
			int i=10/0;
		}
		catch (Throwable t)
		{
			System.out.println(1);
		}
		/******	Every error can be handled by one catch, then other catches will be unreachable	*******/
		/******	Uncomment the below commented block	*******/
		/*
		catch (Exception t)
		{
			System.out.println(2);
		}
		catch (RuntimeException e)
		{
			System.out.println(3);
		}
		catch (ArithmeticException e)
		{
			System.out.println(4);
		}
		*/
		
		System.out.println("Done");
	}

}
