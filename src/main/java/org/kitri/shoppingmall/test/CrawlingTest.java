package org.kitri.shoppingmall.test;

import org.kitri.shoppingmall.common.system.crawling.WebCrawler;

public class CrawlingTest {
	public static void main(String[] args) {
//		String searchStr = "김형태";
//		
//		String str = UTF8Converter.convertToUtf8(searchStr);
//		
//		System.out.println(str);
		
		String url = "https://www.google.com/search?q=";
		String params = "개발자";
		
		String[] receiveDatas = 
			WebCrawler.dataReceive(url, params);
		for(String receiveData : receiveDatas) {
			System.out.println(receiveData);
		}
		
	}
}
