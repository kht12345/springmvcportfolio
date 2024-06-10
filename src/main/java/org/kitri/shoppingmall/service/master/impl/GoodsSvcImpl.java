package org.kitri.shoppingmall.service.master.impl;

import java.util.List;

import org.kitri.shoppingmall.dao.master.IGoodsDao;
import org.kitri.shoppingmall.dto.master.Goods;
import org.kitri.shoppingmall.service.master.IGoodsSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class GoodsSvcImpl implements IGoodsSvc {

    /**
     * 
     */
    @Autowired
    private IGoodsDao goodsDao;

    /**
     * @param goods 
     * @return
     */
    @Override
    public int regGoods(Goods goods) {
        // TODO implement here
        return 0;
    }

    /**
     * @param goods 
     * @return
     */
    @Override
    public int updateGoods(Goods goods) {
        return goodsDao.updateGoods(goods);
    }

    /**
     * @return
     */
    @Override
    public List<Goods> getGoodsList() {
    	return goodsDao.getGoodsList();
    }

    /**
     * @param goodscd 
     * @return
     */
    @Override
    public Goods getGoodsDetails(String goodscd) {
        return goodsDao.getGoodsDetails(goodscd);
    }

    /**
     * @param goodscd 
     * @return
     */
    @Override
    public List<Goods> getGoodsListBySearch(String goodscd) {
        return goodsDao.getGoodsListBySearch(goodscd);
    }
}