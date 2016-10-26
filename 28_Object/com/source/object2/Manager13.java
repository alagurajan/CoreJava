package com.source.object2;

public class Manager13
{

	public static void main(String[] args)
	{
		V v1	=	new V(10,20);
		V v2	=	new V(20,10);
		System.out.println(v1.hasCode());
		System.out.println(v2.hasCode());
		System.out.println("-------");
		
		V v3	=	new V(40,20);
		V v4	=	new V(40,20);
		System.out.println(v3.hasCode());
		System.out.println(v4.hasCode());
		System.out.println("-------");
		
		V v5	=	new V(40,30);
		V v6	=	new V(40,20);
		System.out.println(v5.hasCode());
		System.out.println(v6.hasCode());
		
	}

}
