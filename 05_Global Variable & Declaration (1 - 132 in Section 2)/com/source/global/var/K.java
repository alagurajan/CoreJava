package com.source.global.var;

public class K_112
{
	static int i;
	public static void main(String[] args)
	{
		System.out.println("a:"+1);
		int i=10;
		System.out.println("b:"+i);
		i=20;							// Local "i" got changed so local variable not preferable here.
		System.out.println("c:"+i);
	}

}
