package org.kitri.shoppingmall.common.utils;

import org.kitri.shoppingmall.dto.master.Department;
import org.kitri.shoppingmall.dto.master.Employee;
import org.kitri.shoppingmall.dto.master.Goods;
import org.kitri.shoppingmall.dto.master.Member;
import org.kitri.shoppingmall.dto.master.Provider;
import org.kitri.shoppingmall.dto.order.Order;
import org.kitri.shoppingmall.dto.order.WareHousing;
import org.kitri.shoppingmall.dto.sales.Cart;
import org.kitri.shoppingmall.dto.sales.Sales;
import org.kitri.shoppingmall.dto.stock.Stock;

public class AutoComplete {

	public static Object completeStart(Object object) {
		if(object instanceof Member) {
			Member member = (Member)object;
        	member.setStatus("A");
        	member.setRegdate(new Converter().todayToString());
        	return member;
		} else if(object instanceof Employee) {
			Employee employee = (Employee)object;
			employee.setRegdate(new Converter().todayToString());
			employee.setIsadmin("N");  		// 관리자 여부
			return employee;
		} else if(object instanceof Department) {
			Department department = (Department)object;
			department.setRegdate(new Converter().todayToString());
			return department;
		} else if(object instanceof Goods) {
			Goods goods = (Goods)object;
			goods.setRegdate(new Converter().todayToString());
			return goods;
		} else if(object instanceof Provider) {
			Provider provider = (Provider)object;
			provider.setRegdate(new Converter().todayToString());
			return provider;
		} else if(object instanceof Order) {
			Order order = (Order)object;
			order.setRegdate(new Converter().todayToString());
			order.setIsconfirm("N"); 		// 승인여부
			return order;		
		} else if(object instanceof Cart) {
			Cart cart = (Cart)object;
			cart.setRegdate(new Converter().todayToString());
			return cart;
		} else if(object instanceof Sales) {
			Sales sales = (Sales)object;
			sales.setRegdate(new Converter().todayToString());
			sales.setPaytype("C"); 			// C: 장바구니, D: 직접구매
			return sales;
		} else if(object instanceof WareHousing) {
			WareHousing wareHousing = (WareHousing)object;
			wareHousing.setRegdate(new Converter().todayToString());
			wareHousing.setIsconfirm("N");  // 승인여부
			return wareHousing;
		} else if(object instanceof Stock) {
			Stock stock = (Stock)object;
			stock.setRegdate(new Converter().todayToString());
			stock.setUpdatedate(new Converter().todayToString());
			return stock;
		}

		return null; 
		
	}
}
