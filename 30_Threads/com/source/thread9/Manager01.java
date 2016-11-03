package com.source.thread9;

import java.lang.Thread.State;

public class Manager01
{
	public static void main(String[] args)
	{
		Thread.State states[]	=	Thread.State.values();
		
		for (State state : states)
		{
			System.out.println(state);
		}
	}
}
