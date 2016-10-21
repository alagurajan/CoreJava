package packFive;

class Employee
{
	Job	x[];
	
	Employee(Job x[])
	{
		this.x=x;
	}
	
	Iterator getIterator()
	{
		Iterator it	=	new Iterator(x);
		return it;
	}
	
	/*****   Inner class to the Employee class start here   *******/
	class Iterator
	{
		private int index;
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
			return index < x.length;
		}
	}
	
	/*****   Inner class End here   *******/
}
