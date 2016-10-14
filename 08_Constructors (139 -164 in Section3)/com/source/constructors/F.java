package com.source.constructors;

public class F
{
	int i;
	F(int k)
	{
		i=10;
		System.out.println("F(int)");
	}

	public static void main(String[] args)
	{
		//F f1 = new F();					//The constructor F() is undefined			(Uncomment this line & comment 15th Line)
		F f1 = new F(34);
		System.out.println("------");
		System.out.println(f1.i);
	}

}
