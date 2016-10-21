package com.source.innerclass2;

public class Manager06
{

	public static void main(String[] args)
	{
		B b1	=	new B()
				{
					void test1() 
					{
						System.out.println("AIC-test1");
					}
				};
		b1.test1();
		b1.test2();
		System.out.println("Done");
	}

}
