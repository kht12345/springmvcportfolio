package org.kitri.shoppingmall.service.sales.impl;

import java.util.List;

import org.kitri.shoppingmall.dao.sales.IBuyDao;
import org.kitri.shoppingmall.dto.sales.Sales;
import org.kitri.shoppingmall.dto.sales.SalesDetails;
import org.kitri.shoppingmall.service.sales.IBuySvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class BuySvcImpl implements IBuySvc {

    /**
     * Default constructor
     */
    public BuySvcImpl() {
    }

    /**
     * 
     */
    @Autowired
    public IBuyDao buyDao;

    /**
     * @param salesno 
     * @return
     */
    @Override
    public List<Sales> getSalesList(int salesno) {
        // TODO implement here
        return null;
    }

    /**
     * @param salesno 
     * @return
     */
    @Override
    public SalesDetails getSalesDetails(int salesno) {
        // TODO implement here
        return null;
    }

    /**
     * @param salesno 
     * @return
     */
    @Override
    public boolean buyOk(int salesno) {
        // TODO implement here
        return false;
    }

    /**
     * 
     */
    @Override
    public void buyCancel() {
        // TODO implement here
    }
}