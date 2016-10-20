package com.source.inher.two;

public class Q
{
	static
	{
		System.out.println("Q-SIB");
	}

	public static void main(String[] args)
	{
		N n1	=	new N();
		System.out.println("-------");
		
		M m1	=	new M(20);
		System.out.println("-------");
		
		O o1	=	new O(80);
		System.out.println("-------");
	}

}
