package com.source.methodoverloadAndoverride2;

class P extends O
{
 
	// void test()		//Cannot reduce the visibility of the inherited method from O	(Uncomment this line & comment Next line)
	 protected void test()
	{
		System.out.println("done");
	}

}
