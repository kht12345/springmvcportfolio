package org.kitri.shoppingmall.controller.process;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.kitri.shoppingmall.dto.order.Order;
import org.kitri.shoppingmall.dto.order.OrderDetails;
import org.kitri.shoppingmall.service.order.IOrderSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 
 */
@Controller
public class OrderCtrl {

    /**
     * 
      */
    @Autowired
    private IOrderSvc orderSvc;

    /**
     * 
      */
    @Autowired
    private HttpSession session;
    
    /**
     * @param order 
     * @return
     */
    public int regOrder(Order order) {
        // TODO implement here
        return 0;
    }

    /**
     * @param order 
     * @return
     */
    public int updateOrder(Order order) {
        // TODO implement here
        return 0;
    }

    /**
     * @param order 
     * @return
     */
    public boolean confirmOrder(Order order) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public List<Order> getOrderList() {
        // TODO implement here
        return null;
    }

    /**
     * @param orderno 
     * @return
     */
    public OrderDetails getOrderDetails(int orderno) {
        // TODO implement here
        return null;
    }

    /**
     * @param date 
     * @return
     */
    public List<Order> getOrderByDate(String date) {
        // TODO implement here
        return null;
    }

}