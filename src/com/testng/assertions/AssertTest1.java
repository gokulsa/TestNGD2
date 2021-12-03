package com.testng.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest1
{
	@Test
  	public void TestA()
  	{
	  	Assert.assertTrue(true);
	  	Assert.assertEquals("gokul", "gokul");
	  	Assert.assertEquals("testng", "testng");
	  	System.out.println("Test A success");
  	}
	@Test
	public void TestB()
	{
		Assert.assertTrue(true);
		Assert.assertNotEquals("java", "C++");
		Assert.assertNotEquals("testng", "selenium");
		System.out.println("Test B success");
	}
	@Test
	public void TestC()
	{
		Assert.assertFalse(false);
		Assert.assertEquals("login", "logout");
		Assert.assertEquals("picnic", "scuba");
		System.out.println("Test C success");
	}
}
