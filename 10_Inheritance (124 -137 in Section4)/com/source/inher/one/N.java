package com.source.inher.one;

public class N extends M
{

	N()
	{
		super(10,20);
		System.out.println("N()");
	}
	{
		System.out.println("N-IIB");
	}
	N(int i)
	{
		this();
		System.out.println("N(int)");
	}

	N(double j)
	{
		super(10);
		System.out.println("N(double)");
	}

	public static void main(String[] args)
	{
		M m1	=	new M(10);
		System.out.println("---------");
		M m2	=	new M(20,4);
		System.out.println("---------");
		N n1	=	new N();
		System.out.println("---------");
		N n2	=	new N(10);
		System.out.println("---------");
		N n3	=	new N(1.0);
		System.out.println("---------");
	}

}
