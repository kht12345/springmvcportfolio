package org.kitri.shoppingmall.common.system.paging;

import java.util.ArrayList;
import java.util.List;

import org.kitri.shoppingmall.dto.master.Member;
import org.springframework.stereotype.Component;

@Component
public class PageImpl extends APage {

	@Override
	public void initPageConfig(List<Object> objectlist) {
		if(!isInit) {
			int remain = 0;
			int totalpage = 0;
			Object testObject = objectlist.get(0);
			if(testObject instanceof Member) {
				remain = objectlist.size() % displayItems;
				
				if(remain == 0) {
					totalpage = objectlist.size() / displayItems;	
				} else {
					totalpage = (objectlist.size() / displayItems) + 1;	
				}
				setTotalPage(totalpage);
				setTotalItemCnt(objectlist.size());
				setCurPage();
				setStartItemIdx();
				setEndItemIdx();
				setRemainItem(remain);
			}
			isInit = true;
		}
	}

	@Override
	public List<Object> movePageProc(int type, List<Object> obList) {
		List<Object> objList = null;
		objList = new ArrayList<Object>();
			
		curPage = moveCurPage(type);
		setStartItemIdx();
		setEndItemIdx();
		int sidx = getStartItemIdx();
		int eidx = getEndItemIdx();
		List<Object> memList = new ArrayList<Object>();
		if(obList.get(0) instanceof Member) {
			for(int i = sidx -1; i < eidx; i++) {
				memList.add((Member)obList.get(i));
			}
				
			objList.add(String.valueOf(curPage));
			objList.add(memList);
		}
		
		return objList;
	}
}
