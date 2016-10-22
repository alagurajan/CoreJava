package com.source.exception4;

public class A
{

	public static void main(String[] args)
	{
		System.out.println(1);
		assert false;			/******	to terminate flow *******/
		System.out.println(2);
	}

}
