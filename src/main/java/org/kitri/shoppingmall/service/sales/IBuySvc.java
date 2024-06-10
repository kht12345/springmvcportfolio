package org.kitri.shoppingmall.service.sales;

import java.util.List;

import org.kitri.shoppingmall.dto.sales.Sales;
import org.kitri.shoppingmall.dto.sales.SalesDetails;

/**
 * 
 */
public interface IBuySvc {

    /**
     * @param salesno 
     * @return
     */
    public List<Sales> getSalesList(int salesno);

    /**
     * @param salesno 
     * @return
     */
    public SalesDetails getSalesDetails(int salesno);

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