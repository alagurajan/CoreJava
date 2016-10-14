package com.source.instance.var;

public class Q_131
{
	int i;
	
	public static void main(String[] args)
	{
		Q_131	q1	=	new Q_131();
		q1.i=10;
		Q_131	q2	=	q1;
		System.out.println(q2.i);
		q2.i=20;
		Q_131	q3	=	q2;
		System.out.println(q3.i);
		System.out.println(q1.i);
	}

}
