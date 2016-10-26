package com.source.object2;

public class Manager04
{

	public static void main(String[] args)
	{
		H h1	=	new H(90);
		H h2	=	new H(90);
		
		I obj1	=	new I(100);
		I obj2	=	new I(100);
		
		System.out.println(h1.equals(h2));
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(h2));
		System.out.println(h1.equals(obj2));
	}

}
