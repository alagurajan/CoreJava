package pack1;

public class T extends S
{
	T()
	{
		super(10);	//Implicit super constructor S() is not visible. Must explicitly invoke another constructor (Comment this line)
	}
	public static void main(String[] args)
	{
		System.out.println("Done");
	}

}
