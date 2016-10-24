package com.source.string2;

public class Y
{

	public static void main(String[] args)
	{
		String s1	=	"abc";
		String s2	=	"abc";
		String s3	= 	new String("abc");
		String s4	=	new String("abc");
		
		/*****   Object having same content so, hasCode() also same   *******/
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s3));
		System.out.println(s4.equals(s1));
	}

}
