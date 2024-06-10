package org.kitri.shoppingmall.test;

import java.util.Random;

import org.apache.activemq.command.ActiveMQQueue;
import org.kitri.shoppingmall.common.system.jms.MessageSender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ActiveMQSpringApplication {

	private static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context = 
				new ClassPathXmlApplicationContext("org/kitri/shoppingmall/common/system/jms/bean.xml");
		
		final MessageSender messageSender = 
			(MessageSender)context.getBean("messageSender");
		
		System.out.println("Starting sending message...");

		int i = 0;
		while(true) {
            if (i % 5 == 0) {
                String message = "Generated random number: " + new Random().nextInt();
                messageSender.send(message);
            } else if (i % 3 == 0) {
                String message = "Generated random number: " + new Random().nextInt();
                messageSender.sendText(message);
            } else {
                String message = "Generated random number: " + new Random().nextInt();
                messageSender.send(new ActiveMQQueue("activemq_spring_xml_annotations_2"), message);
            }
            i++;			
		}
	}

}
