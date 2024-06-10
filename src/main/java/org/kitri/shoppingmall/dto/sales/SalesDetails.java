package org.kitri.shoppingmall.dto.sales;

/**
 * 
 */
public class SalesDetails {

	/**
	 * 
	 */
	public int seq;

	/**
	 * 
	 */
	public int buyno;

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

	public int getBuyno() {
		return buyno;
	}

	public void setBuyno(int buyno) {
		this.buyno = buyno;
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