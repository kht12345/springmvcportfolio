package org.kitri.shoppingmall.common.system.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.stereotype.Service;

@Service
public class MessageReceiver implements MessageListener {

	private String message; 
	
	@Override
	public void onMessage(Message message) {
		ActiveMQTextMessage activeMQTextMessage = (ActiveMQTextMessage) message;
		try {
			System.out.println(activeMQTextMessage.getText());
			setMessage(activeMQTextMessage.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
