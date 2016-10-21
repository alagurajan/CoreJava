package com.source.innerclass2;

public class Manager02
{

	public static void main(String[] args)
	{
		A a1	=	new A()
		{
			void test1() 
			{
				System.out.println("AIC-test1");	/*****   Anonymous Inner Class Example   *******/
			}
		};
		a1.test1();
		a1.test2();
		System.out.println("Hello World!");
	}

}
