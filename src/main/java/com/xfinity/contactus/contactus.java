package com.xfinity.contactus;



import com.xfinity.connector.Contactutil;
import com.xfinity.contactus.ExtentManager;

import java.io.IOException;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;

public class contactus {
	
	Contactutil Selenium=Contactutil.getInstance();
    public ExtentReports rep=ExtentManager.getInstance();
	public ExtentTest test;
	
@Given("^I open \"([^\"]*)\" on \"([^\"]*)\"$")	
public void I_open_on(String SITE,String browser)
{
	Selenium.openbrowser(browser);
	Selenium.navigate(SITE);
	test=rep.startTest("contactus");
	test.log(LogStatus.INFO,"openbrowser");
	test.log(LogStatus.PASS,"Screenshot-> "+ test.addScreenCapture("C:report\\test.png"));
}

@After
public void quit() throws IOException
{
	rep.endTest(test);
	rep.flush();
	Selenium.Screencapture();
}


}

