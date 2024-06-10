package org.kitri.shoppingmall.controller.master;

import java.util.List;

import org.kitri.shoppingmall.common.utils.AutoComplete;
import org.kitri.shoppingmall.common.utils.Validation;
import org.kitri.shoppingmall.controller.common.master.MemberCtrlCommon;
import org.kitri.shoppingmall.dto.master.Member;
import org.kitri.shoppingmall.service.master.IMemberSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 */
@Controller
public class MemberCtrl extends MemberCtrlCommon {
    /**
     * 
     */
    @Autowired
    private IMemberSvc memberSvc;

    /**
     * @param member 
     * @return
     */
    @RequestMapping("/regmember")
    public String regMember(@ModelAttribute("member") Member member) {
    	if(member.memberid == null) {
    		return "member/registermember";
    	} else {
    		if(Validation.dupulicateCheck(member, memberSvc)) {
    			return "member/registermember";    			
    		} else {
    			Member mem = (Member)AutoComplete.completeStart(member);
    			if( memberSvc.regMember(mem) == 1) {
        			return "login/login";
        		} else {
        			return "member/registermember";
        		}
    		}
    	}
    }

    /**
     * @param member 
     * @return
     */
    public int updateMember(Member member) {
        // TODO implement here
        return 0;
    }

    /**
     * @param memberid 
     * @return
     */
    public Member getMyInfo(String memberid) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    @RequestMapping("/memberlist")
    public String getMemberList(@RequestParam("type") String type, ModelMap model) {
    	List<Member> memList = memberSvc.getMemberList();
    	
    	// 페이지 처리 부분
    	////////////////////////////////////////////////////////
    	List<Object> retObjList = pageConfiguration(memList, type);
   		model.addAttribute("curpage", (String)retObjList.get(0));
   		List<Member> jspSendMemList = getPageContent(retObjList);
   		////////////////////////////////////////////////////////
   		model.addAttribute("memberlist", jspSendMemList);	

        return "member/memberlist";
    }

    /**
     * @param memberid 
     * @return
     */
    public Member getMemberDetails(Member memberid) {
        // TODO implement here
        return null;
    }
}