package com.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.basetest;
import com.relevantcodes.extentreports.LogStatus;
import com.zoho.Datautil;

public class Leadtest extends basetest {
	
 //String testcaseName="CreateLeadTest";
    Xls_Reader xls;
    
	@Test(priority=1,dataProvider="getdata")
	public void createLead(Hashtable<String,String>data)
	{	  
		System.out.println("DATA"+data);
		test=rep.startTest("Leadtest");
		if(!Datautil.isRunnable("CreateLeadTest",xls)||data.get("Runmode").equals("N"))
		{
		//  test.log(LogStatus.SKIP, "Skip tht test");
		  throw new SkipException("Skipping Run Mode");
		}
		
		 test=rep.startTest("Leadtest");
	
		  openbrowser(data.get("Browser"));
	      geturl(prop.getProperty("appurl"));  
	      boolean actualResult= doLogin(prop.getProperty("user"),prop.getProperty("pwd"));
	      click("buttonxpath");
		  click("Leadurlxpath");
		  click("createnewxpath");
		  click("createLeadxpath");
		  wait(2);
		 type("companyxpath",data.get("LeadCompany"));
	     type("lastnamexpath",data.get("LeadLastName"));
		  click("savexpath");
		  click("Leadurlxpath");
		 //int getrownum=getLead(data.get("LeadLastName"));
		  System.out.println("Leadurlxpath");
		  // click(data.get("LeadLastName"));
		  clickonLead(data.get("LeadLastName"));
		//  click("convertxpath");
		//  click("convertsavexpath");
		//  click("gotoleadsxpath");
		 
		 
      
	}
		
		@Test(priority=2,dataProvider="getdata")
	public void convertLead(Hashtable<String,String>data)
	{	  
		System.out.println("DATA"+data);
		test=rep.startTest("ConvertLeadtest");
		if(!Datautil.isRunnable("ConvertLeadTest",xls)||data.get("Runmode").equals("N"))
		{
		//  test.log(LogStatus.SKIP, "Skip tht test");
		  throw new SkipException("Skipping Run Mode");
		}
		
		 test=rep.startTest("ConvertLeadtest");
		  openbrowser(data.get("Browser"));
	      geturl(prop.getProperty("appurl"));  
	      boolean actualResult= doLogin(prop.getProperty("user"),prop.getProperty("pwd"));
	      click("buttonxpath");
		  click("Leadurlxpath");
		  clickonLead(data.get("LeadLastName"));
		  click("convertxpath");
		  click("convertsavexpath");
		  click("gotoleadsxpath");
		 
		 
	}	
	
@Test(priority=3,dataProvider="getdata1")
	public void deleteLead(Hashtable<String,String>data)
	{
	 
	System.out.println("DATA"+data);
	test=rep.startTest("DeleteLeadAccountTest");
	if(!Datautil.isRunnable("DeleteLeadAccountTest",xls)||data.get("Runmode").equals("N"))
	{
	//  test.log(LogStatus.SKIP, "Skip tht test");
	  throw new SkipException("Skipping Run Mode");
	}
	
	 test=rep.startTest("DeleteLeadAccountTest");
	  openbrowser(data.get("Browser"));
      geturl(prop.getProperty("appurl"));  
      boolean actualResult= doLogin(prop.getProperty("user"),prop.getProperty("pwd"));
      click("buttonxpath");
	  click("Leadurlxpath");
	
	  clickonLead(data.get("LeadLastName"));
	 // deletelead(data.get("LeadLastName"));
	//  click("comboxpath");
	  click("dropdownxpath");
	 // waitForPageToLoad();
	  click("deletexpath");
	  //waitForPageToLoad();
	 // click("deleteconfirm");
	//  acceptAlert();
	 click("deleteconfirmxpath");
	  
	}
	
	
	{
		
	}
	@DataProvider
	public Object[][]getdata()
	{
		System.out.println("IN GET DATA");
		Xls_Reader xls=new Xls_Reader("C:\\Users\\nikil kaarthi\\Downloads\\data1.xlsx");
		return Datautil.gettestData(xls,"CreateLeadTest");

	}
	@DataProvider
	public Object[][]getdata1()
	{
		System.out.println("IN GET DATA");
		Xls_Reader xls=new Xls_Reader("C:\\Users\\nikil kaarthi\\Downloads\\data1.xlsx");
		return Datautil.gettestData(xls,"DeleteLeadAccountTest");

	}
    
	
@AfterMethod()
	public void quit()
	{
		//if(rep!=null)
		//driver.quit();
		rep.endTest(test);
		rep.flush();
		//if(driver!=null)
	//  driver.quit();
	}
}

