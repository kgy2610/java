package test240729.object1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class LotteryController {
	private HashSet lottery = new HashSet();
	private HashSet win = new HashSet();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		boolean isRemove = lottery.remove(l);
		if(isRemove && win != null) {
			win.remove(l);
		}
		return isRemove;
	}
	
	public HashSet winObject() {
		if(lottery.size() < 4) {
			return null;
		}
		
		// 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록에 넣는 메소드
		// 랜덤으로 뽑기위해 lottery를 ArrayList에 담고,
		List<Lottery> list = new ArrayList<>();
		list.addAll(lottery);
		
		// 당첨자 4명을 뽑기 위한 반복 4번
		while(win.size() < 4) { // 사이즈 확인해서 4명이 하면 계속 진행
			int rand = (int)(Math.random() * list.size()); // 랜덤 발생
			win.add(list.get(rand)); // 랜덤 자리에 있는 사람을 당첨 목록에 추가
		}
		return win;
	}
	
	public TreeSet sortedWinObject() {
		TreeSet sortedWinSet = new TreeSet(new SortedLottery());
		sortedWinSet.addAll(win);
		return sortedWinSet;
	}
	
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}
}
