package com.xfinity.connector;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

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
	
	public void select(String objectname,DataTable D)
	{
		List<List<String>>data =D.raw();
		driver.findElement(By.xpath(cons.getProperty(objectname))).sendKeys(data.get(0).get(0));	
		//driver.findElement(By.xpath(cons.getProperty(objectname))).sendKeys(data.get(1).get(1));


	}
	public boolean IsElementPresent(String objectname)
	{
		String actual="Sign out";
		String Expected=driver.findElement(By.xpath(cons.getProperty(objectname))).getText();
	 //   String element="signout";
		if(Expected.equals(actual))
		{
		 System.out.println("Element is present");
		
		 return true;
		}
		else
		{
			System.out.println("Element not present");
		return false;
		}
	}
	
	public void sendMail()
	{
		String reportFolder=cons.getProperty("reportFolder");
   	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        FileFilterUtils filter = new FileFilterUtils();
        File folder =  new File(reportFolder);
        File files[] = folder.listFiles();
    
       //date
        
        String fileName=files[files.length-1].getName();
        String extentFilePath=reportFolder+fileName;
  //      String xsltReportPath=reportFolder+"Reports.zip";
        
        // mail extent reports
               String[] to={"shanthi.jayaraman7@gmail.com"};

               String[] cc={};
               String[] bcc={};

               //This is for yahoo

               sendMail("shanthi_7583@yahoo.com",
               		            "7@oracle",
               		            "smtp.mail.yahoo.com",
               		            "587",
               		            "true",
               		            "true",
               		            true,
               		            "javax.net.ssl.SSLSocketFactory",
               		            "false",
               		            to,
               		            cc,
               		            bcc,
               		            "Automation Test Reports - Extent",
               		            "Please find the reports attached.\n\n Regards\nWebMaster",
               		            extentFilePath,
               		            fileName);
               
             /**8  // mail the xslt reports
               Zip.zipDir(System.getProperty("user.dir")+"//XSLT_Reports", xsltReportPath);
               SendMail.sendMail("vaibhavcool12312@yahoo.com",
   		            "Pass@123",
   		            "smtp.mail.yahoo.com",
   		            "25",
   		            "true",
   		            "true",
   		            true,
   		            "javax.net.ssl.SSLSocketFactory",
   		            "false",
   		            to,
   		            cc,
   		            bcc,
   		            "Automation Test Reports - XSLT",
   		            "Please find the reports attached.\n\n Regards\nWebMaster",
   		            xsltReportPath,
   		            "Reports.zip");**/

   }



       public  static boolean sendMail(
       		final String userName,
       		final String passWord,
       		String host,
       		String port,
       		String starttls,
       		String auth,
       		boolean debug,
       		String socketFactoryClass,
       		String fallback,
       		String[] to,
       		String[] cc,
       		String[] bcc,
       		String subject,
       		String text,
       		String attachmentPath,
       		String attachmentName){



       	Properties props = new Properties();
           props.put("mail.smtp.starttls.enable", starttls);
           props.put("mail.smtp.auth",auth);
           props.put("mail.smtp.host", host);
           props.put("mail.smtp.port", port);

       try

       {

       	Session session = Session.getInstance(props,
       	          new javax.mail.Authenticator() {
       	            protected PasswordAuthentication getPasswordAuthentication() {
       	                return new PasswordAuthentication(userName, passWord);
       	            }
       	          });

           MimeMessage msg = new MimeMessage(session);

           msg.setText(text);

           msg.setSubject(subject);
           //attachment start
           // create the message part 
          
           Multipart multipart = new MimeMultipart();
           MimeBodyPart messageBodyPart = new MimeBodyPart();
           DataSource source = 
             new FileDataSource(attachmentPath);
           messageBodyPart.setDataHandler(
             new DataHandler(source));
           messageBodyPart.setFileName(attachmentName);
           multipart.addBodyPart(messageBodyPart);
           
           // attachment ends

           // Put parts in message
           msg.setContent(multipart);
           msg.setFrom(new InternetAddress(userName));

                       for(int i=0;i<to.length;i++){

           msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to[i]));

                       }

                       for(int i=0;i<cc.length;i++){

           msg.addRecipient(Message.RecipientType.CC, new InternetAddress(cc[i]));

                       }

                       for(int i=0;i<bcc.length;i++){

           msg.addRecipient(Message.RecipientType.BCC, new InternetAddress(bcc[i]));

                       }

           msg.saveChanges();

                       Transport transport = session.getTransport("smtp");

                       transport.connect(host,userName,passWord);

                       transport.sendMessage(msg,msg.getAllRecipients());

                       transport.close();

                       return true;

       }

       catch (Exception mex)

       {

           mex.printStackTrace();

                       return false;

       }

       }


	}

