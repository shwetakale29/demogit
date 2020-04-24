package com.gitexam;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demomercury
{
	@Test
	  public void loginTest()
	  {System.out.println("Login Success");
	  }
	  @BeforeMethod
	  public void getCookies() 
	  {System.out.println("get cookies");
	  }

	  @AfterMethod
	  public void captureScreenshort() 
	  {System.out.println("Screenshort is captured");
	  }

	  @BeforeClass
	  public void maximizePage()
	  {System.out.println("miximize the page");
		  
	  }

	  @AfterClass
	  public void deleteCookie() 
	  {System.out.println("delete cookie");
	  }

	  @BeforeTest
	  public void enterUrl() {
		  System.out.println("enter url");
	  }

	  @AfterTest
	  public void dbClose()
	  {System.out.println("db Close");
	  }

	  @BeforeSuite
	  public void OpenBrowser() 
	  {
		  System.out.println("Open Browser");
		  System.out.println("operation is succesfully done");
	  }

	  @AfterSuite
	  public void closeWindow()
	  {System.out.println("close the current windows");
	  }

}
