package com.source.inher.one;

public class B extends A 
{
	
	B() 
	{
		super(90);
		System.out.println("B()");
	}

	public static void main(String[] args) 
	{
		A a1	=	new A(90);
		System.out.println("---------");
		B b1	=	new B();
	}

}
