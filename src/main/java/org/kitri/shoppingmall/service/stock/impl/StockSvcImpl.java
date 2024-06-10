package org.kitri.shoppingmall.service.stock.impl;

import java.util.List;

import org.kitri.shoppingmall.dao.stock.IStockDao;
import org.kitri.shoppingmall.dto.master.Goods;
import org.kitri.shoppingmall.dto.stock.Stock;
import org.kitri.shoppingmall.service.stock.IStockSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class StockSvcImpl implements IStockSvc {

    /**
     * Default constructor
     */
    public StockSvcImpl() {
    }

    /**
     * 
      */
    @Autowired
    private IStockDao stockDao;


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