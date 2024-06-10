package org.kitri.shoppingmall.dto.sales;

/**
 * 
 */
public class Sales {

	/**
	 * 
	 */
	public int buyno;

	/**
	 * 
	 */
	public String memberid;

	/**
	 * 
	 */
	public String paytype;

	/**
	 * 
	 */
	public double payamount;

	/**
	 * 
	 */
	public String regdate;

	public int getBuyno() {
		return buyno;
	}

	public void setBuyno(int buyno) {
		this.buyno = buyno;
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getPaytype() {
		return paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public double getPayamount() {
		return payamount;
	}

	public void setPayamount(double payamount) {
		this.payamount = payamount;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

}