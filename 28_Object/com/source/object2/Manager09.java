package com.source.object2;

public class Manager09
{

	public static void main(String[] args)
	{
		P p1	=	new P(10);
		P p2	=	null;
		
		Q q1	=	new Q(20);
		Q q2	=	null;
		
		R r1	=	new R(p1,q1,"abc",true);
		R r2	=	new R(p1,q1,"abc",true);
		R r3	=	new R(p1,q2,"abc",false);
		R r4	=	new R(p1,q2,"xyz",true);
		R r5	=	new R(p1,q2,null,true);
		R r6	=	new R(p1,q2,null,null);
		
		System.out.println(r1.equals(r5));
		System.out.println(r2.equals(r4));
		System.out.println(r3.equals(r3));
		System.out.println(r4.equals(r2));
		System.out.println(r5.equals(r1));
		System.out.println(r6.equals(null));		
	}

}
