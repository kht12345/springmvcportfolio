package org.kitri.shoppingmall.controller.master;

import java.util.List;

import org.kitri.shoppingmall.common.system.paging.PageFactory;
import org.kitri.shoppingmall.dto.master.Member;
import org.kitri.shoppingmall.service.master.IMemberNewSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 */
@Controller
public class MemberPageFactoryCtrl {

    @Autowired
    private IMemberNewSvc memberNewSvc;

    @RequestMapping("/selectMemberAll")
	public String memberList(@RequestParam(value="cPage",defaultValue = "1") int cPage
			, @RequestParam(value="numPerpage",defaultValue = "3") int numPerPage, ModelMap model) {
    	
    	System.out.println(cPage + ":" + numPerPage);
		List<Member> members = memberNewSvc.selectMemberList(cPage,numPerPage);
		int totalData = memberNewSvc.selectMemberCount();
		
		// 페이징처리
		
		model.addAttribute("pageBar",PageFactory.getPage(cPage, numPerPage, totalData,"selectMemberAll"));
		model.addAttribute("memberlist",members);
		model.addAttribute("totalData",totalData);
        
		return "member/selectmemberlist";
	}
}