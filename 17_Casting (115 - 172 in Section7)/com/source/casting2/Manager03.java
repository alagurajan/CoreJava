package com.source.casting2;

public class Manager03
{

	public static void main(String[] args)
	{
		Object obj1	=	null;
		Object obj2	=	null;
		obj1		=	obj2;
		
		A a1		=	null;
		A a2		=	null;
		a1			=	a2;
		
		B b1		=	null;
		B b2		=	null;
		b1			=	b2;
		
		C c1		=	null;
		C c2		=	null;
		c1			=	c2;
		
		D d1		=	null;
		D d2		=	null;
		d1			=	d2;
		d2			=	d1;
		
		obj1		=	new Object();
		a2			=	new A();
		c1			=	new C();
		d2			=	new D();
		b1			=	new B();
		
		System.out.println("Done");
	}

}
