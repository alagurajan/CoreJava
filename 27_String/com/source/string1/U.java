package com.source.string1;

public class U
{

	public static void main(String[] args)
	{
		String s1	=	"abc";			
		System.out.println(s1);
		s1.concat("xyz");			/***** Modified String object but not assigned    *******/
		
		System.out.println(s1);
	}

}
