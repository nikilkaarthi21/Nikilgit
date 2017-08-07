package com.xfinity.signin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.xfinity.connector.Contactutil;
import com.xfinity.contactus.ExtentManager;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;

public class signin {
	WebDriver driver;
	public ExtentReports rep=ExtentManager.getInstance();
	public ExtentTest test;
	Contactutil Selenium=Contactutil.getInstance();
	
	@Given("^I open the \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_open_the(String SITE,String browser)
	{
		Selenium.openbrowser(browser);
		Selenium.navigate(SITE);
		test=rep.startTest("signin");
		test.log(LogStatus.INFO,"Signintest");
        test.log(LogStatus.PASS,"snapshot below"+test.addScreenCapture("C:/report/pass.png"));
		//test.addScreenCapture("C:/report/pass.png");
		
	}
	@After
	public void quit() throws IOException
	{
		rep.endTest(test);
		rep.flush();
		Selenium.Screencapture();
	}

}
