package com.source.object2;

public class Manager14
{

	public static void main(String[] args)
	{
		W w1	=	new W();
		w1.i=10;
		w1.j="abc";
		w1.k='p';
		w1.m=true;
		
		System.out.println(w1.hasCode());
		
		W w2	=	new W();
		w2.i=10;
		w2.j="abc";
		w2.k='p';
		w2.m=true;
		
		System.out.println(w2.hasCode());
	}

}
