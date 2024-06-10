package org.kitri.shoppingmall.dao.master.impl;

import java.util.List;

import org.kitri.shoppingmall.dao.master.IMemberDao;
import org.kitri.shoppingmall.dto.master.Member;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 */
@Repository
public class MemberDaoImpl implements IMemberDao {

	/**
     * 
     */
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    /**
     * @param member 
     * @return
     */
    @Override
    @Transactional
    public int regMember(Member member) {
        return sqlSessionTemplate.insert("member.registerMember", member);
    }

    /**
     * @param member 
     * @return
     */
    @Override
    @Transactional
    public int updateMember(Member member) {
        // TODO implement IMemberDao.updateMember() here
        return 0;
    }

    /**
     * 
     */
    @Override
    public void login() {
    	
    }

    /**
     * @param memberid 
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public Member getMyInfo(String memberid) {
        // TODO implement IMemberDao.getMyInfo() here
        return null;
    }

    /**
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public List<Member> getMemberList() {
        return sqlSessionTemplate.selectList("member.getMemberlist");
    }

    /**
     * @param memberid 
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public Member getMemberDetails(String memberid) {
    	return sqlSessionTemplate.selectOne("member.findMemberById", memberid);
    }

}