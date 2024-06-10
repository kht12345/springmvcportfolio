package org.kitri.shoppingmall.dao.master.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.kitri.shoppingmall.dao.master.IMemberDao;
import org.kitri.shoppingmall.dao.master.IMemberNewDao;
import org.kitri.shoppingmall.dto.master.Member;
import org.kitri.shoppingmall.dto.master.PageInfo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 */
@Repository
public class MemberNewDaoImpl implements IMemberNewDao {

	/**
     * 
     */
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<Member> selectBoardList(PageInfo pageInfo) {
		int cPage= pageInfo.getcPage();
		int numPerpage= pageInfo.getNumPerPage();
		RowBounds rb = new RowBounds((cPage-1)*numPerpage,numPerpage);
		return sqlSessionTemplate.selectList("membernew.selectMemberList", null, rb);
	}

	@Override
	public int selectBoardCount() {

		return sqlSessionTemplate.selectOne("membernew.selectMemberount");
	}
}