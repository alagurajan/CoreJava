package com.source.constructors;

public class E
{
	int i;
	
	E(int k)
	{
		i=k;
		System.out.println("E(int)");
	}

	public static void main(String[] args)
	{
		E e1 = new E(9);
		System.out.println("---------");
		E e2 = new E(90);
		System.out.println("---------");
		E e3 = new E(900);
		System.out.println("---------");
		System.out.println(e1.i);
		System.out.println(e2.i);
		System.out.println(e3.i);
	}

}
