package com.source.exception2;

import java.io.IOException;
import java.sql.SQLException;

public class Q
{
	static void test1() throws SQLException
	{
		
	}
	
	static void test2() throws IOException
	{
		
	}
	
	static void test3() throws NullPointerException
	{
		
	}
	
	static void test4()
	{
		try
		{
			test1();
		} 
		catch (SQLException e)
		{
			
		}
		
		try
		{
			test2();
		} 
		catch (IOException e)
		{
			
		}
		
		test3();		/******	Unchecked don't required try catch to compile	*******/
	}
	
	static void test5()
	{
		try
		{
			test1();
			test2();
		} 
		catch (IOException e)
		{
			
		}
		catch (SQLException e)
		{
			
		}
	}
	
	static void test6() throws SQLException, IOException
	{
		test1();
		test2();
	}
	
	static void test7() throws Exception
	{
		test1();
		test2();
	}
	
	static void test8() throws Throwable
	{
		test1();
		test2();
	}
	
	void test9()
	{
		try
		{
			test1();
			test2();
		}
		catch (Exception e)
		{
			
		}
	}

}
