package org.kitri.shoppingmall.common.pattern.observer;

public abstract class Observer {
	protected Subject subject;

	public abstract void update(double price, int cartno, String goodscd);

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
}
