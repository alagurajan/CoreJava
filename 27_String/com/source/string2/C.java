package com.source.string2;

public class C
{

	public static void main(String[] args)
	{
		String s1	=	"abcabcabc";
		
		int i		=	s1.indexOf('a');
		System.out.println(i);
		
		int j		=	s1.indexOf('a', 4);			/*****   search will start from 4th character   *******/
		System.out.println(j);
		
		int k		=	s1.indexOf('c');
		System.out.println(k);
		
		int m		=	s1.indexOf('c',6);			/*****   search will start from 6th character   *******/
		System.out.println(m);
	}

}
