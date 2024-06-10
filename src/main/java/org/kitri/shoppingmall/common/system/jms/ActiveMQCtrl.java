package org.kitri.shoppingmall.common.system.jms;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ActiveMQCtrl {

	@Autowired
	MessageSender messageSender;
	
	@Autowired
	MessageReceiver messageReceiver;
	
	@Autowired
	HttpSession session;

	@RequestMapping("/jmsreceivemain")
	public String jmsReceiveMain() {
		
		return "common/jms/jmsreceivemain";
	}
	
	@RequestMapping("/jmsreceive")
	public @ResponseBody String jmsReceive() {
		
		return messageReceiver.getMessage();
	}

	@RequestMapping("/jmscreate")
	public String jmsCreate() {
		return "common/jms/jmscreate";
	}

	@RequestMapping("/jmsprocess")
	public String jmsprocess(@RequestParam String message,
			ModelMap model) {
		System.out.println("Starting sending message...");

		messageSender.send(message);
		model.addAttribute("success", "메시지전송완료");
		return "common/jms/jmscreate";
	}

}
