package com.testng.parameter;

import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;

public class ParamTest 
{
	@Parameters("browser")
	public void setup(String browser) throws Exception
	{
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox"))
		{
			//create firefox instance
			System.out.println("Firefox Browser is opened");
		}
	 
		//Check if parameter passed as 'chrome'
		else if (browser.equalsIgnoreCase("chrome"))
		{
			//set path to chromedriver.exe
			System.out.println("Chrome Browser is opened");
		}
		else
		{
			//If no browser passed throw exception
			System.out.println("Browser not passed in the parameter correctly");
		}
	}
}
