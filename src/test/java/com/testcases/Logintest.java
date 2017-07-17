package com.testcases;

import java.io.File;
import java.util.Date;
import java.util.Hashtable;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.basetest;
//import com.zoho.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.zoho.Datautil;

public class Logintest extends basetest{
	
	Xls_Reader xls;
	String testcaseName="Logintest";
	
	@Test(priority=1,dataProvider="getdata")
	public void doLogintest(Hashtable<String,String>data)
	{
	if(!Datautil.isRunnable(testcaseName,xls)|| data.get("Runmode").equals("N"))
		{
		  test.log(LogStatus.SKIP, "Skip tht test");
		  throw new SkipException("Skipping Run Mode");
	    }
		
	     test=rep.startTest("Logintest");
	     test.log(LogStatus.INFO, "start Logintest");
	     test.log(LogStatus.FAIL,"failed Logintest");
	     test.log(LogStatus.FAIL, "screenshot"+test.addScreenCapture("C:\\test.png"));
		 openbrowser(data.get("Browser"));
	     geturl(prop.getProperty("appurl"));	  
	     boolean actualResult= doLogin(data.get("username"),data.get("password"));
	     click("buttonxpath");
		click("button");
	   //  driver.findElement(By.xpath("//*[@id='lid']")).sendKeys("shanthi.jayaraman7@gmail.com");
	
	}	
	
	@DataProvider(parallel=true)
	public Object[][]getdata()
	{
		System.out.println("IN GET DATA");
		Xls_Reader xls=new Xls_Reader("C:\\Users\\nikil kaarthi\\Downloads\\data1.xlsx");
		return Datautil.gettestData(xls,testcaseName);

	}
	
@AfterMethod
	public void quit()
	{
		rep.endTest(test);
		rep.flush();
	   if(driver!=null)
	    driver.quit();
	}

}


