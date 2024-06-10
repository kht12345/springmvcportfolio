package org.kitri.shoppingmall.dto.order;

/**
 * 
 */
public class Order {

	/**
	 * 
	 */
	public int orderno;

	/**
	 * 
	 */
	public String employeeid;

	/**
	 * 
	 */
	public String isconfirm;

	/**
	 * 
	 */
	public String regdate;

	public int getOrderno() {
		return orderno;
	}

	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getIsconfirm() {
		return isconfirm;
	}

	public void setIsconfirm(String isconfirm) {
		this.isconfirm = isconfirm;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

}