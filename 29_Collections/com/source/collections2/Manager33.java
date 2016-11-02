package com.source.collections2;

import java.util.HashMap;

public class Manager33
{

	public static void main(String[] args)
	{
		HashMap map	=	new HashMap();
		map.put("abc", 1000);
		System.out.println(1+":"+map);
		map.put("abc", 2000);
		System.out.println(2+":"+map);
		map.put("abc", "xyz");
		System.out.println(3+":"+map);
	}

}
