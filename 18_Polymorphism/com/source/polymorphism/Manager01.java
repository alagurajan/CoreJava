package com.source.polymorphism;

public class Manager01
{

	public static void main(String[] args)
	{
		A a1	=	new A();
		B b1	=	new B();
		A[] x	=	{a1,b1};
		
		for(int i=0; i<x.length; i++)
			x[i].test();
	}

}
