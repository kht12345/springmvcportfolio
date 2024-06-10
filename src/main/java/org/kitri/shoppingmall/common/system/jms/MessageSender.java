package org.kitri.shoppingmall.common.system.jms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	public void send(final String text) {
		jmsTemplate.send(new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				Message message = session.createTextMessage(text);
				message.setJMSReplyTo(new ActiveMQQueue("activemq_spring_xml_reply"));			
				return message;
			}
		});
	}
	
	public void send(final Destination destination, 
		final String text) {
		jmsTemplate.send(destination, new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(text);
			}
		});
	}
	
	public void sendText(final String text) {
		jmsTemplate.convertAndSend(text);
	}
}
