package org.kitri.shoppingmall.controller.common.process;

import org.kitri.shoppingmall.dto.master.Goods;

public abstract class CartCtrlCommon extends ProcessCtrlCommon {
    /**
     * 
     */
    public abstract String regCartGoods(Goods goods);
    public abstract String updateCartGoods(String memberid);
    public abstract String getCartGoods(String memberid);
}
