package packFour;

class Iterator
{
	private static int index;
	Job	x[];
	
	Iterator(Job x[])
	{
		this.x=x;
	}
	
	Job nextJob()
	{
		return x[index++];
	}
	
	boolean hasNext()
	{
		return index < x.length;
	}
}
