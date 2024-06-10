package org.kitri.shoppingmall.dao.stock;

import java.util.List;

import org.kitri.shoppingmall.dto.master.Goods;
import org.kitri.shoppingmall.dto.stock.Stock;

/**
 * 
 */
public interface IStockDao {


    /**
     * @param goods 
     * @return
     */
    public int regStock(Goods goods);

    /**
     * @param goods 
     * @return
     */
    public int updateStock(Goods goods);

    /**
     * @return
     */
    public List<Stock> getStockList();

    /**
     * @param goodscd 
     * @return
     */
    public Stock getStockDetails(String goodscd);

}