package com.xfinity.signin;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

import org.apache.commons.io.filefilter.FileFilterUtils;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.*;

 

public class SendMail

{
    public static void main(String[] args) throws Exception

    {
    	Properties cons=new Properties();
		try {
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//xfinity//config//cons.properties");
			cons.load(fs);
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//report folder - extent reports
		//date
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
                String[] to={"kesavan.ramasamy@gmail.com"};

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