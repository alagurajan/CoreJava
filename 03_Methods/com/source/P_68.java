package com.source;

public class P_68
{

	public static void main(String[] args)
	{
		System.out.println("main begin");
		if(100==100)
		{
			System.out.println("from if");
			return;
		}
		System.out.println("main end");	// This line will not execute if you comment the 12th line, then it will execute
	}

}
