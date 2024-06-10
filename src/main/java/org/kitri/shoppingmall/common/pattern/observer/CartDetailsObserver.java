package org.kitri.shoppingmall.common.pattern.observer;

import org.kitri.shoppingmall.dto.sales.CartDetails;
import org.kitri.shoppingmall.service.sales.ICartSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
public class CartDetailsObserver extends Observer {
	
	@Autowired
	private ICartSvc cartSvc;
	
//	public CartDetailsObserver(Subject subject) {
//		this.subject = subject;
//		this.subject.attach(this);
//	}

	@Override
	public void update(double price, int cartno, String goodscd) {
		CartDetails cartDetails = new CartDetails();
		cartDetails.setCartno(cartno);
		cartDetails.setGoodscd(goodscd);
		cartDetails.setPrice(price);
		cartSvc.updateCartDetailsGoods(cartDetails);
	}
}