package com.source.collections2;

import java.util.PriorityQueue;

public class Manager10
{

	public static void main(String[] args)
	{
		PriorityQueue	queue	=	new PriorityQueue();
		queue.add(12);
		queue.add(null);			/*****   java.lang.NullPointerException   *******/
		queue.add(4);
		System.out.println(queue);
	}

}
