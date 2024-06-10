package org.kitri.shoppingmall.controller.common.master;

import java.util.ArrayList;
import java.util.List;

import org.kitri.shoppingmall.common.system.paging.APage;
import org.kitri.shoppingmall.dto.master.Member;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

public abstract class MemberCtrlCommon extends MasterCtrlCommon {
	
    public abstract String regMember(@ModelAttribute("member") Member member);
    public abstract int updateMember(Member member);
    public abstract Member getMyInfo(String memberid);
    public abstract String getMemberList(@RequestParam("type") String type, ModelMap model);
    public abstract Member getMemberDetails(Member memberid);
    
    public List<Object> pageConfiguration(List<Member> memList, String type) {
    	List<Object> objList = new ArrayList<Object>();
    	List<Object> retObjList = null;
    	
    	for(Member member : memList) {
    		objList.add((Object)member);
    	}
    	
    	getPageImpl().initPageConfig(objList);
    	
    	if(type.equals("0")) {
    		retObjList = (List<Object>)(getPageImpl().movePageProc(0, objList));
    	} else {
    		retObjList = (List<Object>)(getPageImpl().movePageProc(Integer.parseInt(type), objList));
    	}
    	
    	
        return retObjList;    	
    	
    }
    
    public List<Member> getPageContent(List<Object> retObject) {
    	List<Member> jspSendMemList = new ArrayList<Member>();
   		List<Object> retMemList = (List<Object>)(retObject.get(1));
   		if(retMemList.get(0) instanceof Member) {
   			for(Object object : retMemList) {
   				jspSendMemList.add((Member)object);
   			}
   		}
    	return jspSendMemList;
    }
}
