package com.source.string3;

public class G
{

	public static void main(String[] args)
	{
		StringBuffer	sb	=	new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.append("123456781234567890");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}

}
