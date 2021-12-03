package com.testng.listeners;
import org.testng.annotations.Test;

public class FirstClass 
{
	@Test
	public void FirstTC() 
	{
		System.out.println("Verifying element on webpage");
	}
	@Test
	public void SecondTC()
	{
		System.out.println("Login to Application");
	}
}
