package org.kitri.shoppingmall.dao.sales;

import org.kitri.shoppingmall.dto.master.Goods;
import org.kitri.shoppingmall.dto.sales.Cart;
import org.kitri.shoppingmall.dto.sales.CartDetails;

/**
 * 
 */
public interface ICartDao {


	
    /**
     * @param goods 
     * @param cartno 
     * @return
     */
    public int regCartGoods(Goods goods, String memberid);

    /**
     * @param goodscd 
     * @param cartno 
     * @return
     */
    public int updateCartGoods(String memberid);

    /**
     * @param cartno 
     * @return
     */
    public Cart getCartGoodsList(String memberido);
    
    public int updateCartDetailsGoods(CartDetails cartDetails);

}