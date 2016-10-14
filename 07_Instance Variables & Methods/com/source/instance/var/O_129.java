package com.source.instance.var;

public class O_129
{
	int i;
	
	public static void main(String[] args)
	{
		O_129 o1	=	new O_129();
		O_129 o2	=	o1;
		o1.i=10;
		System.out.println(o2.i);
		o2.i=20;
		System.out.println(o1.i);
	}

}
