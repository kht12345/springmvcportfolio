package org.kitri.shoppingmall.dto.master;

/**
 * 
 */
public class Member {

	/**
	 * 
	 */
	public String memberid;

	/**
	 * 
	 */
	public String password;

	/**
	 * 
	 */
	public String name;

	/**
	 * 
	 */
	public String address;

	/**
	 * 
	 */
	public String tel;

	/**
	 * 
	 */
	public String email;

	/**
	 * 
	 */
	public String regdate;

	/**
	 * 
	 */
	public String status;

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getPassword() {
		return password;
	}

	public void setPasswd(String passwd) {
		this.password = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}