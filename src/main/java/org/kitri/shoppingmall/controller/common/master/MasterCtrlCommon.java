package org.kitri.shoppingmall.controller.common.master;

import javax.servlet.http.HttpSession;

import org.kitri.shoppingmall.common.pattern.state.Context;
import org.kitri.shoppingmall.common.pattern.state.GoodsState;
import org.kitri.shoppingmall.common.system.paging.PageImpl;
import org.kitri.shoppingmall.common.system.PageReturnMethod;
import org.kitri.shoppingmall.common.utils.SessionMgm;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class MasterCtrlCommon {
    /**
     * 
     */
    @Autowired
    private HttpSession session;
    
	@Autowired
    private Context context;
    
    @Autowired
    private GoodsState goodsState;
    
    @Autowired
    private PageReturnMethod pageReturnMethod;
    
    /**
     * 
     */
    @Autowired
    private PageImpl pageImpl;
    
	// 세션(session) 확인
    public boolean isLogin() {
    	return SessionMgm.isSessionValue("memberid", session);
    }
    
    // 스패이트(state) 패턴 설정
    public void setState() {
    	goodsState.doAction(context);
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

	public GoodsState getGoodsState() {
		return goodsState;
	}
	
    public PageReturnMethod getPageReturnMethod() {
		return pageReturnMethod;
	}
    
	public PageImpl getPageImpl() {
		return pageImpl;
	}

}
