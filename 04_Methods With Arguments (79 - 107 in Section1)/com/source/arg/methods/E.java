package com.source.arg.methods;

public class E
{
	static void test(int i, int j)
	{
		System.out.println("i="+i+",j="+j);
	}

	public static void main(String[] args)
	{
		test(10,20);
		int i=200;
		test(i,500);
		test(2000,i);
		test(i,i);
		System.out.println("Done");
		
	}

}
