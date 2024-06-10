package org.kitri.shoppingmall.service.order.impl;

import java.util.List;

import org.kitri.shoppingmall.dao.order.IWareHousingDao;
import org.kitri.shoppingmall.dto.order.WareHousing;
import org.kitri.shoppingmall.service.order.IWareHousingSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class WareHousingSvcImpl implements IWareHousingSvc {

    /**
     * Default constructor
     */
    public WareHousingSvcImpl() {
    }

    /**
     * 
      */
    @Autowired
    private IWareHousingDao wareHousingDao;



    /**
     * @return List<WareHousing>
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
     * @return WareHousing
     */
    @Override
	public WareHousing getInDetails(int inno) {
		// TODO Auto-generated method stub
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