package com.source.inher.one;

class M
{
	M(int i)
	{
		System.out.println("M(int)");
	}
	{
		System.out.println("M-IIB");
	}
	M(int i, int j)
	{
		this(i);
		System.out.println("M(int, int)");
	}
}
