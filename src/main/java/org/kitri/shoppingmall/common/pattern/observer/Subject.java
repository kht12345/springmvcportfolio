package org.kitri.shoppingmall.common.pattern.observer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	private double price;
	private int cartno;
	private String goodscd;

	public double getPrice() {
		return price;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}
	
	public void setPrice(double price) {
		this.price = price;
		notifyAllObserver();
	}

	public int getCartno() {
		return cartno;
	}

	public void setCartno(int cartno) {
		this.cartno = cartno;
	}

	public String getGoodscd() {
		return goodscd;
	}

	public void setGoodscd(String goodscd) {
		this.goodscd = goodscd;
	}

	public void notifyAllObserver() {
		for (Observer observer : observers) {
			observer.update(price, cartno, goodscd);
		}
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}
}
