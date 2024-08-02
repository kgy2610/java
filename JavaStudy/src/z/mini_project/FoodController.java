package z.mini_project;

import test240717.object1.CookBook;

public class FoodController {
	private Person per = null;
	private Food[] fList = new Food[6];
	
	public FoodController() {
		super();
		fList[0] = new ChFood("짜장면", 8000, "중식", true);
		fList[1] = new KoFood("비빔밥", 7000, "한식", true);
		fList[2] = new KoFood("불고기", 8000, "한식", true);
		fList[3] = new JpFood("초밥", 12000, "일식", true);
		fList[4] = new ChFood("마라탕", 9000, "중식", true);
		fList[5] = new JpFood("메밀소바", 7000, "일식", true);
	}
	
	public void insertPerson(Person per) {
		this.per = per;
	}
	
	public Person myInfo() {
		return this.per;
	}
	
	public Food[] selectAll() {
		return this.fList;
	}
	
	// 검색기능
	public Food[] searchFood(String word) {
		Food[] tmpFoodList = new Food[6];
		// 입력된 단어와 일치하는 메뉴를 찾을 경우, tmpFoodList 배열에 넣음
		
		int index = 0;
		
		for(int i=0; i<fList.length; i++) {
			if(fList[i] == null) {
				break;
			}
			String fname = fList[i].getFname();
			String fkind = fList[i].getFKind();
			if(fname.indexOf(word) != -1) {
				tmpFoodList[index] = fList[i];
				index++;
			}else if(fkind.indexOf(word) != -1) {
				tmpFoodList[index] = fList[i];
				index++;
			}
		}
		return tmpFoodList;
	}
	
	public int buyFood(int index) {
		int result = 0;
		Food f = fList[index];
		
		if(f instanceof ChFood) {
			if(((ChFood) f).isCoupon()) {
				this.per.setCHcouponCount(this.per.getCHcouponCount() + 1);
				result = 1;
			}
		}else if(f instanceof JpFood) {
			if(((JpFood) f).isCoupon()) {
				this.per.setJPcouponCount(this.per.getJPcouponCount() + 1);
				result = 2;
			}
		}else if(f instanceof KoFood) {
			if(((KoFood) f).isCoupon()) {
				this.per.setKOcouponCount(this.per.getKOcouponCount() + 1);
				result = 3;
			}
		}
		return result;
	}
}
