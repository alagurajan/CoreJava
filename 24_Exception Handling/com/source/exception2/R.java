package com.source.exception2;

public class R
{
	R() throws ClassNotFoundException
	{
		
	}

	public static void main(String[] args)
	{
		try
		{
			R r1 = new R();
		} 
		catch (ClassNotFoundException e)
		{
			
		}
	}
	
	static void test() throws ClassNotFoundException
	{
		R r1 = new R();
	}

}
