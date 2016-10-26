package com.source.object2;

public class Manager06
{

	public static void main(String[] args)
	{
		L l1	=	new L(90);
		L l2	=	null;
		
		M m1	=	new M(l1,50);
		M m2	=	new M(l1,50);
		M m3	=	new M(l2,50);
		
		System.out.println(m1.equals(m2));
		System.out.println(m2.equals(m3));
		System.out.println(m3.equals(null));
		System.out.println(m1.equals(l1));
	}

}
