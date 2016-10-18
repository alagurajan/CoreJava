package com.source.polymorphism;

public class Manager03
{

	public static void main(String[] args)
	{
		E e1	=	new E();
		F f1	=	new F();
		G g1	=	new G();
		E e2	=	new G();
		E e3	=	new F();
		E[]	x	=	{e1,f1,g1,e2,e3};
		
		for(int i=0; i<x.length; i++)
			x[i].test();
	}

}
