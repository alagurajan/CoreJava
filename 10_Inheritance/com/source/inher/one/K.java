package com.source.inher.one;

public class K extends J
{

	K()
	{
		System.out.println("K()");
		//super();			//Constructor call must be the first statement in a constructor (Uncomment this line)
	}

	public static void main(String[] args)
	{
		K k1	=	new K();
		System.out.println("Done");
	}

}
