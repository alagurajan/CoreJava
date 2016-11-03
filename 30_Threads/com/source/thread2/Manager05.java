package com.source.thread2;

class G extends Thread
{
	
}

public class Manager05
{

	/*****   ID always will be Unique   *******/
	
	public static void main(String[] args)
	{
		G g1	=	new G();
		G g2	=	new G();
		
		System.out.println(g1.getId());
		System.out.println(g2.getId());

	}

}
