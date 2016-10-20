package com.source.sib;

public class F_145
{
	static int i;

	public static void main(String[] args)
	{
		System.out.println("from main:"+i);
		System.out.println("from main:"+F_145.i);
	}

}
class G
{
	public static void main(String[] args)
	{
		System.out.println("from main:"+F_145.i);
	}
}
