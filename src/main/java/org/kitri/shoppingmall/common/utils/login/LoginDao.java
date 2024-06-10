package org.kitri.shoppingmall.common.utils.login;

import org.kitri.shoppingmall.dto.master.Member;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 */
@Repository
public class LoginDao {

	/**
     * 
     */
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    @Transactional(readOnly = true)
    public Member getMemberDetails(Member member) {
    	return sqlSessionTemplate.selectOne("login.findMemberbyidandpwd", member);
    }

}