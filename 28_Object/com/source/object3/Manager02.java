package com.source.object3;

import java.util.HashSet;

public class Manager02
{

	public static void main(String[] args)
	{
		HashSet set	=	new HashSet();
		set.add(new B(1,2));
		System.out.println("-----");
		set.add(new B(1,2));
		System.out.println("-----");
		set.add(new B(2,2));
		System.out.println("-----");
		set.add(new B(2,2));
		System.out.println("-----");
		set.add(new B(2,1));
		System.out.println("-----");
		System.out.println(set.size());
	}

}
