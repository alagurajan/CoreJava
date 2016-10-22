package com.source.exception2;

public class M
{

	public static void main(String[] args)
	{
		System.out.println(1);
		
		try
		{
			test();		/******		Caller of the test() should surround by try catch	*******/
		} 
		catch (ClassNotFoundException e)
		{
			System.out.println("ex");
		}
		
		System.out.println(2);
	}
	
	static void test() throws ClassNotFoundException		/******		Caller of the test() should surround by try catch	*******/
	{	
		System.out.println(3);
		Class.forName("");
		System.out.println(4);
	}

}
