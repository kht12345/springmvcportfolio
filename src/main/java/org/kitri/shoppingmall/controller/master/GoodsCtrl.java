package org.kitri.shoppingmall.controller.master;

import java.util.List;

import org.kitri.shoppingmall.controller.common.master.GoodsCtrlCommon;
import org.kitri.shoppingmall.dto.master.Goods;
import org.kitri.shoppingmall.service.master.IGoodsSvc;
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
public class GoodsCtrl extends GoodsCtrlCommon {
    /**
     * 
     */
    @Autowired
    private IGoodsSvc goodsSvc;
    
    /**
     * @param goods 
     * @return
     */
    @Override
    @RequestMapping("/goodsregister")
    public String regGoods(Goods goods) {
        // TODO implement here
        return null;
    }

    /**
     * @param goods 
     * @return
     */
    @Override
    @RequestMapping("/goodsupdate")
    public String updateGoods(@ModelAttribute("goods") Goods goods) {
    	if(isLogin()) {
    		goodsSvc.updateGoods(goods);
    		
    		// 가격 변경: 장바구니 가격도 변경 적용: 옵저버(Observer) 패턴 적용
    		//////////////////////////////////////////////
    		cartGoodsPriceUpdate(goods);
    		//////////////////////////////////////////////
    		// 서블릿 포워딩(forwarding)
   			return getPageReturnMethod()
   					.forwardPage("/goodslist");
    	} else {
    		// 페이지 포워딩(forwarding)
    		return "login/login";
    	}
    }

    /**
     * @return
     */
    @Override
    @RequestMapping("/goodslist")
    public String getGoodsList(ModelMap model) {
    	if(isLogin()) {
    		setState();
    		System.out.println(getState());
    		List<Goods> goodsList = goodsSvc.getGoodsList();
    		model.addAttribute("goodslist", goodsList);
   		 	return "goods/goodslist";
    	} else {
    		return "login/login";
    	}
    }

    /**
     * @param goodscd 
     * @return
     */
    @Override
    @RequestMapping("/goods")
    public String getGoodsDetails(
    	@RequestParam("goodscd") String goodscd, ModelMap model) {
    	if(isLogin()) {
    		
    		Goods goods = goodsSvc.getGoodsDetails(goodscd);
    		model.addAttribute("goods", goods);
    		return "goods/goods";
    	} else {
    		return "login/login";
    	}
    }

    /**
     * @param goodscd 
     * @return
     */
    @Override
    @RequestMapping("/searchgoods")
    public String getGoodsListBySearch(
    		@RequestParam("goodscd") String goodscd, ModelMap model) {
    	if(isLogin()) {
    		System.out.println(getState());
    		List<Goods> goodsList = goodsSvc.getGoodsListBySearch(goodscd);
    		model.addAttribute("goodslist", goodsList);
   		 	return "goods/goodslist";
    	} else {
    		return "login/login";
    	}   	
    }
}