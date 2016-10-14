package com.source.instance.var;

public class W_137
{
	int i;
	
	static W_137 test(W_137 w1)
	{
		W_137 w2	=	new W_137();
		w2.i=w1.i;
		return w2;
	}

	public static void main(String[] args)
	{
		W_137 obj	=	new W_137();
		obj.i=20;
		W_137 rv	=	test(obj);
		System.out.println(rv.i);
	}

}
