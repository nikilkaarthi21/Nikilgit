package com.xfinity.connector;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.swing.text.StyleConstants.FontConstants;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.xfinity.contactus.ExtentManager;
import com.xfinity.contactus.Xls_Reader;

import cucumber.api.DataTable;

public class Contactutil {
	public Properties cons=null;
    WebDriver driver;
	WebDriver Chrome=null;
	static Contactutil E;
	Xls_Reader xls;
	String testcaseName="contactus";
   public ExtentReports rep=ExtentManager.getInstance();
	public ExtentTest test;
	
	
	private Contactutil()
	{ 
		if(cons==null){	
			try
			{
			   cons=new Properties();
			  FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\xfinity\\config\\cons.properties");
		      cons.load(fs);
		     System.out.println(cons.getProperty("SITE"));
		 // System.out.println(OR.getProperty("browser"));
	        } catch(Exception e){
		System.out.println("error in init properties"+e);
	   }
	   
	}
	}
	
	public void openbrowser(String browsertype)
	{  
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nikil kaarthi\\Downloads\\geckodriver.exe");
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\nikil kaarthi\\Downloads\\chromedriver.exe");
	    
		
	 //  System.out.println(env.get("browser"));
		if(browsertype.equals("Chrome"))
		{	
		    driver=new ChromeDriver();
		    
		}
		else if(browsertype.equals("mozilla"))
		{
			/**File pathToBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
			FirefoxProfile firefoxProfile = new FirefoxProfile();
			System.setProperty("webdriver.gecko.driver","C:\\Users\\nikil kaarthi\\Downloads\\geckodriver.exe");       
			WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);**/
			driver=new FirefoxDriver();
		}
	 else
	   {
		System.out.println("browser not found");
		}
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	}
	

	public void navigate(String SITE)
	{
		driver.get(cons.getProperty(SITE));
		System.out.println(SITE);
		
	}
	
	public static Contactutil getInstance()
	{
		if(E==null)
		 E= new Contactutil();
		 return E;
		
	}
	 public void Screencapture() throws IOException
	    {
		 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   
	       // String dest = System.getProperty("user.dir") +"test.png";
	        File destination = new File("C:/report/pass.png");
	        FileUtils.copyFile(src, destination);
	        
	    }
	
	public void type(String objectname,String text)
	{
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath((cons.getProperty(objectname)))).sendKeys(text);
	}

	public void click(String objectname)
	{
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  WebElement element = driver.findElement(By.xpath(cons.getProperty(objectname)));
      JavascriptExecutor executor = (JavascriptExecutor)driver;
	  executor.executeScript("arguments[0].click()", element);
		//driver.findElement(By.xpath((OR.getProperty(objectname)))).click();
		//driver.switchTo().frame("mainpanel");

	}
	
	public void select(DataTable D)
	{
		List<List<String>>data =D.raw();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(data.get(0).get(0));	
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys(data.get(0).get(1));


	}
	
}
