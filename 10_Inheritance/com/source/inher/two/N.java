package com.source.inher.two;

class N extends M
{
	N()
	{
		System.out.println("N()");
	}
	{
		System.out.println("N-IIB1");
	}
	static
	{
		System.out.println("N-SIB");
	}
	N(int i)
	{
		super(i);
		System.out.println("N(int)");
	}
	{
		System.out.println("N-IIB2");
	}
}
