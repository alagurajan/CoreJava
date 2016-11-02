package com.source.collections5;

class G<E>
{
	E attr1;
	G(E attr1, int j)
	{
		this.attr1=attr1;
	}
}

public class Manager06
{

	public static void main(String[] args)
	{
		G<String> g1 = new G<String>("abc",20);
		G<Integer> g2 = new G<Integer>(40,20);
		G<Double> g3 = new G<Double>(4.90,20);
		
		System.out.println("Done");
	}

}
