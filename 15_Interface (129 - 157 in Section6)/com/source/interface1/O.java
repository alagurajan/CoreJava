package com.source.interface1;

public class O implements N
{
 
	public void test1()
	{
		System.out.println("from test1");
	}

	public static void main(String[] args)
	{
		//N n1	=	new N();		//Cannot instantiate the type N		(Uncomment this line)
		N	n2	=	null;
		O o1	=	new O();
		o1.test1();
		System.out.println("done");
		
		
	}

}
