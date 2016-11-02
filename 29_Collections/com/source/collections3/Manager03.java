package com.source.collections3;

import java.util.TreeMap;

public class Manager03
{

	public static void main(String[] args)
	{
		TreeMap map	=	new TreeMap();
		map.put(80, "abc");
		map.put("abc", "abc");			/*****   java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String   *******/
		System.out.println(map);
	}

}
