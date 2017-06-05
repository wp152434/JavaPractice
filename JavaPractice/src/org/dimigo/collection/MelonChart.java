package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

public class MelonChart {

	public static void main(String[] args){
		List<Music> list = new ArrayList<Music>();
		System.out.println("--<<멜론 차트>>--");
		list.add(new Music("I LUV IT", "싸이"));
		list.add(new Music("맞지?", "언니쓰"));
		printList(list);
		System.out.println("--<<2위 곡 추가>>--");
		list.add(1, new Music("SIGNAL", "트와이스"));
		printList(list);
		System.out.println("--<<3위 곡 변경>>--");
		list.set(2, new Music("팔레트", "아이유"));
		printList(list);
		System.out.println("--<<2위 곡 삭제>>--");
		list.remove(1);
		printList(list);
		list.clear();
		System.out.println("--<<전체 리스트 삭제>>--");
		printList(list);
	}
	
	public static void printList(List<Music> list){
		int i=0;
		for(Music sing : list){
			i++;
			System.out.println(i+". "+sing.toString());
		}
		System.out.println("");
		return;
	}
}
