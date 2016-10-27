package com.source.collections1;

import java.util.ArrayList;

public class Manager05
{

	public static void main(String[] args)
	{
		ArrayList list1 	= new ArrayList();
		
		list1.add(90);
		list1.add(0);
		list1.add("abc");
		System.out.println(list1);
		list1.add("xyz");
		System.out.println(list1);
		list1.add(2, "check");
		System.out.println(list1);
		
	}

}
