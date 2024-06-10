package org.kitri.shoppingmall.controller.process;

import org.kitri.shoppingmall.common.utils.SessionMgm;
import org.kitri.shoppingmall.controller.common.process.CartCtrlCommon;
import org.kitri.shoppingmall.dto.master.Goods;
import org.kitri.shoppingmall.service.sales.ICartSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 */
@Controller
public class CartCtrl extends CartCtrlCommon {
    
	@Autowired
	private ICartSvc cartSvc; 
	
    /**
     * @param goods 
     * @param cartno 
     * @return
     */
    @RequestMapping("/registercart")
    public String regCartGoods(@ModelAttribute("goods") Goods goods) {
    	if(isLogin()) {
    		setState();
    		System.out.println(getState());
    		cartSvc.regCartGoods(goods, 
    			SessionMgm.getSessionValue("memberid", getSession()));
    		// 서블릿 포워딩(forwarding)
   			return getPageReturnMethod().forwardPage("/goodslist");
    	} else {
    		// 페이지 포워딩(forwarding)
    		return "login/login";
    	}
    }

    /**
     * @param goodscd 
     * @param cartno 
     * @return
     */
    @RequestMapping("/updatecart")
    public String updateCartGoods(String memberid) {
        // TODO implement here
        return "";
    }

    /**
     * @param cartno 
     * @return
     */
    @RequestMapping("getcart")
    public String getCartGoods(String memberid) {
        // TODO implement here
        return "";
    }
}