package com.source.collections2;

import java.util.LinkedList;

public class Manager04
{

	public static void main(String[] args)
	{
		LinkedList list	=	new LinkedList();
		list.add("abc");
		list.add("cba");
		list.add("test");
		list.add("hello");
		list.add("java");
		list.add("10");
		System.out.println(list);
		
		Object o1	=	list.removeLast();
		System.out.println(o1);
		System.out.println(list);
		
		Object o2	=	list.removeLast();
		System.out.println(o2);
		System.out.println(list);	
		
	}

}
