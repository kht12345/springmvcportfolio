package org.kitri.shoppingmall.controller.common.process;

import javax.servlet.http.HttpSession;

import org.kitri.shoppingmall.common.pattern.state.CartState;
import org.kitri.shoppingmall.common.pattern.state.Context;
import org.kitri.shoppingmall.common.system.PageReturnMethod;
import org.kitri.shoppingmall.common.utils.SessionMgm;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class ProcessCtrlCommon {
    /**
     * 
     */
    @Autowired
    private HttpSession session;
    
	@Autowired
    private Context context;
    
    @Autowired
    private CartState cartState;
    
    @Autowired
    private PageReturnMethod pageReturnMethod;
    
	// 세션(session) 확인
    public boolean isLogin() {
    	return SessionMgm.isSessionValue("memberid", session);
    }
    
    // 스패이트(state) 패턴 설정
    public void setState() {
    	cartState.doAction(context);
    }
    
    // 스패이트(state) 패턴 값 출력
    public String getState() {
    	return context.getState().toString();
    }  
    
    public HttpSession getSession() {
		return session;
	}

	public Context getContext() {
		return context;
	}

	public CartState getCartState() {
		return cartState;
	}
	
    public PageReturnMethod getPageReturnMethod() {
		return pageReturnMethod;
	}
}
