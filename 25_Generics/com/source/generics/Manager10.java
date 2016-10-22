package com.source.generics;

public class Manager10
{

	public static void main(String[] args)
	{
		N<String> n1 	= 	new N<String>();
		n1.test1("abc");
		String s1		=	n1.test2("xyz");
		
		N<Integer> n2 	= 	new N<Integer>();
		n2.test1(10);
		int i			=	n2.test2(100);
		
		System.out.println("Done");
	}

}
