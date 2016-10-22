package com.source.exception2;

public class L
{

	public static void main(String[] args)
	{
		System.out.println(1);
		test();
		System.out.println(2);
	}	
	
	static void test()
	{
		System.out.println(3);
		try
		{
			Class.forName("");
		} 
		catch (ClassNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println(4);
	}

}
