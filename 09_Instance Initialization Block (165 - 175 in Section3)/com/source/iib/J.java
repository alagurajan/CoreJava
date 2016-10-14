package com.source.iib;

public class J
{
	J()
	{
		System.out.println("J()");
	}
	
	{
		System.out.println("IIB");
	}
	
	J(int i)
	{
		this();
		System.out.println("J(int)");
	}
	
	static
	{
		System.out.println("SIB");
	}
	
	public static void main(String[] args)
	{
		J obj1	=	new J();
		System.out.println("---------");
		J obj2	=	new J(20);
		System.out.println("---------");
	}

}
