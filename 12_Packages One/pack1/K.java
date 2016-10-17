package pack1;

public class K extends J
{

	public static void main(String[] args)
	{
		K k1	=	new K();
		System.out.println(k1.y);
		//System.out.println(k1.x);	//The field J.x is not visible		(Uncomment this line) Private member can't inherit to sub class
	}

}
