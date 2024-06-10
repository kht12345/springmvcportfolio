package org.kitri.shoppingmall.dao.order;

import java.util.List;

import org.kitri.shoppingmall.dto.order.WareHousing;

/**
 * 
 */
public interface IWareHousingDao {




    /**
     * @return
     */
    public List<WareHousing> getInList();

    /**
     * @param inno 
     * @param goodscd 
     * @param inquantity 
     * @return
     */
    public WareHousing getInDetails(int inno, String goodscd, int inquantity);

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