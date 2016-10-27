package com.source.object4;

public class W implements Cloneable
{
	int k;
	B obj1;
	C obj2;
	
	protected Object clone() throws CloneNotSupportedException
	{
		W w1	=	null;
		w1= (W)super.clone();
		
		w1.obj1= new B();
		w1.obj1.i=obj1.i;
		
		w1.obj2= new C();
		w1.obj2.j=obj2.j;
		
		return w1;
	}

	public static void main(String[] args) throws CloneNotSupportedException
	{
		W t1	=	new W();
		t1.k=10;
		t1.obj1=new B();
		t1.obj2=new C();
		t1.obj1.i=20;
		t1.obj2.j=30;
		
		W t2	=	(W)t1.clone();
		System.out.println(t2.k);
		System.out.println(t2.obj1.i);
		System.out.println(t2.obj2.j);
		
		t2.k=40;
		t2.obj1.i=50;
		t2.obj2.j=60;
		
		System.out.println("-------");
		
		System.out.println(t1.k);
		System.out.println(t1.obj1.i);
		System.out.println(t1.obj2.j);
		
		
	}

}
