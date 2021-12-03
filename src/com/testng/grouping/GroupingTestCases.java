package com.testng.grouping;

import org.testng.annotations.Test;

public class GroupingTestCases 
{
	@Test(groups="sanity test")
  	public void Test1()
  	{
		System.out.println("Testing the login functionality");
  	}
	@Test(groups="smoke test")
	public void Test2()
	{
		System.out.println("Testing the Homepage of the website");
	}
	@Test(groups="smoke test")
	public void Test3()
	{
		System.out.println("Testing the Dashboard of the website");
	}
	@Test(groups="Functional test")
	public void Test4()
	{
		System.out.println("Testing the entire content of the website");
	}
	@Test(groups="regression test")
	public void Test5()
	{
		System.out.println("Testing the entire notification page");
	}
	@Test(groups="functional test")
	public void Test6()
	{
		System.out.println("Testing for the messaging toolbar");
	}
	@Test(groups="sanity test")
	public void Test7()
	{
		System.out.println("Testing the logout button");
	}
}