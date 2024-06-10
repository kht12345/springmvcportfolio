package org.kitri.shoppingmall.service.master;

import java.util.List;

import org.kitri.shoppingmall.dto.master.Goods;

/**
 * 
 */
public interface IGoodsSvc {

    /**
     * @param goods 
     * @return
     */
    public int regGoods(Goods goods);

    /**
     * @param goods 
     * @return
     */
    public int updateGoods(Goods goods);

    /**
     * @return
     */
    public List<Goods> getGoodsList();

    /**
     * @param goodscd 
     * @return
     */
    public Goods getGoodsDetails(String goodscd);

    /**
     * @param goodscd 
     * @return
     */
    public List<Goods> getGoodsListBySearch(String goodscd);

}