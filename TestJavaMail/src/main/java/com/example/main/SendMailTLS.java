package com.example.main;
//package com.example.main;
// 
//import java.util.Properties;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.AddressException;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
// 
///**
// * @author Crunchify.com
// * 
// */
// 
//public class CrunchifyJavaMailExample {
// 
//	static Properties mailServerProperties;
//	static Session getMailSession;
//	static MimeMessage generateMailMessage;
// 
//	public static void main(String args[]) throws AddressException, MessagingException {
//		generateAndSendEmail();
//		System.out.println("\n\n ===> Your Java Program has just sent an Email successfully. Check your email..");
//	}
// 
//	public static void generateAndSendEmail() throws AddressException, MessagingException {
// 
//		// Step1
//		System.out.println("\n 1st ===> setup Mail Server Properties..");
//		mailServerProperties = System.getProperties();
//		mailServerProperties.put("mail.smtp.port", "465");
//		mailServerProperties.put("mail.smtp.auth", "true");
//		//mailServerProperties.put("mail.smtp.starttls.enable", "true");
//		System.out.println("Mail Server Properties have been setup successfully..");
// 
//		// Step2
//		System.out.println("\n\n 2nd ===> get Mail Session..");
//		getMailSession = Session.getDefaultInstance(mailServerProperties, null);
//		generateMailMessage = new MimeMessage(getMailSession);
//		generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress("gesner.ian@gmail.com"));
//		//generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress("test2@crunchify.com"));
//		generateMailMessage.setSubject("Greetings from Crunchify..");
//		String emailBody = "Test email by Crunchify.com JavaMail API example. " + "<br><br> Regards, <br>Crunchify Admin";
//		generateMailMessage.setContent(emailBody, "text/html");
//		System.out.println("Mail Session has been created successfully..");
// 
//		// Step3
//		System.out.println("\n\n 3rd ===> Get Session and Send mail");
//		Transport transport = getMailSession.getTransport("smtp");
// 
//		// Enter your correct gmail UserID and Password
//		// if you have 2FA enabled then provide App Specific Password
//		transport.connect("smtp.gmail.com", "villains.only.do.not.reply@gmail.com", "p4ssw0rd123");
//		transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
//		transport.close();
//	}
//}


import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailTLS {

	public static void main(String[] args) {

		final String username = "villains.only.do.not.reply@gmail.com";
		final String password = "p4ssw0rd123";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		
		int token = 1234;

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("gesner.ian@gmail.com"));
			message.setSubject("Testing Subject");
			message.setContent("Click " + "<a href=\"http://localhost:8090/VillainsOnly/resetPassword.app?email="
					+ "gesner.ian@gmail.com" + "&token=" + "1234" + "\">" + "here" + "</a>"
					+ " to reset your password.", "text/html; charset=utf-8");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}