package org.kitri.shoppingmall.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestCtrl {

	@RequestMapping("/test")
	public String test() {
		return "index";
	}
	
	@RequestMapping("/send")
	public String send() {
		return "send";
	}
}
