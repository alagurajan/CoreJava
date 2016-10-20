package com.source.inher.one;

public class V extends U
{
	V()
	{
		this(10);
		System.out.println("V()");
	}
	{
		System.out.println("V-IIB");
	}
	V(int i)
	{
		System.out.println("V(int)");
	}

	public static void main(String[] args)
	{
		T t1	=	new T();
		System.out.println("-----------");
		U u1	=	new U();
		System.out.println("-----------");
		V v1	=	new V();
		System.out.println("-----------");
		V v2	=	new V(10);
		System.out.println("-----------");
	}

}
