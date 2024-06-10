package org.kitri.shoppingmall.controller.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LogInCtrl {
		
	// 고객 정보 조회 후 확인 버튼 누르면 나오는 페이지
	@RequestMapping(value = "/cSuccess")
	public String cSuccessPage(HttpServletRequest req, Model model) {
		
		model.addAttribute("msg", "홍길동");		
		return "test/main";
	}
			
	
	// 호텔 정보 조회 후 확인 버튼 누르면 나오는 페이지
	@RequestMapping(value = "/hSuccess")
	public String hSuccessPage(HttpServletRequest req, Model model) {
		System.out.println("test");
		model.addAttribute("msg", "한길동");
		
		return "test/main";
	}
	
}