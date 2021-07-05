package com.qa.vidalhealth.sendMailWithAttachment;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

//import  com.sun.mail.smtp.SMTPSendFailedException;

public class SendMailWithAttachment {
	 
	public static void main(String[] args) {
		
		
		
 
		/// Getting system properties 
		Properties properties = System.getProperties(); 
		
		//props.put("mail.smtp.starttls.enable", "true");
 
		// this will set host of server- you can change based on your requirement 
		//props.pu
		properties.put("mail.smtp.host", "smtp-mail.outlook.com");
 
		// set the port of socket factory 
		properties.put("mail.smtp.socketFactory.port", "587");
 
		// set socket factory
		properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
 
		// set the authentication to true
		properties.put("smtp-mail.outlook.com", "true");
 
		// set the port of SMTP server
		properties.put("mail.smtp.port", "587");
 
		
		//Session session = Session.getDefaultInstance(properties); 
		// This will handle the complete authentication
		Session session = Session.getDefaultInstance(properties,
 
				new javax.mail.Authenticator() {
 
					protected PasswordAuthentication getPasswordAuthentication() {
 
					return new PasswordAuthentication("vijay@vidalhealthtpa.com", "Vijay@123");
 
					}
 
				});
 
		try {
		
		
 
			// Create object of MimeMessage class
			Message message = new MimeMessage(session);
 
			// Set the from address
			message.setFrom(new InternetAddress("vijay@vidalhealthtpa.com"));
 
			// Set the recipient address
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("vijay@vidalhealthtpa.com"));
            
                        // Add the subject link
			message.setSubject("Automation Test Report");
 
			// Create object to add multimedia type content
			BodyPart messageBodyPart1 = new MimeBodyPart();
 
			// Set the body of email
			messageBodyPart1.setText("Attached the automation Test report, Please go through & give your feedback");
 
			// Create another object to add another content
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();
 
			// Mention the file which you want to send
			String filename = "E:\\SVN-V3-automation\\Automation\\test-output\\emailable-report.html";
 
			// Create data source and pass the filename
			DataSource source = new FileDataSource(filename);
 
			// set the handler
			messageBodyPart2.setDataHandler(new DataHandler(source));
 
			// set the file
			messageBodyPart2.setFileName(filename);
 
			// Create object of MimeMultipart class
			Multipart multipart = new MimeMultipart();
 
			// add body part 1
			multipart.addBodyPart(messageBodyPart2);
 
			// add body part 2
			multipart.addBodyPart(messageBodyPart1);
 
			// set the content
			message.setContent(multipart);
 
			// finally send the email
			Transport.send(message);
 
			System.out.println("=====Email Sent=====");
 
		} catch (MessagingException e) {
 
			throw new RuntimeException(e);
 
		}
 
	}
 
}
