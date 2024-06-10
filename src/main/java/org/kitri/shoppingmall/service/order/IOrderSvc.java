package org.kitri.shoppingmall.service.order;

import java.util.List;

import org.kitri.shoppingmall.dto.order.Order;
import org.kitri.shoppingmall.dto.order.OrderDetails;

/**
 * 
 */
public interface IOrderSvc {

    /**
     * @param order 
     * @return
     */
    public int regOrder(Order order);

    /**
     * @param order 
     * @return
     */
    public int updateOrder(Order order);

    /**
     * @param order 
     * @return
     */
    public boolean confirmOrder(Order order);

    /**
     * @return
     */
    public List<Order> getOrderList();

    /**
     * @param orderno 
     * @return
     */
    public OrderDetails getOrderDetails(int orderno);

    /**
     * @param date 
     * @return
     */
    public List<Order> getOrderByDate(String date);

}