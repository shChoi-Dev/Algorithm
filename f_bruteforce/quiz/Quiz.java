package com.mc.algorithm.f_bruteforce.quiz;

public class Quiz {
	
	public static void main(String[] args) {
		q1(5);
		q2();
	}

	private static void q2() {
		// TODO Auto-generated method stub
		
	}

	private static void q1(int i) {
		int count = 0;
		int num = 665;
		
		while (count < i) {
			num++;
			
			if (String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println("입력값 : " + count);
		System.out.println("결과값 : " + num);
	}
	
}
