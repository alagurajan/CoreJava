package com.source.object5;

public class Manager07
{

	public static void main(String[] args) throws Exception
	{
		Class c1	=	Class.forName("com.source.object5.I");
		I obj		=	(I)c1.newInstance();
		obj.test();
	}

}
