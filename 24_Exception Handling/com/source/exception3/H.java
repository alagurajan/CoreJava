package com.source.exception3;

import java.util.Scanner;

public class H
{

	public static void main(String[] args)
	{
		Scanner sc	=	new Scanner(System.in);
		System.out.println(1);
		System.out.println("Enter age");
		int age	=	sc.nextInt();
		if(age<=0)
		{
			throw new ArithmeticException("Age should be +ve");
		}
		System.out.println(2);
	}

}
