package com.source.object1;

public class Manager23
{

	public static void main(String[] args)
	{
		W w1	=	new W(10,20,30.9,40.8);
		W w2	=	new W(10,20,30.9,40.8);
		W w3	=	new W(10,20,30.8,40.8);
		
		System.out.println(w1.equals(w2));
		System.out.println(w2.equals(w3));
	}

}
