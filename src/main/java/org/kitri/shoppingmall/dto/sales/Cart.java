package org.kitri.shoppingmall.dto.sales;

/**
 * 
 */
public class Cart {

	/**
	 * 
	 */
	public int cartno;

	/**
	 * 
	 */
	public String memberid;

	/**
	 * 
	 */
	public String regdate;

	public int getCartno() {
		return cartno;
	}

	public void setCartno(int cartno) {
		this.cartno = cartno;
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

}