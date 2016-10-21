package com.source.innerclass1;

public class I
{

	public static void main(String[] args)
	{
		class A
		{
			int i=10;
		}
		
		A a1	=	new A();
		System.out.println(a1.i);
		a1.i=20;
		System.out.println(a1.i);
	}

}
