package com.source.string2;

public class F
{

	public static void main(String[] args)
	{
		String s1	=	"abababab";
		
		int i		=	s1.indexOf('b');
		System.out.println(i);
		
		int j		=	s1.indexOf('a',3);
		System.out.println(j);
		
		int k		=	s1.lastIndexOf('b');
		System.out.println(k);
		
		int m		=	s1.lastIndexOf('a');
		System.out.println(m);
	}

}
