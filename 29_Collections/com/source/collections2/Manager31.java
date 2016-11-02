package com.source.collections2;

import java.util.HashMap;

public class Manager31
{

	public static void main(String[] args)
	{
		HashMap map	=	new HashMap();
		map.put("abc", 2000);
		map.put("key1", 5000);
		map.put("key2", "value1");
		map.put(9090, "value2");
		
		System.out.println(map.get("key2"));
		System.out.println(map.get(9090));
		System.out.println(map.get("xyz"));
	}

}
