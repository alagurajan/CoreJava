package com.source.exception1;

import java.util.Scanner;

public class U
{

	public static void main(String[] args)
	{
		Scanner	sc	=	new Scanner(System.in);
		System.out.println("Enter Something");
		
		String s1	=	sc.next();
		int i	=	test(s1);
		System.out.println(i);
		
	}
	
	static int test(String s1)
	{
		int i=0;
		
		try
		{
			i	=	Integer.parseInt(s1);
			return i;
		} 
		catch (NumberFormatException e)
		{
			return 0;
		}
		finally 
		{
			return 1000;
		}
		
		
	}

}
