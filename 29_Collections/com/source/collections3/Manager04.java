package com.source.collections3;

import java.util.TreeMap;

class A
{
	int i;
	A(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "(i="+i+")";
	}
}

public class Manager04
{
	/*****   java.lang.ClassCastException: com.source.collections3.A cannot be cast to java.lang.Comparable   *******/
	public static void main(String[] args)
	{
		TreeMap map	=	new TreeMap();
		map.put(new A(9), "abc");
		map.put(new A(90), "abc1");
		map.put(new A(5), "abc2");
		System.out.println(map);
	}

}
