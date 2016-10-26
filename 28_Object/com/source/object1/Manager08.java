package com.source.object1;

public class Manager08
{

	public static void main(String[] args)
	{
		H h1	=	new H();
		h1.x=10;
		
		I i1	=	new I();
		i1.y=20;
		i1.h1=h1;
		
		System.out.println(h1);
		System.out.println(i1);
	}

}
