package com.source.global.var;

public class O
{
	static int i;
	
	public static void main(String[] args)
	{
		System.out.println(O.i);
		O.i=10;							// Advisable to use ClassName along with Global variable
		System.out.println(O.i);
	}

}
