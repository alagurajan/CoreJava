package com.source.object2;

public class Manager05
{

	public static void main(String[] args)
	{
		J j1	=	new J(90);
		K k1	=	new K(j1,30);
		K k2	=	new K(j1,30);
 		
		System.out.println(k1.equals(k2));
 		System.out.println("-----");
		
		K k4	=	new K(null,30);
		//System.out.println(k1.equals(k4));
	}

}
