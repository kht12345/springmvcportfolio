package org.kitri.shoppingmall.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 */
public class Converter {

    /**
     * Default constructor
     */
    public Converter() {
    }

    /**
     * @param params 
     * @return
     */
    public Object ObjectToValues(String...params) {
        // TODO implement here
        return null;
    }

    /**
     * @param obj 
     * @return
     */
    public String ValuesToObject(Object obj) {
        // TODO implement here
        return "";
    }

    /**
     * @param obj 
     * @return
     */
    public String todayToString() {
    	SimpleDateFormat simpleDateFormat = 
    		new SimpleDateFormat("yyyyMMdd");
        return simpleDateFormat.format(new Date()).toString();
    }
}





