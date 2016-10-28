package com.source.collections1;

import java.util.ArrayList;
import java.util.ListIterator;

public class Manager39
{

	public static void main(String[] args)
	{
		ArrayList list	=	new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);
		
		ListIterator it	=	list.listIterator();
		it.add(50);				/*****   we are not using arraylist but we are asking listIterator to add   *******/
		while(it.hasNext())
		{
			System.out.print(it.next()+",");
		}
		System.out.println();
		while(it.hasPrevious())
		{
			System.out.print(it.previous()+",");
		}
	}

}
