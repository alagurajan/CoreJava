package com.lara.annotations;

@Author(name="Alagurajan")
@Version(number=1.0)
public class S
{
	@Author(name="Alagurajan1")
	@Version(number=2.0f)
	public void annotatedMethod1() 
	{
		System.out.println("annotatedMethod1");
	}
	
	@Author(name="Alagurajan2")
	@Version(number=5.0)
	public void annotatedMethod2() 
	{
		System.out.println("annotatedMethod2");
	}
	
}
