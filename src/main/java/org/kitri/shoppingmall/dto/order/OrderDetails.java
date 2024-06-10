package org.kitri.shoppingmall.dto.order;

/**
 * 
 */
public class OrderDetails {

	/**
	 * 
	 */
	public int seq;

	/**
	 * 
	 */
	public int orderno;

	/**
	 * 
	 */
	public String goodscd;

	/**
	 * 
	 */
	public int odrquantity;

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getOrderno() {
		return orderno;
	}

	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}

	public String getGoodscd() {
		return goodscd;
	}

	public void setGoodscd(String goodscd) {
		this.goodscd = goodscd;
	}

	public int getOdrquantity() {
		return odrquantity;
	}

	public void setOdrquantity(int odrquantity) {
		this.odrquantity = odrquantity;
	}

}