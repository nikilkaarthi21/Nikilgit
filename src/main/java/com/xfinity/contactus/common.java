package com.xfinity.contactus;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.xfinity.connector.Contactutil;
import com.xfinity.contactus.ExtentManager;

import cucumber.api.java.en.And;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class common {
	Contactutil Selenium=Contactutil.getInstance();
	@And("^I click on \"([^\"]*)\"$")
	public void I_click_on(String objectname)
	{ 
		Selenium.click(objectname);
	}
	
@And("^I Enter the data from Excel \"([^\"]*)\" and \"([^\"]*)\"$")
public void I_Enter_the_data_from_Excel_and(String objectname,String objectname1)

{
	Selenium.type(objectname,objectname1);

}
	
	
	
}
