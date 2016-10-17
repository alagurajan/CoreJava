package com.source.methodoverloadAndoverride2;

class N extends M
{
	protected void test()			// "Protected" had Wider access than "default" 
	{
		System.out.println("from N");
	}

	public static void main(String[] args)
	{
		N n1	=	new N();
		n1.test();
		System.out.println("Done");
	}

}
