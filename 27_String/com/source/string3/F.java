package com.source.string3;

public class F
{

	public static void main(String[] args)
	{
		StringBuffer sb 	=	 new StringBuffer();
		sb.append("abc");
		System.out.println(sb.length());
		System.out.println(sb.capacity());	/******	location unoccupied	*******/
	}

}
