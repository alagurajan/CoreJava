package com.source;

public class W_101
{
	static int test(int i)
	{
		return ++i;
	}

	public static void main(String[] args)
	{
		int i=0;
		int j=test(i++) +i+ test(++i);
		System.out.println(i);
		System.out.println(j);
	}
}
