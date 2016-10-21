package packSix;

class Employee
{
	Job x[];
	
	Employee(Job x[])
	{
		this.x=x;
	}
	
	Iterator getIterator()
	{
		Iterator it	=	new Iterator(x);
		return it;
	}
	
	/*****   Static inner class state here   *******/
	
	static class Iterator
	{
		private static int index;			/*****   If we want to make some attribute of innerclass
		 											 as static, then we should make the innerclass as static *******/
		Job x[];
		
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
			return index<x.length;
		}
	}
	
	/*****   End of static innerclass   *******/
	
}
