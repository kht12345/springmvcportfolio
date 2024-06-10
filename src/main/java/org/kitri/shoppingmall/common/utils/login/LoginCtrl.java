package org.kitri.shoppingmall.common.utils.login;

import javax.servlet.http.HttpSession;

import org.kitri.shoppingmall.common.pattern.state.Context;
import org.kitri.shoppingmall.common.pattern.state.LoginState;
import org.kitri.shoppingmall.common.utils.SessionMgm;
import org.kitri.shoppingmall.dto.master.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 */
@Controller
public class LoginCtrl {

	@Autowired
	private LoginSvc loginSvc;
	
    @Autowired
    private HttpSession session;
    
    @Autowired
    private Context context;
    
    @Autowired
    private LoginState loginState;
 
    @RequestMapping("/login")
    public String login() {
		return "login/login";
    } 
    
    @RequestMapping("/loginprocess")
    public String login(@RequestParam("memberid") String memberid, 
    	@RequestParam("password") String password, ModelMap model) {
   		Member member = memberAuth(memberid, password);
   		if(member == null) {
   			return "login/login";
   		} else {
   			// 스태이트 패턴(state pattern)
   			//////////////////////////////////////
   			loginState.doAction(context);
   			System.out.println(context.getState());
   			//////////////////////////////////////
   			SessionMgm.setSessionMember(member, session);
   			model.addAttribute("member", member);
   			return "login/main";
   		}
    }
 
    @RequestMapping("/logout")
    public String logout() {
    	SessionMgm.deleteSessionAllValues(session);
    	SessionMgm.deleteSession(session);
    	
    	return "login/login";
    }
    
    /**
     * @param id 
     * @param passwd 
     * @return
     */
    private Member memberAuth(String id, String password) {
    	Member member = new Member();
    	member.setMemberid(id);
    	member.setPasswd(password);
    	return loginSvc.getMemberDetails(member);
    }
}