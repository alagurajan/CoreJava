package com.source.polymorphism;

public class Manager04
{
	/**
	 * 
	 * Static members can't be inherit
	 * 
	 * **/
	public static void main(String[] args)
	{
		H h1	=	new H();
		I i1	=	new I();
		
		H[] x	=	{h1,i1};
		
		x[0].test();
		x[1].test();

	}

}
