package com.mc.algorithm.d_datastructure.stack;

import java.util.HashMap;

import com.mc.algorithm.d_datastructure.map._HashMap;

public class Run {

	public static void main(String[] args) {
		System.out.println(isPair("{(멀티)[캠]{퍼}(스)}")); //true
		System.out.println(isPair("{{{{{([(멀티)[캠]{퍼}(스)"));
		System.out.println(isPair("{{(]]멀티)[캠]{퍼}(스)))))"));
		System.out.println('(' + ')');
		System.out.println('{' + '}');
		System.out.println('[' + ']');
	}
	
	private static boolean isPair(String text) {
		
//		HashMap<Character, Character> pairMap = new HashMap<Character, Character>();
//		pairMap.put('(', ')');
//		pairMap.put('{', '}');
//		pairMap.put('[', ']');
		
		_Stack<Character> stack = new _Stack<Character>();
		
		for (char ch : text.toCharArray()) {
			
			if("({[".contains(String.valueOf(ch))) {
				stack.push(ch);
				continue;
			};
			
			if(!")}]".contains(String.valueOf(ch))) continue;
			if(stack.isEmpty()) return false;
			int k = stack.pop();
			if(ch + k != 81 && ch + k != 184 && ch + k != 248) return false;
			
//			char opener = stack.pop();
//			if(ch != pairMap.get(opener)) return false;
		}
		
		return stack.isEmpty();
	}

}
