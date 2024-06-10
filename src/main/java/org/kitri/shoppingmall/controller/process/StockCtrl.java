package org.kitri.shoppingmall.controller.process;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.kitri.shoppingmall.dto.master.Goods;
import org.kitri.shoppingmall.dto.stock.Stock;
import org.kitri.shoppingmall.service.stock.IStockSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 
 */
@Controller
public class StockCtrl {
    /**
     * 
      */
    @Autowired
    private IStockSvc IStockSvc;

    @Autowired
    private HttpSession session;
    
    /**
     * @param goods 
     * @return
     */
    public int regStock(Goods goods) {
        // TODO implement here
        return 0;
    }

    /**
     * @param goods 
     * @return
     */
    public int updateStock(Goods goods) {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public List<Stock> getStockList() {
        // TODO implement here
        return null;
    }

    /**
     * @param goodscd 
     * @return
     */
    public Stock getStockDetails(String goodscd) {
        // TODO implement here
        return null;
    }

}