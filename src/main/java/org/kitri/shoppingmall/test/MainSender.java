package org.kitri.shoppingmall.test;

import java.util.Properties;

import org.kitri.shoppingmall.common.system.mail.EmailSender;

public class MainSender {

	public static void main(String[] args) {
		String title = "테스트 메일";
		String content = "안녕하세요.\n 이것은 테스트2 메일입니다.";
		String sender = "kimhtpae@gmail.com";
		String password = "gudxorla#69";
		String receiver = "dwoseven@daum.net";
		
		EmailSender emailSender = new EmailSender();
		emailSender.sendMail(
				emailSender.mailConfig(new Properties(), 
				sender, password), sender, receiver, title, content);
	}

}
