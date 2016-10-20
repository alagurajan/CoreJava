package com.source.global.var;

public class N
{
	static int i=10;

	public static void main(String[] args)
	{
		int i=20;
		System.out.println(i);
		System.out.println(N.i);  // If we want use Global variable
	}

}
