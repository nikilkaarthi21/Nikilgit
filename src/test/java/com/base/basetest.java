package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zoho.ExtentManager;
import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.net.URL;
//import com.zoho.ExtentManager;


public class basetest {
	 
	public WebDriver driver;
	public Properties prop;
	public ExtentReports rep=ExtentManager.getInstance();
	public ExtentTest test;
	boolean gridrun=true;
	
	public void openbrowser(String dri)
	{	

		if(prop==null)
		{
			prop=new Properties();
			try{
		    FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\proper.properties");
				prop.load(fs);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println(prop.getProperty("appurl"));
		}
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nikil kaarthi\\Downloads\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",prop.getProperty("chromedriver"));
		if(dri.equals("mozilla"))
			driver =new FirefoxDriver();
			else if(dri.equals("chrome"))	
			 driver=new ChromeDriver();
			else if(dri.equals("IE"))
				driver=new InternetExplorerDriver();			
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		}
	
	public void geturl(String url)
	{
	 driver.get(prop.getProperty("appurl"));
	}
	
	public void waitForPageToLoad() {
		wait(1);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String state = (String)js.executeScript("return document.readyState");
		
		while(!state.equals("complete")){
			wait(2);
			state = (String)js.executeScript("return document.readyState");
		}
	}
	
	public void wait(int timeToWaitInSec){
		try {
			Thread.sleep(timeToWaitInSec * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		
public void type(String xpath,String data){
			test.log(LogStatus.INFO, "Tying in "+xpath+". Data - "+data);
			locator(xpath).sendKeys(data);
       
	}
public boolean doLogin(String username,String password)
{
	waitForPageToLoad();
	wait(1);
	driver.switchTo().frame(0);
	type("loginidxpath",username);
	type("passwordxpath",password);
	//if(isElementpresent("appurl")){
	//	test.log(LogStatus.INFO, "Login Success");
	//	return true;
	//}
	//else{
		test.log(LogStatus.INFO, "Login Failed");
		return false;
	
	
	
}
public void click(String xpath)
{     test.log(LogStatus.INFO,"IN CLICK FUNCTION");
	  locator(xpath).click();
	// locator("button").click();
	
}

public void returnfailure(String fail)
{
	
    // ExtentTest test;

//  test.log(LogStatus.FAIL, fail);
takescreenshot();
Assert.fail(fail);
}

public WebElement locator(String xpath)
{
	WebElement e =null;
	try
	{
	 if(xpath.endsWith("xpath"))
		e=driver.findElement(By.xpath(prop.getProperty(xpath)));
		
	else{
		returnfailure("locator not found"+xpath);
		Assert.fail("error is"+xpath);		
	}
	} catch(Exception ex){
		returnfailure(ex.getMessage());
		ex.printStackTrace();
		Assert.fail("error is"+ex.getMessage());				
	}
	
	return e;
	
}  

public boolean isElementpresent(String xpath)
{
	List<WebElement> list=null;

   if(xpath.endsWith("xpath"))
		list=driver.findElements(By.xpath(prop.getProperty(xpath)));
	
	else{
		returnfailure("locator not found"+xpath);
		Assert.fail("error is"+xpath);				
	}
	if(list.size()==0)
	
		return false;
		else
			return true;
	
}  

public void takescreenshot()
{
	Date d=new Date();
	String screenshotFile=d.toString().replace(":", "_").replace(" ", "_")+".png";
	//String filePath=FontConstants.REPORTS_PATH+"screenshots//"+screenshotFile;
	// store screenshot in that file
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//test.log(LogStatus.FAIL,"Screeenshot"+test.addScreenCapture("C:\\test.jpg"));
}


public int getLead(String Lead)
{
	List<WebElement>list=driver.findElements(By.xpath(prop.getProperty("selectLeadxpath")));
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().equals(Lead))
		return (i+1);
		}
	return -1;	
}
public void clickonLead(String Lead)
{
int rnum=getLead(Lead);
	System.out.println("Lead is"+Lead);
	driver.findElement(By.xpath(prop.getProperty("lead1xpath")+rnum+prop.getProperty("lead2xpath"))).click();
}

public void deletelead(String Lead)
{
	int rnum1=getLead(Lead);
	driver.findElement(By.xpath(prop.getProperty("delete1xpath")+rnum1+prop.getProperty("delete2xpath"))).click();
}

public void acceptAlert()
{
	WebDriverWait wait=new WebDriverWait(driver,5);
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	driver.switchTo().defaultContent();
}


}

