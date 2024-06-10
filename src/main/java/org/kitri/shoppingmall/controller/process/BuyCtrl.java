package org.kitri.shoppingmall.controller.process;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.kitri.shoppingmall.dto.sales.Sales;
import org.kitri.shoppingmall.dto.sales.SalesDetails;
import org.kitri.shoppingmall.service.sales.IBuySvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 
 */
@Controller
public class BuyCtrl {
    /**
     * 
     */
    @Autowired
    private IBuySvc buySvc;

    @Autowired
    private HttpSession session;
    
    /**
     * @param salesno 
     * @return
     */
    public List<Sales> getSalesList(int salesno) {
        // TODO implement here
        return null;
    }

    /**
     * @param salesno 
     * @return
     */
    public SalesDetails getSalesDetails(int salesno) {
        // TODO implement here
        return null;
    }

    /**
     * @param salesno 
     * @return
     */
    public boolean buyOk(int salesno) {
        // TODO implement here
        return false;
    }

    /**
     * 
     */
    public void buyCancel() {
        // TODO implement here
    }

}