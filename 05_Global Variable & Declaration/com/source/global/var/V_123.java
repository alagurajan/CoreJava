package com.source.global.var;

public class V_123
{
	static int i=10;
	static int j=i;
	//static int m=n;		// Forward reference (Uncomment this and 14th Line)
	static int n=j;

	public static void main(String[] args)
	{
		System.out.println(i);
		System.out.println(j);
		//System.out.println(m);
		System.out.println(n);
	}

}
