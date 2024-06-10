package org.kitri.shoppingmall.common.utils;

import org.kitri.shoppingmall.dto.master.Member;
import org.kitri.shoppingmall.service.master.IMemberSvc;

public class Validation {
	
	public static boolean dupulicateCheck(Member member, 
		IMemberSvc memberSvc) {
		if(memberSvc.getMemberDetails(member.getMemberid()) != null) {
			return true;
		} else {
			return false;
		}
	}	
}
