package com.source.methods;

public class R
{
	static int test()
	{
		System.out.println("from test");
		return 1;				// If you Comment this line then it will be get the Erro like "This method must return a result of type int" 
	}
	
	public static void main(String[] args)
	{
		System.out.println("from main");
		test();
	}

}
