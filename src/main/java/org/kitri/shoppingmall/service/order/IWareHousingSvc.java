package org.kitri.shoppingmall.service.order;

import java.util.List;

import org.kitri.shoppingmall.dto.order.WareHousing;

/**
 * 
 */
public interface IWareHousingSvc {

    /**
     * @return
     */
    public List<WareHousing> getInList();

    /**
     * @param inno 
     * @return
     */
    public WareHousing getInDetails(int inno);

    /**
     * @param inno 
     * @param goodscd 
     * @param inquantity 
     * @return
     */
    public int updateInDetails(int inno, String goodscd, int inquantity);

    /**
     * @param inno 
     * @return
     */
    public boolean confirmIn(int inno);

}