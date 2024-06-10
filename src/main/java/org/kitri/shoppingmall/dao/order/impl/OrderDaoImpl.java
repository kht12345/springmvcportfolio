package org.kitri.shoppingmall.dao.order.impl;

import java.util.List;

import org.kitri.shoppingmall.dao.order.IOrderDao;
import org.kitri.shoppingmall.dto.order.Order;
import org.kitri.shoppingmall.dto.order.OrderDetails;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 
 */
@Repository
public class OrderDaoImpl implements IOrderDao {

    /**
     * 
     */
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * @param order 
     * @return
     */
    @Override
    public int regOrder(Order order) {
        // TODO implement here
        return 0;
    }

    /**
     * @param order 
     * @return
     */
    @Override
    public int updateOrder(Order order) {
        // TODO implement here
        return 0;
    }

    /**
     * @param order 
     * @return
     */
    @Override
    public boolean confirmOrder(Order order) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    @Override
    public List<Order> getOrderList() {
        // TODO implement here
        return null;
    }

    /**
     * @param orderno 
     * @return
     */
    @Override
    public OrderDetails getOrderDetails(int orderno) {
        // TODO implement here
        return null;
    }

    /**
     * @param date 
     * @return
     */
    @Override
    public List<Order> getOrderByDate(String date) {
        // TODO implement here
        return null;
    }


}