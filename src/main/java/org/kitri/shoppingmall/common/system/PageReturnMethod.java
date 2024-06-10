package org.kitri.shoppingmall.common.system;

import org.springframework.stereotype.Component;

@Component
public class PageReturnMethod {

	public String forwardPage(String servletContext, String... params) {
		String forwardString = "forward:" + servletContext + "?";
		for(String param : params) {
			forwardString += param + "&";
		}
		if(params.length > 1) {
			return forwardString.substring(0, forwardString.length() - 1);
		} else {
			return forwardString;
		}
	}
	
	public String redirectPage(String servletContext, String... params) {
		String redirectString = "redirect:" + servletContext + "?";
		for(String param : params) {
			redirectString += param + "&";
		}
		
		if(params.length > 1) {
			return redirectString.substring(0, redirectString.length() - 1);
		} else {
			return redirectString;
		}
	}
}
