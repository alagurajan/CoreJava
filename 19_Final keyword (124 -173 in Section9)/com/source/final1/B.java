package com.source.final1;

public class B
{

	public static void main(String[] args)
	{
		final int i;
		i=10;
		System.out.println(i);
		//i=10;	//The final local variable i may already have been assigned		(Uncomment this line)
		System.out.println(i);
	}

}
