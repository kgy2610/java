package test240726.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MusicController {
	private List<Music> list = new ArrayList<>();
	
	public int addList(Music music) {
		list.add(music);
		return 1;
	}
	
	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}
	
	public List printAll() {
		for(Music music : list) {
			System.out.println(music);
		}
		return this.list;
	}
	
	public Music searchMusic(String title) {
		for(Object obj : list) {
			Music m = ((Music)obj);
			if( m.getTitle().equals(title) ){
				return m;
			}
		}
		return null;
	}
	
	public Music removeMusic(String title) {
		for(int i=0; i<list.size(); i++) {
			Music m = list.get(i);
			if(m.getTitle().equals(title)) {
				list.remove(i);
				return m;
			}
		}
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		return null;
	}
	
	public void ascTitle() {
		//Collections.sort : 컬렉션에서 정렬기능을 제공하는 메소드
		// 정렬하고싶은 컬렉션객체와 정렬기준을 정한 객체(Comparator구현한 객체)를
		// 전달하면 정렬기준에 맞춰 정렬을 수행해준다.
		Collections.sort(list, new AscTitle());
	}
	
	public void descSinger() {
		Collections.sort(list, new DescSinger());
	}
}
