package org.kitri.shoppingmall.dao.master;

import java.util.List;

import org.kitri.shoppingmall.dto.master.Member;
import org.kitri.shoppingmall.dto.master.PageInfo;

/**
 * 
 */
public interface IMemberNewDao {


 	public List<Member> selectBoardList(PageInfo pageInfo);

	public int selectBoardCount();

}