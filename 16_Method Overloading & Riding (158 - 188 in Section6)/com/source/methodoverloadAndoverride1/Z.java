package com.source.methodoverloadAndoverride1;

public class Z extends Y
{
	//int test()	//The return type is incompatible with Y.test()		(Comment Next line & uncomment this line & 9th line )
	void test()
	{
		System.out.println("from Z");
		//return 10;
	}
}
