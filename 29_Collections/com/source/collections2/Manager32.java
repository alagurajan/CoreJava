package com.source.collections2;

import java.util.HashMap;

public class Manager32
{

	public static void main(String[] args)
	{
		HashMap map	=	new HashMap();
		map.put(null, 1000);
		map.put("abc", null);
		map.put("test", "done");
		System.out.println(map);
	}

}
