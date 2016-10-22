package com.source.generics;

public class Manager08
{

	public static void main(String[] args)
	{
		I obj1 			= 	new I();	/******	By default Object Type	*******/
		I<String> obj2 	= 	new I<String>();
		
		obj1.f1	=	new Object();
		obj2.f1	=	"abc";
		System.out.println("Done");
	}

}
