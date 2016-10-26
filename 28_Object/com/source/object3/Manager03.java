package com.source.object3;

public class Manager03
{

	public static void main(String[] args)
	{
		C c1	=	new C();
		c1.i=10;
		c1.j=20;
		c1.k=30;
		
		
		C c2	=	new C();
		c2.i=10;
		c2.j=25;
		c2.k=30;
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		
	}

}
