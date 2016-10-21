package packTwo;

import static packOne.A.i;
import static packOne.A.test;
import static packOne.B.j;
import static packOne.B.k;
import static packOne.C.CON1;
import static packOne.C.CON2;
import static packOne.C.CON3;

						/*****  Import the all the static attributes of the Classes from other package (packOne)    *******/

public class Manager01
{

	public static void main(String[] args)
	{
		System.out.println(i);
		test();
		System.out.println(j);
		System.out.println(k);
		System.out.println(CON1);
		System.out.println(CON2);
		System.out.println(CON3);
	}

}
