package org.kitri.shoppingmall.common.pattern.state;

import org.springframework.stereotype.Component;

@Component
public class Context {
	private State state;
	
	public Context() {
		state = null;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
}
