package com.source.instance.var;

public class U_135
{
	int i;
	
	static U_135 test()
	{
		U_135 u1	=	new U_135();
		u1.i=20;
		return u1;
	}

	public static void main(String[] args)
	{
		U_135 obj	=	test();
		System.out.println(obj.i);
	}

}
