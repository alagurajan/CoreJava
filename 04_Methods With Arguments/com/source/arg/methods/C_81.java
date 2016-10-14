package com.source.arg.methods;

public class C_81
{
	static void test(int i)
	{
		System.out.println("from test :"+i);
	}

	public static void main(String[] args)
	{
		test(100);
		int k=200;
		test(k);
		test(k+300);
		int m;
		//test(m);		//The local variable m may not have been initialized   Uncomment this line
		System.out.println("done");
	}

}
