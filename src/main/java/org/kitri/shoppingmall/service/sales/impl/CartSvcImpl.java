package org.kitri.shoppingmall.service.sales.impl;

import org.kitri.shoppingmall.dao.sales.ICartDao;
import org.kitri.shoppingmall.dto.master.Goods;
import org.kitri.shoppingmall.dto.sales.Cart;
import org.kitri.shoppingmall.dto.sales.CartDetails;
import org.kitri.shoppingmall.service.sales.ICartSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 */
@Service
public class CartSvcImpl implements ICartSvc {

    /**
     * 
     */
    @Autowired
    private ICartDao carDao;
    
    /**
     * @param goods 
     * @param cartno 
     * @return
     */
    @Override
    @Transactional
    public int regCartGoods(Goods goods, String memberid) {
        return carDao.regCartGoods(goods, memberid);
    }

    /**
     * @param goodscd 
     * @param cartno 
     * @return
     */
    @Override   
    @Transactional
    public int updateCartGoods(String memberid) {
        // TODO implement here
        return 0;
    }

    /**
     * @param cartno 
     * @return
     */
    @Override    
    public Cart getCartGoods(String memberid) {
        // TODO implement here
        return null;
    }

	@Override
	public int updateCartDetailsGoods(CartDetails cartDetails) {
		return carDao.updateCartDetailsGoods(cartDetails);
	}

}