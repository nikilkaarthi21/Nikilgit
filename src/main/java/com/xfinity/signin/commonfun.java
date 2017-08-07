package com.xfinity.signin;

import com.xfinity.connector.Contactutil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class commonfun {
	Contactutil Selenium=Contactutil.getInstance();
	@And("^I click on \"([^\"]*)\"$")
	public void I_click_on(String objectname)
	{ 
		Selenium.click(objectname);
	}
	
}
