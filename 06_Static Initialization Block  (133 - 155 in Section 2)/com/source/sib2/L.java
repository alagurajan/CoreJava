package com.source.sib;

public class L_147
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
		L_147.main(args);
		System.out.println("M-main end");
	}
}
