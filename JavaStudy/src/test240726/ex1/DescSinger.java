package test240726.ex1;

import java.util.Comparator;

public class DescSinger implements Comparator<Music>{
	@Override
	public int compare(Music o1, Music o2) {
		//compareTo -> 나자신과 비교해서 크면 1 작으면 -1 동일하면 0
		return o1.getSinger().compareTo(o2.getSinger());
	}
}
