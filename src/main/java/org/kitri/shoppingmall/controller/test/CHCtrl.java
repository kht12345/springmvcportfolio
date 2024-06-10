package org.kitri.shoppingmall.controller.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CHCtrl {
		
	// 고객 정보 조회 후 확인 버튼 누르면 나오는 페이지
	@RequestMapping(value = "/cpage")
	public String cSuccessPage() {
		
	
		return "test/cMyInfoForm";
	}
			
	// 호텔 정보 조회 후 확인 버튼 누르면 나오는 페이지
	@RequestMapping(value = "/hpage")
	public String hSuccessPage(HttpServletRequest req, Model model) {
			
		return "test/hMyInfoForm";
	}
	
}