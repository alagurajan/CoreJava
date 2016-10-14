package com.source.constructors;

public class R
{
	R()
	{
		System.out.println("R()");
	}
	
	R(int i)
	{
		System.out.println("R(int)");
		//this();							// Constructor call must be the first statement in a constructor (Uncomment this line)
	}

	public static void main(String[] args)
	{
		R r1 = new R();
		System.out.println("----------");
		R r2 = new R(20);
		System.out.println("----------");
	}

}
