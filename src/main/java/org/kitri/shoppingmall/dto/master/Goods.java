package org.kitri.shoppingmall.dto.master;

/**
 * 
 */
public class Goods {

	/**
	 * 
	 */
	public String goodscd;

	/**
	 * 
	 */
	public String goodsname;

	/**
	 * 
	 */
	public String description;

	/**
	 * 
	 */
	public String providercd;
	
	/**
	 * 
	 */
	public String providername;


	/**
	 * 
	 */
	public double price;

	/**
	 * 
	 */
	public String regdate;

	public String getGoodscd() {
		return goodscd;
	}

	public void setGoodscd(String goodscd) {
		this.goodscd = goodscd;
	}

	public String getGoodsname() {
		return goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProvidercd() {
		return providercd;
	}

	public void setProvidercd(String providercd) {
		this.providercd = providercd;
	}
	
	public String getProvidername() {
		return providername;
	}

	public void setProvidername(String providername) {
		this.providername = providername;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdatea) {
		this.regdate = regdatea;
	}

}