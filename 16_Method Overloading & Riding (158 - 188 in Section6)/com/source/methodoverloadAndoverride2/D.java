package com.source.methodoverloadAndoverride2;

public class D extends C
{
	//int test()	//The return type is incompatible with Y.test()		(Comment Next line & uncomment this line)
	double test()
	{
		System.out.println("from D");
		return 10;
	}
}
