package com.source.instance.var;

public class T_134
{
	int i;
	
	static T_134 test()
	{
		T_134 t1	=	new T_134();
		return t1;
	}

	public static void main(String[] args)
	{
		T_134 obj	=	test();
		System.out.println(obj.i);
	}

}
