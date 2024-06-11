package org.kitri.shoppingmall.common.system.crawling;

import java.io.UnsupportedEncodingException;

public class UTF8Converter {

	public static String convertToUtf8(String searchStr) {
		String targetStr = null;
		StringBuilder sb = new StringBuilder();
		for (int i = 0, j = 1; i < searchStr.length(); i++, j++) {
			targetStr = searchStr.substring(i, j);
			if (targetStr.matches("[ㄱ-ㅎㅏ-ㅣ가-힣]+")) {
				try {
					byte[] strbytes = targetStr.getBytes("UTF-8");
					for(byte strbyte : strbytes) {
						sb.append("%" + String.format("%x", strbyte).toUpperCase());
					}
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			} else if(targetStr.equals(" ")) {
				sb.append("+");
			} else {
				sb.append(targetStr);
			}
		}
		
		return sb.toString();
	}

}
