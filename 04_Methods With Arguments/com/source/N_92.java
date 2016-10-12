package com.source;

public class N_92
{
	static int test(int i)
	{
		return i--;
	}

	public static void main(String[] args)
	{
		int i=0;
		System.out.println(i);
		System.out.println(test(i));
		System.out.println(i);
		i=test(i);
		System.out.println(i);
	}

}
