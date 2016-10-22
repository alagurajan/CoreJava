package com.source.exception3;

public class F
{

	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println(1);
		if(true)
		{
			throw new ClassCastException();
		}
		System.out.println(2);
	}

}
