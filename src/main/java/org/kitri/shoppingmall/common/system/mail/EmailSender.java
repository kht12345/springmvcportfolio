package org.kitri.shoppingmall.common.system.mail;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Component;

@Component
public class EmailSender {
	final String ENCODING = "UTF-8";
	final String PORT = "465";
	final String SMTPHOST = "smtps.gmail.com";
	
	public Session mailConfig(Properties props, String sender, String password) {
		
		Session session = null;
		
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtps.host", SMTPHOST);
		props.put("mail.smtps.port", PORT);
		props.put("mail.smtps.auth", true);
		props.put("mail.smtps.ssl.enable", true);
		props.put("mail.smtps.ssl.trust", SMTPHOST);
		props.put("mail.smtps.starttls.required", true);
		props.put("mail.smtps.starttls.enable", true);
		props.put("mail.smtps.ssl.protocol", "TLSv1.2");
		
		props.put("mail.smtps.quit-wait", "false");
		props.put("mail.smtps.socketFactory.port", PORT);
		props.put("mail.smtps.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtps.socketFactory.fallback", "false");
		
		session = Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(sender, password);
			} 
		});
		
		return session;
	}
	
	public void sendMail(Session session, String sender, String receiver, String title, String content) {
		Message msg = new MimeMessage(session);
		
		try {
			msg.setFrom(new InternetAddress(sender, "관리자", ENCODING));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(receiver));
			msg.setSubject(title);
			msg.setContent(content, "text/html; charset=utf-8");
			
			Transport.send(msg);
			
			System.out.println("메일 보내기 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 }
