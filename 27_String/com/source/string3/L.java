package com.source.string3;

public class L
{

	public static void main(String[] args)
	{
		StringBuffer sb		=	new StringBuffer();
		sb.append("hello1234");
		System.out.println(sb);
		sb.delete(2, 60);			/******	Simply deleting upto given no or exception	*******/
		System.out.println(sb);
	}

}
