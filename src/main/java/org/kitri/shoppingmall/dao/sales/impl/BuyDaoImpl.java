package org.kitri.shoppingmall.dao.sales.impl;

import java.util.List;

import org.kitri.shoppingmall.dao.sales.IBuyDao;
import org.kitri.shoppingmall.dto.sales.Sales;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 */
@Repository
public class BuyDaoImpl implements IBuyDao {

    /**
     * Default constructor
     */
    public BuyDaoImpl() {
    }

    /**
     * 
     */
    @Autowired
    public SqlSessionTemplate sqlSessionTemplate;

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