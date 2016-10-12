package com.source;

public class P_94
{

	static int test(int i)
	{
		return --i;
	}

	public static void main(String[] args)
	{
		System.out.println(test(9));
		int i=0;
		System.out.println(test(i));
		System.out.println(i);
	}

}
