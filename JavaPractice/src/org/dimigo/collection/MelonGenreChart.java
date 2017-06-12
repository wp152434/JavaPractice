package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {
	public static void main(String[] args){
		Map<String, List<Music>> map = new HashMap<>();
		List<Music> dance = new ArrayList<Music>();
		List<Music> ballade = new ArrayList<Music>();
		
		System.out.println("-- <<멜론 장르별 차트>> --");
		ballade.add(new Music("팔레트", "아이유"));
		map.put("발라드", ballade);
		dance.add(new Music("I LUV IT", "PSY"));
		dance.add(new Music("맞지?", "언니쓰"));
		map.put("댄스", dance);
		printMap(map);
		
		System.out.println("-- <<댄스 2위 곡 변경>> --");
		dance.set(1, new Music("SIGNAL", "트와이스"));
		map.put("댄스", dance);
		printMap(map);
		
		System.out.println("-- <<댄스 1위 곡 삭제>> --");
		dance.remove(0);
		map.put("댄스", dance);
		printMap(map);
		
		System.out.println("-- <<전체 리스트 삭제>> --");
		map.clear();
		printMap(map);
	}
	
	public static void printMap(Map<String, List<Music>> map){
		for(String key : map.keySet()) {
			System.out.println("["+key+"]");
			for(int i=0;i<map.get(key).size();i++)
				System.out.println(i+1+". "+map.get(key).get(i));
			System.out.println("");
		}
	}
}
