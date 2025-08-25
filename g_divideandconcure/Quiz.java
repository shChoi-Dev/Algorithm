package com.mc.algorithm.g_divideandconcure;

import com.mc.algorithm.util.SortUtil;

public class Quiz {

	public static void main(String[] args) {
		//cpuCacheHit();
		q1();
		
	}

	private static void q1() {
		long a = 2;
		long b = 30;
		
		long result = power(a, b);
		System.out.println(a + "의 " + b + " 제곱은 " + result + "입니다.");
		
		long result2 = power(5,5);
		System.out.println("5의 5제곱은 " + result2 + "입니다.");
		
	}

	private static long power(long a, long b) {
		if (b == 0 ) {
			return 1;
		}
		
		long half = power(a,b /2);
		
		long result = half * half;
		
		if (b % 2 != 0) {
			result *= a;
		}
		return result;
	}

	private static void cpuCacheHit() {
		int size = 10240;
		int[][] dArr = new int[size][size];
		
		SortUtil.checkTime(() -> {
			for (int i=0; i<dArr.length; i++) {
				for (int j=0; j<dArr.length; j++) {
					dArr[i][j] = i;
				}
			}
		});
	}
	
}
