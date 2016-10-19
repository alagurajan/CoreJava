package com.source.polymorphism;

public class U
{

	public static void main(String[] args)
	{
		System.out.println("U-main begin");
		T.main(args);
		System.out.println("U-main end");
	}
	
	static
	{
		System.out.println("U-SIB");
	}

}
