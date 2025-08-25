package com.mc.algorithm.g_divideandconcure;

import java.util.LinkedHashMap;
import java.util.Map;

public class GreedyQuiz {
	
	public static void main(String[] args) {
		int input = 3465;
		Map<Integer, Integer> result = getCoinCombination(input);
		System.out.println(result);
	}
	
	public static Map<Integer, Integer> getCoinCombination(int amount) {
		int[] coins = {500,100,50,10,1};
		Map<Integer, Integer> result = new LinkedHashMap();
		
		for(int coin : coins) {
			int count = amount / coin;
			if(count > 0) {
				result.put(coin, count);
			}
			amount %= coin;
		}
		return result;
	}
}
