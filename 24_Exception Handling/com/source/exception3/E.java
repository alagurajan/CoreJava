package com.source.exception3;

public class E
{

	public static void main(String[] args)
	{
		System.out.println(1);
		if(true)
		{
			throw new OutOfMemoryError("Some Error Message");
		}
		System.out.println(2);
	}

}
