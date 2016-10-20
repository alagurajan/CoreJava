package com.source.thisone;

public class R
{

	public static void main(String[] args)
	{
		//Q q1 = new Q();		//The constructor Q() is not visible		(Uncomment this line)
		
		Q q2	=	Q.getObject();
		Q q3	=	Q.getObject();
		Q q4	=	Q.getObject();
		Q q5	=	Q.getObject();
		Q q6	=	Q.getObject();
		
		//System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
		System.out.println(q4);
		System.out.println(q5);
		System.out.println(q6);
		
		
	}

}
