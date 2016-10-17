package com.source.inher.two;

class O extends N
{
	O()
	{
		this(90);
		System.out.println("O()");
	}
	O(int i)
	{
		super(90);
		System.out.println("O(int)");
	}
	{
		System.out.println("O-IIB1");
	}
	static
	{
		System.out.println("O-SIB");
	}

}
