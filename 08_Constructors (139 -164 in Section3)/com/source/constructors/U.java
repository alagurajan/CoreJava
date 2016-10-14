package com.source.constructors;

public class U
{
	U()
	{
		this(10);
		System.out.println("U()");
	}
	U(int i)
	{
		//this();								//	Recursive constructor invocation U(int)  & Recursive constructor invocation U() (Uncomment this line)
		System.out.println("U(int)");
	}

	public static void main(String[] args)
	{
		U u1	=	new U();
		System.out.println("---------");
		U u2 	=	new U(10);
		System.out.println("---------");
	}

}
