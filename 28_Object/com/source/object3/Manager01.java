package com.source.object3;

public class Manager01
{

	public static void main(String[] args)
	{
		A a1	=	new A(10,20);
		A a2	=	new A(20,10);
		A a3	=	new A(10,20);
		A a4	=	new A(20,20);
		
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println("------------");
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		System.out.println(a4.hashCode());
		System.out.println("-----------");
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a1.equals(a4));
		System.out.println(a2.equals(a3));
		System.out.println(a2.equals(a4));
		System.out.println(a3.equals(a4));
	}

}
