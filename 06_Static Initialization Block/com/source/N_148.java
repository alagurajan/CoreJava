package com.source;

class N_148
{
	static
	{
		System.out.println("N-SIB");
	}
	
	public static void main(String[] args)
	{
		System.out.println("N-main begin");
		System.out.println(O.i);
		System.out.println(O.i);
		System.out.println(O.i);
		System.out.println("N-main end");
	}
	
}

class O
{
	static int i=10;
	static
	{
		System.out.println("O-SIB");
	}
}
