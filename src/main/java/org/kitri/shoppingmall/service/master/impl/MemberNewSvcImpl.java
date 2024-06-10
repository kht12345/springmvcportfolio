package org.kitri.shoppingmall.service.master.impl;

import java.util.List;

import org.kitri.shoppingmall.dao.master.IMemberNewDao;
import org.kitri.shoppingmall.dto.master.Member;
import org.kitri.shoppingmall.dto.master.PageInfo;
import org.kitri.shoppingmall.service.master.IMemberNewSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class MemberNewSvcImpl implements IMemberNewSvc {

    /**
     * Default constructor
     */
    public MemberNewSvcImpl() {
    }

    /**
     * 
     */
    @Autowired
    private IMemberNewDao memberNewDao;

	@Override
	public List<Member> selectMemberList(int cPage, int numPerPage) {		
		return memberNewDao.selectBoardList(new PageInfo(cPage, numPerPage));
	}

	@Override
	public int selectMemberCount() {
		return memberNewDao.selectBoardCount();
	}



}