package com.source.inher.two;

class M
{
	M()
	{
		System.out.println("M()");
	}
	{
		System.out.println("M-IIB1");
	}
	static
	{
		System.out.println("M-SIB");
	}
	M(int i)
	{
		this();
		System.out.println("M(int)");
	}

}
