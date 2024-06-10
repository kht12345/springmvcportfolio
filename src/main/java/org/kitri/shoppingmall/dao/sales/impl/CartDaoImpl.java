package org.kitri.shoppingmall.dao.sales.impl;

import org.kitri.shoppingmall.common.utils.AutoComplete;
import org.kitri.shoppingmall.dao.sales.ICartDao;
import org.kitri.shoppingmall.dto.master.Goods;
import org.kitri.shoppingmall.dto.sales.Cart;
import org.kitri.shoppingmall.dto.sales.CartDetails;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 */
@Repository
public class CartDaoImpl implements ICartDao {

	/**
	 * Default constructor
	 */
	public CartDaoImpl() {
	}

	/**
	 * 
	 */
	@Autowired
	public SqlSessionTemplate sqlSessionTemplate;

	/**
	 * @param goods
	 * @param cartno
	 * @return
	 */
	@Override
	@Transactional
	public int regCartGoods(Goods goods, String memberid) {
		Cart cart = new Cart();
		CartDetails cartDetails = new CartDetails();

		int cartno = sqlSessionTemplate.selectOne("cart.getcartno", memberid);
		int maxCartno = sqlSessionTemplate.selectOne("cart.getmaxcartno");

		if (cartno == 0 && maxCartno >= 1) {
			cartno = maxCartno + 1;
			cart.setCartno(cartno);
			cart.setMemberid(memberid);
			cart = (Cart) AutoComplete.completeStart(cart);
			sqlSessionTemplate.insert("cart.registercart", cart);
		} else if (cartno == 0 && maxCartno == 0) {
			cartno = 1;
			cart.setCartno(cartno);
			cart.setMemberid(memberid);
			cart = (Cart) AutoComplete.completeStart(cart);
			sqlSessionTemplate.insert("cart.registercart", cart);
		}

		int seq = sqlSessionTemplate.selectOne("cart.getseqno", cartno);
		if (seq == 0) { seq = 1; } else { seq += 1; }

		cartDetails.setSeq(seq);
		cartDetails.setCartno(cartno);
		cartDetails.setGoodscd(goods.getGoodscd());
		cartDetails.setPrice(goods.getPrice());
		cartDetails.setSalesquantity(1);

		int ret = sqlSessionTemplate.insert("cart.registercartdetails", cartDetails);

		if (ret == 1) return ret;
		else return 0;
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
	public Cart getCartGoodsList(String memberid) {
		// TODO implement here
		return null;
	}

	@Override
	public int updateCartDetailsGoods(CartDetails cartDetails) {
		return sqlSessionTemplate.update("cart.updatecartdetailsgoods", cartDetails);
	}

}