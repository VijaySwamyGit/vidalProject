package com.qa.vidalhealth.sendMailWithAttachment;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class TriggerMail {

	public static void main(String[] args) {
		
			 
			// email ID of Recipient. 
			String recipient_TO = "swamy.99@gmail.com"; 
			String recipient_CC = "shilpa.paa@gmail.com"; 
			String recipient_BCC = "vijay@vidalhealthtpa.com"; 

			// email ID of Sender. 
			String sender = "swamy.99@gmail.com"; 

			// using host as localhost 
			String host = "10.1.0.3"; 

			// Getting system properties 
			Properties properties = System.getProperties(); 

			// Setting up mail server 
			properties.setProperty("mail.smtp.host", host); 

			// creating session object to get properties 
			Session session = Session.getDefaultInstance(properties); 

			try
			{ 
				// MimeMessage object. 
				MimeMessage message = new MimeMessage(session); 

				// Set From Field: adding senders email to from field. 
				message.setFrom(new InternetAddress(sender)); 

				// Set To Field: adding recipient's email to from field. 
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient_TO));
				message.addRecipient(Message.RecipientType.CC, new InternetAddress(recipient_CC));
				message.addRecipient(Message.RecipientType.BCC, new InternetAddress(recipient_BCC));

				   // Add the subject link
							message.setSubject("Expense Statement");
				 
							// Create object to add multimedia type content
							BodyPart messageBodyPart1 = new MimeBodyPart();
				 
							// Set the body of email
							messageBodyPart1.setText("Expense Statement");
									
							
							
				 
							// Create another object to add another content
						//	MimeBodyPart messageBodyPart2 = new MimeBodyPart();
							//MimeBodyPart messageBodyPart3 = new MimeBodyPart();
							//MimeBodyPart messageBodyPart4 = new MimeBodyPart();
							//MimeBodyPart messageBodyPart5 = new MimeBodyPart();
				 
							// Mention the file which you want to send
							//String emailable_report = "E:\\SVN-V3-automation\\Automation\\test-output\\emailable-report.html";
							//String gmailattachment = "C:\\Users\\vijay\\Desktop";
							//E:\old system's-D drive data\OTHERS\VIJAY\OTHERS\Miscellaneous\SM-HERITAGE
							String gmailattachment = "C:\\Users\\vijay\\Desktop\\0617exp.pdf";
				 
							// Create data source and pass the filename
							//DataSource source1 = new FileDataSource(emailable_report);
							DataSource source1 = new FileDataSource(gmailattachment);
							//DataSource source1 = new FileDataSource(emailable_report);
							//DataSource source2 = new FileDataSource(extent_report);
				 
							// set the handler
							messageBodyPart1.setDataHandler(new DataHandler(source1));
							//messageBodyPart3.setDataHandler(new DataHandler(source2));
							//messageBodyPart2.setDataHandler(new DataHandler(source1));
							//messageBodyPart3.setDataHandler(new DataHandler(source2));
				 
							// set the file
							//messageBodyPart2.setFileName(emailable_report);
							messageBodyPart1.setFileName(gmailattachment);
							
				 
							// Create object of MimeMultipart class
							Multipart multipart = new MimeMultipart();
				 
							// add body part 1
							multipart.addBodyPart(messageBodyPart1);
				 
							// add body part 2
						//	multipart.addBodyPart(messageBodyPart2);
							
						//	multipart.addBodyPart(messageBodyPart3);
				 
							// set the content
							message.setContent(multipart);
							
					
				 

				// Send email. 
				Transport.send(message); 
				System.out.println("Mail successfully sent"); 
			} 
			catch (MessagingException mex) 
			{ 
				mex.printStackTrace(); 
			} 
		} 
		
			//
			
		
		
		




	}


