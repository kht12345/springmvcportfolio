package org.kitri.shoppingmall.dao.order.impl;

import java.util.List;

import org.kitri.shoppingmall.dao.order.IWareHousingDao;
import org.kitri.shoppingmall.dto.order.WareHousing;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 */
@Repository
public class WareHousingDaoImpl implements IWareHousingDao {

    /**
     * 
     */
	@Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * @return
     */
    @Override
    public List<WareHousing> getInList() {
        // TODO implement here
        return null;
    }

    /**
     * @param inno 
     * @param goodscd 
     * @param inquantity 
     * @return
     */
    @Override
    public WareHousing getInDetails(int inno, String goodscd, int inquantity) {
        // TODO implement here
        return null;
    }

    /**
     * @param inno 
     * @param goodscd 
     * @param inquantity 
     * @return
     */
    @Override
    public int updateInDetails(int inno, String goodscd, int inquantity) {
        // TODO implement here
        return 0;
    }

    /**
     * @param inno 
     * @return
     */
    @Override
    public boolean confirmIn(int inno) {
        // TODO implement here
        return false;
    }
}