package org.kitri.shoppingmall.common.system.paging;

import java.util.List;

import org.kitri.shoppingmall.dto.master.Member;

public class PageInfo {
	private int curPage;
	private List<Member> memberList;

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}

}
