package org.kitri.shoppingmall.dao.master;

import java.util.List;

import org.kitri.shoppingmall.dto.master.Member;

/**
 * 
 */
public interface IMemberDao {


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
     * 
     */
    public void login();

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