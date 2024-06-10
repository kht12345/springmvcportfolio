package org.kitri.shoppingmall.controller.process;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.kitri.shoppingmall.dto.order.WareHousing;
import org.kitri.shoppingmall.service.order.IWareHousingSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 
 */
@Controller
public class WareHousingCtrl {
    /**
     * 
      */
    @Autowired
    private IWareHousingSvc warehousingSvc;

    @Autowired
    private HttpSession session;
    
    /**
     * @return
     */
    public List<WareHousing> getInList() {
        // TODO implement here
        return null;
    }

    /**
     * @param inno 
     * @return
     */
    public WareHousing getInDetails(int inno) {
        // TODO implement here
        return null;
    }

    /**
     * @param inno 
     * @param goodscd 
     * @param inquantity 
     * @return
     */
    public int updateInDetails(int inno, String goodscd, int inquantity) {
        // TODO implement here
        return 0;
    }

    /**
     * @param inno 
     * @return
     */
    public boolean confirmIn(int inno) {
        // TODO implement here
        return false;
    }

}