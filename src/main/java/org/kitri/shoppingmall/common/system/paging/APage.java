package org.kitri.shoppingmall.common.system.paging;

import java.util.List;

public abstract class APage {
	protected static int displayItems = 5;
	protected static int startPage = 1;
	protected static int curPage = 1;
	protected static int totalPage = 0;
	protected static int remain = 0;
	protected static boolean isInit = false;
	protected static int startItemIdx = 0;
	protected static int endItemIdx = 0;
	protected static int totalItemCnt = 0;
	
	public int getDisplayItems() { return displayItems; }
	public int getCurPage() { return curPage; }
	public int getTotalPage() { return totalPage; }
	public int getRemainItem() { return remain; } 
	public int getStartItemIdx() { return startItemIdx; } 
	public int getEndItemIdx() { return endItemIdx; } 
	public int getTotalItemCnt() { return totalItemCnt; }
	
	public static void setCurPage() {
		curPage = startPage;
	}
	
	public static int moveCurPage(int type) {
		if(type == 0) {
			curPage = startPage;
		} else if(type == 1) {  // 다음 페이지
			if(curPage >= totalPage) {
				curPage = totalPage;
			} else {
				curPage += 1;
			}
		} else if(type == 2) {  // 이전 페이지
			if(curPage == 1) {
				curPage = 1;
			} else {
				curPage -= 1;
			}
		}
		
		return curPage;
	}

	public static void setDisplayItems(int paramdisplayItems) {
		displayItems = paramdisplayItems;
	}
	
	public static void setTotalPage(int paramtotalPage) { 
		totalPage = paramtotalPage; 
	}
	
	public static void setRemainItem(int paramremain) {
		remain = paramremain;
	}
	
	 
	public static void setTotalItemCnt(int paramItemCnt) {
		totalItemCnt = paramItemCnt;
	}
	
	public static void setStartItemIdx() {
		startItemIdx = (curPage * displayItems) - displayItems + 1;
	}
	
	public static void setEndItemIdx() {
		if(curPage == totalPage) {
			if(remain == 0) {
				endItemIdx = totalItemCnt;
			} else {
				endItemIdx = curPage * displayItems - (displayItems  - remain);
			}
		} else {
			endItemIdx = curPage * displayItems;
		}		
	}
	
	public abstract void initPageConfig(List<Object> objectlist);
	public abstract List<Object> movePageProc(int type, List<Object> objects);
}
