package com.source.thread1;

public class Manager03
{
	/*****   Complete execution is done by only one Thread (main Thread)   *******/

	public static void main(String[] args)
	{
		for (int i = 0; i < 1000; i++) 
		{
				System.out.println(i);
		}
		
		for (int i = 2000; i < 3000; i++) 
		{
				System.out.println(i);
		}
	}

}
