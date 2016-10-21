package packFour;

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
}
