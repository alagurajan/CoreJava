package com.source.instance.var;

public class V_136
{
	int i;
	
	static V_136 test()
	{
		return new V_136();
	}

	public static void main(String[] args)
	{
		V_136 v1	=	test();
		System.out.println(v1.i);
	}

}
