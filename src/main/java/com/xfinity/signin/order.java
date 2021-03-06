package com.xfinity.signin;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.xfinity.connector.Contactutil;
import com.xfinity.contactus.ExtentManager;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class order {
Contactutil Selenium=Contactutil.getInstance();
WebDriver driver;
Properties cons;
public ExtentReports rep=ExtentManager.getInstance();
public ExtentTest test;
	
@And("^I Enter the \"([^\"]*)\"$")
public void I_Enter_the(String objectname,DataTable D)

{
	test=rep.startTest("order");
	test.log(LogStatus.INFO,"Signintest");
    test.log(LogStatus.PASS,"snapshot below"+test.addScreenCapture("C:/report/pass.png"));
	Selenium.select(objectname,D);
	Selenium.sendMail();
}
@Then("^the order should be \"([^\"]*)\"$")
public void the_order_should_be(String objectname)
{
	Selenium.IsElementPresent(objectname);
}
}
