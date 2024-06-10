package org.kitri.shoppingmall.controller.common.master;

import org.kitri.shoppingmall.common.pattern.observer.CartDetailsObserver;
import org.kitri.shoppingmall.common.pattern.observer.Subject;
import org.kitri.shoppingmall.dto.master.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

public abstract class GoodsCtrlCommon extends MasterCtrlCommon {
    /**
     * 
     */
    @Autowired
    private Subject subject;
    
    @Autowired
    private CartDetailsObserver cartDetailsObserver;	
	
    public abstract String regGoods(Goods goods);
    public abstract String updateGoods(Goods goods);
    public abstract String getGoodsList(ModelMap model);
    public abstract String getGoodsDetails(@RequestParam("goodscd") String goodscd, ModelMap model);
    public abstract String getGoodsListBySearch(@RequestParam("goodscd") String goodscd, ModelMap model);
    
    public void cartGoodsPriceUpdate(Goods goods) {
    	cartDetailsObserver.setSubject(subject);
    	subject.attach(cartDetailsObserver);
    	subject.setGoodscd(goods.getGoodscd());
    	subject.setPrice(goods.getPrice());
    }
}
