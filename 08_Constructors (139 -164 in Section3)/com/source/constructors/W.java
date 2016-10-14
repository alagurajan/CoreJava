package com.source.constructors;

public class W
{
	static
	{
		System.out.println("SIB");				/* Static Initialization block executed only once (While class load)*/
	}
	
	W()
	{
		System.out.println("W()");
	}

	public static void main(String[] args)
	{
		W w1	=	new W();
		System.out.println("---------");
		W w2	=	new W();
		System.out.println("---------");
	}

}
