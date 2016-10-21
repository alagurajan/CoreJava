package packOne;

class Job
{
	String title;
	double salary;
	
	Job(String title, double salary)
	{
		this.title	=	title;
		this.salary	=	salary;
	}
}

class Employee
{
	private int index;
	Job x[];
	
	Employee(Job x[])
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
