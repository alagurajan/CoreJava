package com.source.object2;

public class Manager15
{

	public static void main(String[] args)
	{
		X x1	=	new X();
		x1.i=10;
		
		Y y1	=	new Y();
		y1.k=20;
		y1.s1="abc";
		y1.b1=false;
		y1.x1=x1;
		
		X x2	=	new X();
		x2.i=10;
		
		Y y2	=	new Y();
		y2.k=20;
		y2.s1="abc";
		y2.b1=false;
		y2.x1=x2;
		
		System.out.println(y1.hasCode());
		System.out.println(y2.hasCode());
		 
		
		/*****   If the content of two object are same then the hashcode also will be same   *******/
		
	}

}
