package org.kitri.shoppingmall.dto.stock;

/**
 * 
 */
public class Stock {

	/**
	 * 
	 */
	public String goodscd;

	/**
	 * 
	 */
	public int quantity;

	/**
	 * 
	 */
	public String regdate;

	/**
	 * 
	 */
	public String updatedate;

	public String getGoodscd() {
		return goodscd;
	}

	public void setGoodscd(String goodscd) {
		this.goodscd = goodscd;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

}