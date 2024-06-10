package org.kitri.shoppingmall.common.pattern.state;

import org.springframework.stereotype.Component;

@Component
public class GoodsState implements State {

	@Override
	public void doAction(Context context) {
		context.setState(this);
	}
	
	@Override
	public String toString() {
		return "G";
	}
}
