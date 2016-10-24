package com.source.string3;

public class C
{

	public static void main(String[] args)
	{
		String s1	=	"java";
		String s2	=	"ja";
		String s3	=	s2.concat("va");		/*****   New String object has been created   *******/
		
		System.out.println(s1==s3);
		 
	}

}
