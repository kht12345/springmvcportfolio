package org.kitri.shoppingmall.dao.master.impl;

import java.util.List;

import org.kitri.shoppingmall.dao.master.IGoodsDao;
import org.kitri.shoppingmall.dto.master.Goods;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 */
@Repository
public class GoodsDaoImpl implements IGoodsDao {

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
        return sqlSessionTemplate.update("goods.updategoods", goods);
    }

    /**
     * @return
     */
    @Override
    public List<Goods> getGoodsList() {
        return sqlSessionTemplate.selectList("goods.findgoodslist");
    }

    /**
     * @param goodscd 
     * @return
     */
    @Override
    public Goods getGoodsDetails(String goodscd) {
        return sqlSessionTemplate.selectOne("goods.findgoodsbygoodscd", goodscd);
    }

    /**
     * @param goodscd 
     * @return
     */
    @Override
    public List<Goods> getGoodsListBySearch(String goodscd) {
        return sqlSessionTemplate.selectList("goods.findgoodsbysearch", goodscd);
    }

 }