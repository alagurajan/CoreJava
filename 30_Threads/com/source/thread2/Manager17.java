package com.source.thread2;

class P extends Thread
{
	public void run() 
	{
		System.out.println("something");
	}
}

public class Manager17
{

	public static void main(String[] args)
	{
		P p1	=	new P();
		p1.start();
		p1.setDaemon(true);			/*****   java.lang.IllegalThreadStateException  Can't change the Daemon status after start the Thread   *******/
		System.out.println("Done");
	}

}
