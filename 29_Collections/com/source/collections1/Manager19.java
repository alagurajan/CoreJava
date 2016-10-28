package com.source.collections1;

import java.util.ArrayList;
import java.util.Collections;

public class Manager19
{

	public static void main(String[] args)
	{
		ArrayList list	=	new ArrayList();
		list.add(8.0);
		list.add(9);
		list.add(9.0);
		list.add(9.1);
		System.out.println(list);
		Collections.sort(list);			/*****   java.lang.ClassCastException: java.lang.Double cannot be cast to java.lang.Integer   *******/
		System.out.println(list);
		
	}

}
