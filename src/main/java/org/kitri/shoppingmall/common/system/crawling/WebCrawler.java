package org.kitri.shoppingmall.common.system.crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WebCrawler {
	private static final int MAXLINK = 5;
	
	public static String[] dataReceive(String url, String params) {
		String convertedUTF8Param = 
			UTF8Converter.convertToUtf8(params);
		String[] webDatas = new String[MAXLINK];
		
		for(int i = 0; i < MAXLINK; i++) {
			try {
				Document doc = Jsoup.connect(url + convertedUTF8Param)
						.userAgent("Mozilla/5.0").get();
				webDatas[i] = doc.toString();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return webDatas;
	}
}
