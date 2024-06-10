package org.kitri.shoppingmall.common.system.mail;

import java.util.Properties;

import javax.servlet.http.HttpSession;

import org.kitri.shoppingmall.common.utils.SessionMgm;
import org.kitri.shoppingmall.dto.common.mail.EmailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailCtrl {
	
	@Autowired
	HttpSession session;
	
	@Autowired
	EmailSender emailSender;
	
	@RequestMapping("/mailpage")
	public String mailPage() {
		return "common/mail/mailpage";
	}
	
	@RequestMapping("/mailsend")
	public String mailSend(@ModelAttribute EmailDto emailDto, 
		ModelMap model) {
		String sender = SessionMgm.getSessionValue("email", session);
		String password = SessionMgm.getSessionValue("password", session);
		emailSender.sendMail(
				emailSender.mailConfig(new Properties(), 
				sender, password), 
				sender, emailDto.getReceiver(), 
				emailDto.getTitle(), 
				emailDto.getContents());		
		
		model.addAttribute("result", "메일전송성공");
		return "common/mail/success";
	}
}
