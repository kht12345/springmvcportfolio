package org.kitri.shoppingmall.service.master;

import java.util.List;

import org.kitri.shoppingmall.dto.master.Member;

/**
 * 
 */
public interface IMemberNewSvc {

	public List<Member> selectMemberList(int cPage, int numPerPage);

	public int selectMemberCount();

}