package com.source.collections1;

import java.util.ArrayList;
import java.util.ListIterator;

public class Manager37
{

	public static void main(String[] args)
	{
		ArrayList list	=	new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);
		
		ListIterator it	=	list.listIterator();
		list.add(50);							/*****   java.util.ConcurrentModificationException  if you comment this line it will execute   *******/
		while(it.hasNext())
		{
			System.out.print(it.next()+",");
		}
		System.out.println();
		System.out.println("---------");

	}

}
