package org.kitri.shoppingmall.dto.master;

public class PageInfo {
	private int cPage;
	private int numPerPage;

	
	public PageInfo() {}

	public PageInfo(int cPage, int numPerPage) {
		this.cPage = cPage;
		this.numPerPage = numPerPage;
	}

	public int getcPage() {
		return cPage;
	}

	public void setcPage(int cPage) {
		this.cPage = cPage;
	}

	public int getNumPerPage() {
		return numPerPage;
	}

	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}

}
