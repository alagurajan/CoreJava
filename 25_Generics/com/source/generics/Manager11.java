package com.source.generics;

public class Manager11
{

	public static void main(String[] args)
	{
		T<P> t1	=	new T<P>();
		T<Q> t2	=	new T<Q>();
		T<R> t3	=	new T<R>();
		T<S> t4	=	new T<S>();
		/******	Now we can't supply any other generic type if it extends	*******/
		//T<String> t5 = new T<String>();	//Bound mismatch: The type String is not a valid substitute for the bounded parameter <A extends P> of the type T<A>  (Uncomment this line) 
		
		System.out.println("Done");
	}

}

