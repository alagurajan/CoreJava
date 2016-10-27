package com.source.object5;

public class Manager09
{

	public static void main(String[] args) throws Exception
	{
		Class c1	=	Class.forName("com.source.object5.K");
		
		K k1		=	(K)c1.newInstance();
		System.out.println("-------");
		K k2		=	(K)c1.newInstance();
		System.out.println("-------");
		k1.test();
		k2.test();
	}

}
