package org.kitri.shoppingmall.service.master.impl;

import java.util.List;

import org.kitri.shoppingmall.dao.master.IMemberDao;
import org.kitri.shoppingmall.dto.master.Member;
import org.kitri.shoppingmall.service.master.IMemberSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class MemberSvcImpl implements IMemberSvc {

    /**
     * Default constructor
     */
    public MemberSvcImpl() {
    }

    /**
     * 
     */
    @Autowired
    private IMemberDao memberDao;

    /**
     * @param member 
     * @return
     */
    @Override
    public int regMember(Member member) {
    	return memberDao.regMember(member);
    }

    /**
     * @param member 
     * @return
     */
    @Override
    public int updateMember(Member member) {
        // TODO implement here
        return 0;
    }

    /**
     * @param memberid 
     * @return
     */
    @Override
    public Member getMyInfo(String memberid) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<Member> getMemberList() {
    	 return memberDao.getMemberList();
    }

    /**
     * @param memberid 
     * @return
     */
    @Override
    public Member getMemberDetails(String memberid) {
    	return memberDao.getMemberDetails(memberid);
    }

}