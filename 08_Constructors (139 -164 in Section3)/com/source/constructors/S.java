package com.source.constructors;

public class S
{
	S()
	{
		System.out.println("S()");
	}
	
	S(int i)
	{
		//S();								//The method S() is undefined for the type S	(Uncomment this line)
		System.err.println("S(int)");
	}

	public static void main(String[] args)
	{
		S obj1 = new S();
		System.out.println("------------");
		S obj2 = new S(10);
		System.out.println("------------");
	}

}
