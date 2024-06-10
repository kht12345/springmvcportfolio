package org.kitri.shoppingmall.service.master;

import java.util.List;

import org.kitri.shoppingmall.dto.master.Member;

/**
 * 
 */
public interface IMemberSvc {



    /**
     * @param member 
     * @return
     */
    public int regMember(Member member);

    /**
     * @param member 
     * @return
     */
    public int updateMember(Member member);

    /**
     * @param memberid 
     * @return
     */
    public Member getMyInfo(String memberid);

    /**
     * @return
     */
    public List<Member> getMemberList();

    /**
     * @param memberid 
     * @return
     */
    public Member getMemberDetails(String memberid);

}