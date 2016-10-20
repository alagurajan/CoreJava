package com.source.inher.one;

public class L
{

	L()
	{
		super();
		System.out.println("L()");
		//this(10);					//Constructor call must be the first statement in a constructor (Uncomment this line)
	}
	L(int i)
	{
		super();
		System.out.println("L(int)");
	}

	public static void main(String[] args)
	{
		L l1	=	new L();
		System.out.println("Done");
	}

}
