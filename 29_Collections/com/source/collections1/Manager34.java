package com.source.collections1;

import java.util.ArrayList;
import java.util.Iterator;

public class Manager34
{

	public static void main(String[] args)
	{
		ArrayList list	=	new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);
		
		Iterator it	=	list.iterator();
		list.add(50);						/*****   java.util.ConcurrentModificationException  if you comment this line it will execute   *******/
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
