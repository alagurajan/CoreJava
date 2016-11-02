package com.source.collections2;

import java.util.Hashtable;

class M
{
	int i;
	M(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "(i="+i+")";
	}
}

public class Manager37
{

	public static void main(String[] args)
	{
		Hashtable tab	=	new Hashtable();
		tab.put(10, "abc");
		tab.put(10, "xyz");
		tab.put("k1", 200);
		tab.put("k1", "test");
		tab.put(new M(10), 100);
		tab.put(new M(10), 200);
		System.out.println(tab);

	}

}
