package com.source.object1;

public class Manager18
{

	public static void main(String[] args)
	{
		R r1	=	new R(90);
		R r2	=	new R(90);
		
		System.out.println(r1==r2);
		System.out.println(r1.i==r2.i);
		System.out.println(r1.equals(r2));
		
	}

}
