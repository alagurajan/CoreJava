package com.source.string4;

public class M
{

	public static void main(String[] args)
	{
		String s1	=	"ab12c29hello28done5";
		E.find(s1, "2");
		System.out.println("-----");
		E.find(s1, "[21]");
		System.out.println("-----");
		E.find(s1, "[1-5]");
	}

}
