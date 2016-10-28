package com.source.collections2;

import java.util.PriorityQueue;

public class Manager09
{

	public static void main(String[] args)
	{
		PriorityQueue	pq	=	new PriorityQueue();
		pq.add("abc");
		pq.add("done");
		pq.add(10);			/*****   java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer   *******/
		pq.add("xyz");
		pq.add("test");
		System.out.println(pq);
	}

}

