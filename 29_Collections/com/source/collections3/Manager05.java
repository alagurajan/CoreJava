package com.source.collections3;

import java.util.TreeMap;

class B implements Comparable
{
	int i;
	B(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "(i="+i+")";
	}
	public int compareTo(Object obj)
	{
		return i-((B)obj).i;
	}
	
}

public class Manager05
{

	public static void main(String[] args)
	{
		TreeMap map	=	new TreeMap();
		map.put(new B(9), "abc1");
		map.put(new B(91), "abc4");
		map.put(new B(19), "abc2");
		map.put(new B(5), "abc3");
		
		System.out.println(map);

	}

}
