package com.source.final1;

public class F
{

	public static void main(String[] args)
	{
		F f1		=	new F();
		final F f2	=	new F();
		//f2=f1;	//The final local variable f2 cannot be assigned. It must be blank and not using a compound assignment	(Uncomment this line)
		System.out.println("Done");
	}

}
