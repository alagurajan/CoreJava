package com.source.casting2;

public class Manager23
{

	public static void main(String[] args)
	{
		A a1	=	new C();
		System.out.println("---------");
		B b1	=	(B)a1;
		System.out.println("---------");
		C c1	=	(C)a1;		
		System.out.println("---------");
	}

}
