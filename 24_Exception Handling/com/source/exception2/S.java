package com.source.exception2;

import java.sql.SQLException;

public class S
{
	S() throws SQLException
	{
		
	}
	
	S(int i) throws SQLException
	{
		this();
	}
	
	void test1()
	{
		S s1	=	null;
		
		try
		{
			s1 = new S();
			s1 = new S(20);
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	void test2() throws SQLException	
	{
		S s1 = new S();
		 s1 = new S(90);
	}
	void test3() throws Exception
	{
		S	s1	=	new S();
		s1		=	new S(89);
	}
	void test4() throws Throwable
	{
		S s1	=	new S(59);
		s1		=	new S();
	}
	
	void test5()
	{
		S s1	=	null;
		
		try
		{
			s1	=	new S();
			s1	=	new S(20);
		} 
		catch (Exception e)
		{
			
		}
		
		try
		{
			s1	=	new S(9);
			s1	=	new S();
		} 
		catch (Throwable t)
		{
			
		}
	}
}