package packTwo;

import static packOne.A.i;
import static packOne.A.test;
import static packOne.B.j;
import static packOne.B.k;
import static packOne.C.CON1;
import static packOne.C.CON2;
import static packOne.C.CON3;
import static java.lang.System.out;

						/*****  Import the all the static attributes of the Classes from other package (packOne)    *******/
						/*****   Note the System.out.println()   *******/

public class Manager02
{

	public static void main(String[] args)
	{
		out.println(i);
		test();
		out.println(j);
		out.println(k);
		out.println(CON1);
		out.println(CON2);
		out.println(CON3);
	}

}
