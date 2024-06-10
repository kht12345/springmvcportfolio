package org.kitri.shoppingmall.dao.sales;

import java.util.List;

import org.kitri.shoppingmall.dto.sales.Sales;

/**
 * 
 */
public interface IBuyDao {



    /**
     * @param salesno 
     * @return
     */
    public List<Sales> getSalesList(int salesno);

    /**
     * @param salesno 
     * @return
     */
    public boolean buyOk(int salesno);

    /**
     * 
     */
    public void buyCancel();

}