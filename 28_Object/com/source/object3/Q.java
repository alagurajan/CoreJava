package com.source.object3;

public class Q implements Cloneable
{
	int i;
	
	Q()
	{
		System.out.println("Q()");
	}

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Q q1		=	new Q();		/*****   Constructor will call  *******/
		q1.i=1000;
		
		System.out.println("-----");
		Q q2		=	(Q)q1.clone();	/*****   Constructor won't call  *******/
		System.out.println(q2.i);
	}

}
