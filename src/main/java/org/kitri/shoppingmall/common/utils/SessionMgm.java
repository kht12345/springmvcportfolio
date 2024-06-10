package org.kitri.shoppingmall.common.utils;

import java.util.Enumeration;

import javax.servlet.http.HttpSession;

import org.kitri.shoppingmall.dto.master.Member;

/**
 * 
 */
public class SessionMgm {
	
	
	
    /**
     * @param id 
     * @param session 
     * @return
     */
    public static void setSessionValue(String key, String value, HttpSession session) {
    	session.setAttribute(key, value);
    }
    
    /**
     * @param id 
     * @param session 
     * @return
     */
    public static void setSessionMember(Member member, HttpSession session) {
    	session.setAttribute("memberid", member.getMemberid());
    	session.setAttribute("password", member.getPassword());
    	session.setAttribute("address", member.getAddress());
    	session.setAttribute("tel", member.getTel());
    	session.setAttribute("email", member.getEmail());
    	session.setAttribute("regdate", member.getRegdate());
    	session.setAttribute("status", member.getStatus());
    }
    
    /**
     * @param session 
     * @return
     */
    public static String getSessionValue(String key, HttpSession session) {
        return session.getAttribute(key).toString();
    }

    /**
     * @param key 
     * @return
     */
    public static void deleteSessionValue(String key, HttpSession session) {
        session.removeAttribute(key);
    }

    /**
     * @param key 
     * @return
     */
    public static void deleteSessionAllValues(HttpSession session) {
        Enumeration<String> sessele = session.getAttributeNames();
        while(sessele.hasMoreElements()) {
        	session.removeAttribute(sessele.nextElement());
        }
    }

    /**
     * @param key 
     * @return
     */
    public static void deleteSession(HttpSession session) {
    	session.invalidate();
    }
    
    /**
     * @param session 
     * @return
     */
    public static boolean isSessionValue(String key, HttpSession session) {
        if(session.getAttribute(key) != null) {
        	return true;
        }
        
        return false;
    }
  
}