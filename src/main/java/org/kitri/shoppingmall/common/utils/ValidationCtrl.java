package org.kitri.shoppingmall.common.utils;

import org.kitri.shoppingmall.dto.master.Member;
import org.kitri.shoppingmall.service.master.IMemberSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(origins = "*", methods = RequestMethod.GET)
public class ValidationCtrl {
	
	@Autowired
	IMemberSvc memberSvc;
	
	@RequestMapping("/validateUser")
	public @ResponseBody String validateUser(@RequestParam("memberid") String memberid) {
		Member member = memberSvc.getMemberDetails(memberid);
		String msg = "";
		if(member != null)
		{
			msg = memberid + " already exists";
		}
		
		return msg;
	}

}
