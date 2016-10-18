package com.source.casting2;

public class Manager20
{
	static C test()
	{
		A a1	=	new D();
		//return a1;				//Type mismatch: cannot convert from A to C			(Uncomment this line & Comment next line)
		return new C();
	}

	public static void main(String[] args)
	{
		//D d1	=	test();			//Type mismatch: cannot convert from C to D			(Uncomment this line)
		System.out.println("Done");
	}

}
