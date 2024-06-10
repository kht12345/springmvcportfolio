package org.kitri.shoppingmall.dto.sales;

/**
 * 
 */
public class CartDetails {

	/**
	 * 
	 */
	public int seq;

	/**
	 * 
	 */
	public int cartno;

	/**
	 * 
	 */
	public String goodscd;

	/**
	 * 
	 */
	public double price;

	/**
	 * 
	 */
	public int salesquantity;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getCartno() {
		return cartno;
	}

	public void setCartno(int cartno) {
		this.cartno = cartno;
	}

	public String getGoodscd() {
		return goodscd;
	}

	public void setGoodscd(String goodscd) {
		this.goodscd = goodscd;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSalesquantity() {
		return salesquantity;
	}

	public void setSalesquantity(int salesquantity) {
		this.salesquantity = salesquantity;
	}

}