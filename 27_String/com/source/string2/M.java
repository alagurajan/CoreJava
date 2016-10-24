package com.source.string2;

public class M
{

	public static void main(String[] args)
	{
		String s1	=	"abc;xyz;hello;123";
		String[] x	=	s1.split(";");
		for(String s:x)
			System.out.println(s);
	}

}
