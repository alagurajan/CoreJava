package com.source.inher.two;

public class P
{
	static
	{
		System.out.println("P-SIB");
	}

	public static void main(String[] args)
	{
		O o1	=	new O();
		System.out.println("---------");
		
		M m1	=	new M();
		System.out.println("---------");
		
		N n1	=	new N();
		System.out.println("---------");
	}

}
