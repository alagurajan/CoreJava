package com.source;

public class Z_105
{
	static int test(int i)
	{
		return i++;
	}

	public static void main(String[] args)
	{
		int i=0;
		i=i++ +i+ test(i++) +i;
		System.out.println(i);
	}

}
