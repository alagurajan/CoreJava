package com.source.abstractone;

public class G extends F
{

	
	void test1()
	{
		System.out.println("from test1");
	}

	public static void main(String[] args)
	{
		//F f1	=	new F();	//Cannot instantiate the type F		(Uncomment this line)
		//f1.test1();
		//f1.test2();
		
		G g1	=	new G();
		g1.test1();
		g1.test2();
		
	}

}
