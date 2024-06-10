package org.kitri.shoppingmall.dao.stock.impl;

import java.util.List;

import org.kitri.shoppingmall.dao.stock.IStockDao;
import org.kitri.shoppingmall.dto.master.Goods;
import org.kitri.shoppingmall.dto.stock.Stock;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 */
@Repository
public class StockDaoImpl implements IStockDao {

    /**
     * 
     */
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    /**
     * @param goods 
     * @return
     */
    @Override
    public int regStock(Goods goods) {
        // TODO implement here
        return 0;
    }

    /**
     * @param goods 
     * @return
     */
    @Override
    public int updateStock(Goods goods) {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    @Override
    public List<Stock> getStockList() {
        // TODO implement here
        return null;
    }

    /**
     * @param goodscd 
     * @return
     */
    @Override
    public Stock getStockDetails(String goodscd) {
        // TODO implement here
        return null;
    }

}