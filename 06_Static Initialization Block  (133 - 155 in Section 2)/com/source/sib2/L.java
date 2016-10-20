package com.source.sib2;

public class L
{
	static 
	{
		System.out.println("L-SIB");
	}

	public static void main(String[] args)
	{
		System.out.println("L-main");
	}

}
class M
{
	static
	{
		System.out.println("M-SIB");
	}
	public static void main(String[] args)
	{
		System.out.println("M-main begin");
		L.main(args);
		System.out.println("M-main end");
	}
}
