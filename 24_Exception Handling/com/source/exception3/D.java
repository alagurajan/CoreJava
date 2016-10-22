package com.source.exception3;

public class D
{

	public static void main(String[] args)
	{
		System.out.println(1);
		if(true)
		{
			throw new NumberFormatException("Some Message");
		}
		System.out.println(2);
	}

}
