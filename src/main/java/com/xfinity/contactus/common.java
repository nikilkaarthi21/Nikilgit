package com.xfinity.contactus;



import com.xfinity.connector.Contactutil;

import cucumber.api.java.en.And;



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
