package com.mc.algorithm.d_datastructure.stack;

import java.util.Stack;

public class StackQuiz {
	public boolean isPair(String str) {
		Stack<Character> stack = new Stack<>();
		
		for (char c : str.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}
			else if(c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				
				char openBarcket = stack.pop();
				
				if ( c == ')' && openBarcket != '(') {
					return false;
				}
				if ( c == '}' && openBarcket != '{') {
					return false;
				}
				if ( c == ']' && openBarcket != '[') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		StackQuiz sq = new StackQuiz();
		
		String q1 = "()[]";
        String q2 = "([)]";
        String q3 = "{}()[]";
        String q4 = "{()[]()}";
        String q5 = "{([}])}";
        
        System.out.println(q1 + " => " + sq.isPair(q1));
        System.out.println(q2 + " => " + sq.isPair(q2));
        System.out.println(q3 + " => " + sq.isPair(q3));
        System.out.println(q4 + " => " + sq.isPair(q4));
        System.out.println(q5 + " => " + sq.isPair(q5));
	}
	
}
