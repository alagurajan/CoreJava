package com.source.exception2;

public class K
{

	public static void main(String[] args)
	{
		System.out.println(1);
		
		try
		{
			Class.forName("");
		} 
		catch (ClassNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println(2);
	}

}
