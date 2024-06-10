package org.kitri.shoppingmall.common.utils.login;

import org.kitri.shoppingmall.dto.master.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class LoginSvc {

    /**
     * 
     */
    @Autowired
    private LoginDao loginDao;

    public Member getMemberDetails(Member member) {
    	return loginDao.getMemberDetails(member);
    }

}