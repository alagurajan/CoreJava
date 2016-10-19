package com.source.final1;

public class O
{
	final int i=10;

	public static void main(String[] args)
	{
		O o1	=	new O();
		//o1.i	=	10;			//The final field O.i cannot be assigned		(Uncomment this line)
		System.out.println(o1.i);
	}

}
