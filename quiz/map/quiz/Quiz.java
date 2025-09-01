package a_algorithm.map.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Quiz {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(q1("multicampus")));
		
	}
	
	private static Character[] q1(String text) {
		List<Character> list = new ArrayList<>();
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for (Character character : text.toCharArray()) {
			if(map.containsKey(character)) {
				map.put(character, map.get(character) + 1);
				continue;
			}
			
			map.put(character, 1);
		}
		
		int max = 1;
		
		for(Integer i : map.values()) {
			if(i > max) {
				max = i;
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == max) {
				list.add(entry.getKey());
			}
		}
		
		return list.toArray(new Character[list.size()]);
	}
}
